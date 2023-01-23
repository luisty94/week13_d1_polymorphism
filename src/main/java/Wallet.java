import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> methodsOfPayment;

    public Wallet(String name) {
        this.name = name;
        this.methodsOfPayment = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.methodsOfPayment.size();
    }

    public void addItem(IScan item) {
        this.methodsOfPayment.add(item);
    }
}
