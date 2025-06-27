package adapterPatternLegacyPrinter.adapters;

import adapterPatternLegacyPrinter.interfaces.ModernPrinter;
import adapterPatternLegacyPrinter.legacy.OldPrinter;

public class OldPrinterAdapter implements ModernPrinter {
    private OldPrinter oldPrinter;

    public OldPrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }

    @Override
    public void print(String text) {
        System.out.println("Adapting modern print call to legacy printer.");
        oldPrinter.oldPrint();
    }
}