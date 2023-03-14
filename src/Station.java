import java.util.Date;

public class Station {
    private int id;
    private Date validityDate;
    private double balance;
    private String type;

    public Station(int id, Date validityDate, double balance, String type) {
        this.id = id;
        this.validityDate = validityDate;
        this.balance = balance;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public Date getValidityDate() {
        return validityDate;
    }

    public double getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Station [id=" + id + ", validityDate=" + validityDate + ", balance=" + balance + ", type=" + type + "]";
    }


}
