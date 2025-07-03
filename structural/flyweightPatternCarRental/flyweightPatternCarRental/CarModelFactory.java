package flyweightPatternCarRental;

import java.util.HashMap;
import java.util.Map;

public class CarModelFactory {
    private static final Map<String, CarModel> modelMap = new HashMap<>();

    public static CarModel getCarModel(String modelName, String transmission, String fuelType, int engineCC) {
        String key = modelName + "-" + transmission + "-" + fuelType + "-" + engineCC;
        if (!modelMap.containsKey(key)) {
            modelMap.put(key, new CarModel(modelName, transmission, fuelType, engineCC));
        }
        return modelMap.get(key);
    }
}