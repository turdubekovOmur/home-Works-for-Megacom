package services.imp;

import Enums.Status;
import exeptions.CreditHistory;
import exeptions.ResourceNotFound;
import models.Client;
import models.Credit;
import models.Tariff;
import services.ClientServices;
import services.CreditService;

import java.util.ArrayList;

public class CreditServiceImpl implements CreditService {
    private ArrayList<Tariff> tariffs;

    public CreditServiceImpl(){
        tariffs = new ArrayList<>();
        tariffs.add(new Tariff(1,1000,1, 10));
        tariffs.add(new Tariff(2,2000,7, 15));
        tariffs.add(new Tariff(3,15000,30, 20));
    }

    private Tariff findCreditById(long id){
        for (Tariff item: tariffs) {
            if (item.getId()==id){
                return item;
            }
        }

        throw new ResourceNotFound("Такого тарифа нет");
    }

    @Override
    public void setCreditToClient(String phone, String idCard, double sum, long tariffId) {
            ClientServices clientServices = ClientServices.INSTANCE;
           Client client =  clientServices.findClientElseCreate(phone, idCard);

           if (client.hasOpenCredits()){
               throw  new CreditHistory("У клиента уже есть активный кредит!");
           }
           if (client.getCreditCountByStatusAndPeriod(Status.PENALTY, 6) >= 5){
               throw  new CreditHistory("У клиента обнаружен более 5 просроски за пол года!");
           }

           Tariff tariff = findCreditById(tariffId);
           Credit credit = new Credit(tariff.getSum(),  tariff.getPercent(), tariff.getDays());
           client.addCredit(credit);

    }

    @Override
    public Credit findOpenCredit(String phone, String idCard) {
        ClientServices clientServices = ClientServices.INSTANCE;
        Client client = clientServices.findClientElseCreate(phone, idCard);

        for (Credit item: client.getCredits()) {
            if (item.getStatus().equals(Status.OPEN)){
                return item;
            }
        }
        throw  new ResourceNotFound("Нет открытого кредита!");
    }
}
