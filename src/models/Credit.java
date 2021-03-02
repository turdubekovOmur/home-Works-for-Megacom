package models;

import Enums.Status;

import java.util.Calendar;
import java.util.Date;

public class Credit {
    private double id;
    private Date startDate;
    private Date endDate;
    private Date closeDate;
    private double sum;
    private double percent;
    private double fine;
    private Status status;
    private int deadLine;

    public Credit(double sum, double percent, int deadLine) {
        Calendar calendar = Calendar.getInstance();
        this.id = Math.random();
        this.startDate = calendar.getTime();
        this.closeDate = calendar.getTime();
        this.sum = sum + (sum * percent / 100);
        this.percent = percent;
        calendar.add(Calendar.DAY_OF_YEAR, deadLine);
        this.endDate = calendar.getTime();
        this.status = Status.OPEN;
    }

    public double getId() {
        return id;
    }



    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

