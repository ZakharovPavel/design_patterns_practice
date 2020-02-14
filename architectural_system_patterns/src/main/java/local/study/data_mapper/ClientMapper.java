package local.study.data_mapper;

import local.study.identity_map.ClientIdentityMap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientMapper {

    private final Connection connection;

    public ClientMapper(Connection connection) {
        this.connection = connection;
    }

    public Client findById(int id) throws SQLException {
        Client client = ClientIdentityMap.getClient(id);
        if (client == null) {
            String statement = "SELECT * FROM clients WHERE id = ?";
            PreparedStatement dbStatement = connection.prepareStatement(statement);
            dbStatement.setInt(1, id);

            try (ResultSet rs = dbStatement.executeQuery()) {
                if (rs.next()) {
                    client = new Client();
                    client.setId(rs.getInt("id"));
                    client.setName(rs.getString("name"));
                    client.setCountry(rs.getString("country"));
                    ClientIdentityMap.addClient(client);
                    return client;
                }
            }
        }
        return null;
    }

    public void update(Client client) throws SQLException {
        String statement = "UPDATE clients SET name = ?, country = ? WHERE id = ?";
        PreparedStatement dbStatement = connection.prepareStatement(statement);
        dbStatement.setString(1, client.getName());
        dbStatement.setString(2, client.getCountry());
        dbStatement.setInt(3, client.getId());
        dbStatement.executeUpdate();
    }

    public void insert(Client client) throws SQLException {
        String statement = "INSERT INTO clients (name, country) VALUES (?, ?)";
        PreparedStatement dbStatement = connection.prepareStatement(statement);
        dbStatement.setString(1, client.getName());
        dbStatement.setString(2, client.getCountry());
        dbStatement.executeUpdate();
    }

    public void delete(Client client) throws SQLException {
        String statement = "DELETE FROM clients where id = ?";
        PreparedStatement dbStatement = connection.prepareStatement(statement);
        dbStatement.setInt(1, client.getId());
        dbStatement.executeUpdate();
    }

}
