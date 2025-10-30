package monostate.connection;

public class Connection {
    private final String name;
    private boolean inUse;

    public Connection(final String name) {
        this.name = name;
        this.inUse = false;
    }

    public String getName() {
        return name;
    }

    public boolean inUse() {
        return inUse;
    }

    public void usingConn() {
        this.inUse = true;
    }

    public void query(final String query) {
        System.out.println("Running query `" + query + "` in connection " + this.name);
    }
}
