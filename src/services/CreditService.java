package services;

import models.Credit;
import services.imp.CreditServiceImpl;

public interface CreditService {

    CreditService INSTANCE = new CreditServiceImpl();
    void setCreditToClient(String phone, String idCard, double sum, long tariffId);
    Credit findOpenCredit(String phone, String idCard);


}
