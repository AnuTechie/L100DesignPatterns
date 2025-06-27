package compositePatternFileSystem.structure;

public class File implements FileSystemItem {
    private String name;
    private int size; // in KB

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showStructure() {
        System.out.println("File: " + name + " (" + size + " KB)");
    }

    @Override
    public int getSize() {
        return size;
    }
}