package local.study.data_mapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {

    private static Connection connection;

    public static Connection connect() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:clientsDB.db");
        return connection;
    }

    public static void disconnect() throws SQLException {
        connection.close();
    }
}
