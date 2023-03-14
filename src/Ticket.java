import java.util.Date;
public class Ticket {
    private int id;
    private Date validityDate;
    private int price;
    private String type;


    public Ticket(int id, Date validityDate, int price, String type) {
        this.id = id;
        this.validityDate = validityDate;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public Date getValidityDate() {
        return validityDate;
    }


    public int getPrice() {
        return price;
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


    public void setPrice(int price) {
        this.price = price;
    }


    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Ticket [id=" + id + ", validityDate=" + validityDate + ", price=" + price + ", type=" + type + "]";
    }

}
