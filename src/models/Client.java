package models;

import Enums.Status;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Client {
    private double id;
    private String phone;
    private String idCard;
    private Status status;
    private boolean isBlocked;
    private List<Credit> credits = new ArrayList<>();

    public Client(String phone, String idCard) {
        this.id = Math.random();
        this.phone = phone;
        this.idCard = idCard;
        this.isBlocked = false;
        this.credits = new ArrayList<>();
    }

    public boolean hasOpenCredits(){
        for (Credit item: credits) {
            if (item.getStatus().equals(Status.OPEN)){
                return true;
            }
        }
        return false;
    }

    public int getCreditCountByStatusAndPeriod(Status status, int month){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, month * (-1));
        int counter = 0;
        for (Credit credit: credits) {
            if (credit.getStatus().equals(status) && credit.getStartDate().after(calendar.getTime())){
                return counter++;
            }
        }
        return counter;
    }

    public void addCredit(Credit credit){
        credits.add(credit);
    }

    public double getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public List<Credit> getCredits() {
        return credits;
    }
}
