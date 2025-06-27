package compositePatternFileSystem;

import compositePatternFileSystem.structure.File;
import compositePatternFileSystem.structure.Folder;
import compositePatternFileSystem.structure.FileSystemItem;

public class Main {
    public static void main(String[] args) {
        FileSystemItem resume = new File("Resume.pdf", 120);
        FileSystemItem photo = new File("Photo.jpg", 200);
        FileSystemItem song = new File("Song.mp3", 5000);

        Folder documents = new Folder("Documents");
        Folder music = new Folder("Music");
        Folder root = new Folder("Root");

        documents.addItem(resume);
        documents.addItem(photo);

        music.addItem(song);

        root.addItem(documents);
        root.addItem(music);

        root.showStructure();
        System.out.println("Total Size: " + root.getSize() + " KB");
    }
}