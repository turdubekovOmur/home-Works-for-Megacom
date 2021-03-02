import models.Client;
import models.Credit;
import services.ClientServices;
import services.CreditService;

public class Main {
    public static void main(String[] args) {
        CreditService creditService = CreditService.INSTANCE;
        creditService.setCreditToClient("0552140898", "000989", 1000, 3);

        Credit credit = creditService.findOpenCredit("0552140898", "000989");

        System.out.println(credit.getStartDate());
        System.out.println(credit.getEndDate());
        System.out.println(credit.getStatus());
        System.out.println(credit.getSum());
    }
}
