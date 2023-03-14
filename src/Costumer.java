import java.util.Date;

public class Costumer extends Person {
    private int costumerId;
    private String typeOfCostumer;

    public Costumer(int id, String name, int phoneNumber, Date dateOfBirth, String typeOfCostumer) {
        super(id, name, phoneNumber, dateOfBirth);
        this.typeOfCostumer = typeOfCostumer;
    }

    public int getCostumerId() {
        return costumerId;
    }

    public String getTypeOfCostumer() {
        return typeOfCostumer;
    }

}
