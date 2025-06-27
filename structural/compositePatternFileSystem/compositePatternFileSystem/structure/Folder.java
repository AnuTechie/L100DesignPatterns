package compositePatternFileSystem.structure;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addItem(FileSystemItem item) {
        items.add(item);
    }

    @Override
    public void showStructure() {
        System.out.println("Folder: " + name);
        for (FileSystemItem item : items) {
            item.showStructure();
        }
    }

    @Override
    public int getSize() {
        int total = 0;
        for (FileSystemItem item : items) {
            total += item.getSize();
        }
        return total;
    }
}