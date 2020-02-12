package local.study.identity_map;

import local.study.data_mapper.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientIdentityMap {

    private static Map clientMap = new HashMap();

    public static void addClient(Client client) {
        clientMap.put(client.getId(), client);
    }

    public static Client getClient(int key) {
        return (Client) clientMap.get(key);
    }

}
