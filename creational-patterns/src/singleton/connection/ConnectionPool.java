package singleton.connection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ConnectionPool {
    private static final int POOL_SIZE = 2;
    private static final ConnectionPool singleton = new ConnectionPool();

    private final List<Connection> connections;

    public static ConnectionPool getInstance() {
        return singleton;
    }

    private ConnectionPool() {
        System.out.println("Creating connection pool...");
        this.connections = new ArrayList<>();
        IntStream.range(0, POOL_SIZE)
                .forEach(i -> {
                    final var conn = new Connection("Connection_" + i);
                    connections.add(conn);
                });
    }

    public Connection getConnection() {
        return connections.stream()
                .filter(connection -> !connection.inUse())
                .findAny()
                .map(conn -> {
                    conn.usingConn();
                    return conn;
                })
                .orElseThrow(() -> new IllegalArgumentException("No available connections"));
    }
}
