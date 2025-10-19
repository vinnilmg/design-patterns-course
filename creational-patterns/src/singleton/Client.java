package singleton;

import singleton.connection.ConnectionPool;

public class Client {
    private static void doQuery1() {
        final var connectionPool = ConnectionPool.getInstance();
        connectionPool.getConnection()
                .query("SELECT * FROM USERS");
    }

    private static void doQuery2() {
        final var connectionPool = ConnectionPool.getInstance();
        connectionPool.getConnection()
                .query("SELECT * FROM PRODUCTS");
    }

    private static void doQuery3() {
        final var connectionPool = ConnectionPool.getInstance();
        connectionPool.getConnection()
                .query("SELECT * FROM ADDRESSES");
    }

    public static void main(String[] args) {
        doQuery1();
        doQuery2();
        doQuery3();
    }
}
