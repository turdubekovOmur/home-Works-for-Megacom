package services.imp;

import models.Client;
import services.ClientServices;

import java.util.ArrayList;
import java.util.List;

public class ClientServicesImpl implements ClientServices {

    private List<Client> clients = new ArrayList<>();

    @Override
    public Client findClientElseCreate(String phone, String idCard) {
        for (Client item: clients) {
            if (item.getPhone().equals(phone) && item.getIdCard().equals(idCard)){
                return item;
            }
        }
        Client client = new Client(phone, idCard);
        clients.add(client);
        return client;
    }

    @Override
    public void blockClient(Client client) {

    }
}
