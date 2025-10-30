package monostate.connection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ConnectionPool {
    private static final int POOL_SIZE = 2;
    private static List<Connection> CONNECTIONS;

    static {
        System.out.println("Creating connection pool...");
        CONNECTIONS = new ArrayList<>();
        IntStream.range(0, POOL_SIZE)
                .forEach(i -> {
                    final var conn = new Connection("Connection_" + i);
                    CONNECTIONS.add(conn);
                });
    }

    public ConnectionPool() {
        System.out.println("New instance of connection pool...");
    }

    public Connection getConnection() {
        return CONNECTIONS.stream()
                .filter(connection -> !connection.inUse())
                .findAny()
                .map(conn -> {
                    conn.usingConn();
                    return conn;
                })
                .orElseThrow(() -> new IllegalArgumentException("No available connections"));
    }
}
