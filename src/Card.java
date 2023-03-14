public class Card
{
    private int id;
    private String validityDate;
    private int balance;
    private String type;

    public Card(int id, String validityDate, int balance, String type) {
        this.id = id;
        this.validityDate = validityDate;
        this.balance = balance;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getValidityDate() {
        return validityDate;
    }

    public int getBalance() {
        return balance;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValidityDate(String validityDate) {
        this.validityDate = validityDate;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Card [id=" + id + ", validityDate=" + validityDate + ", balance=" + balance + ", type=" + type + "]";
    }


}
