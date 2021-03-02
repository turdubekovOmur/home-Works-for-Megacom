package services;

import models.Client;
import services.imp.ClientServicesImpl;

public interface ClientServices {

    ClientServices INSTANCE = new ClientServicesImpl();
    Client findClientElseCreate(String phone, String idCard);
    void blockClient(Client client);

}
