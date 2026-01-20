package composite.folders.model;

import java.util.List;

public class Folder implements FileSystemItem {
    private final String name;
    private final List<FileSystemItem> files;

    public Folder(String name, List<FileSystemItem> files) {
        this.name = name;
        this.files = files;
    }

    @Override
    public void print(final String structure) {
        System.out.println(structure + name);
        files.forEach(file -> file.print(String.format("%s| ", structure)));
    }
}
