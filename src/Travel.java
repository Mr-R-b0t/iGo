import java.util.Date;

public class Travel {

    private int id;

    private Station start;

    private Station end;

    private Date time;

    private double price;

    private Card card;

    public Travel(int id, Station start, Station end, Date time, double price, Card card) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.time = time;
        this.price = price;
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public Station getStart() {
        return start;
    }

    public Station getEnd() {
        return end;
    }

    public Date getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }

    public Card getCard() {
        return card;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStart(Station start) {
        this.start = start;
    }

    public void setEnd(Station end) {
        this.end = end;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Travel [id=" + id + ", start=" + start + ", end=" + end + ", time=" + time + ", price=" + price + ", card="
                + card + "]";
    }

}
