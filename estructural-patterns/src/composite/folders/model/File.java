package composite.folders.model;

public class File implements FileSystemItem {
    private final String name;

    public File(final String name) {
        this.name = name;
    }

    @Override
    public void print(final String structure) {
        System.out.println(structure + name);
    }
}
