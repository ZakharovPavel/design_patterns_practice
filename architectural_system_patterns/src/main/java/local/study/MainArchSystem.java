package local.study;

import local.study.data_mapper.Client;
import local.study.data_mapper.ClientMapper;
import local.study.data_mapper.DbConnector;
import local.study.identity_map.ClientIdentityMap;

import java.sql.SQLException;

public class MainArchSystem {

    public static void main(String[] args) {

        try {
            ClientMapper clientMapper = new ClientMapper(DbConnector.connect());
            Client client1 = clientMapper.findById(3);
            Client client2 = clientMapper.findById(4);
            System.out.println(client1.getName() + " " + client1.getCountry());  //  Evpaty Russia
            System.out.println(client2.getName() + " " + client2.getCountry());  //  Lara Uganda

            Client client3 = ClientIdentityMap.getClient(3);
            client3.setName("Evpraksy");
            System.out.println(client3.getName() + " " + client3.getCountry());  //  Evpraksy Russia

            Client client4 = clientMapper.findById(3);
            System.out.println(client3.getName() + " " + client3.getCountry());  //  Evpraksy Russia

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
