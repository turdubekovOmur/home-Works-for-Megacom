package models;

public class Tariff {
    private long id;
    private double sum;
    private int days;
    private  double percent;

    public Tariff(long id, double sum, int days, double percent) {
        this.id = id;
        this.sum = sum;
        this.days = days;
        this.percent = percent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
