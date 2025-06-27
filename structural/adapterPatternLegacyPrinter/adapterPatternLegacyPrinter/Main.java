package adapterPatternLegacyPrinter;

import adapterPatternLegacyPrinter.adapters.OldPrinterAdapter;
import adapterPatternLegacyPrinter.interfaces.ModernPrinter;
import adapterPatternLegacyPrinter.legacy.OldPrinter;

public class Main {
    public static void main(String[] args) {
        // Using a legacy printer in a modern system
        OldPrinter oldPrinter = new OldPrinter();
        ModernPrinter adapter = new OldPrinterAdapter(oldPrinter);

        System.out.println("Sending print job from modern system...");
        adapter.print("Print this document");
    }
}