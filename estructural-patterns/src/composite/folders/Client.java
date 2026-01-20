package composite.folders;

import composite.folders.model.File;
import composite.folders.model.Folder;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        final var file1 = new File("file1.txt");
        final var file2 = new File("file2.txt");
        final var file3 = new File("file3.txt");

        final var subfolder1 = new Folder("subfolder1", List.of(file1));
        final var subfolder2 = new Folder("subfolder2", List.of(file1, subfolder1));
        final var folder = new Folder("folder", List.of(subfolder2, file2, file3));

        folder.print("");
    }
}
