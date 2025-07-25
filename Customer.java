
package customer;


public class Customer {
    private String name;
    private String id;

    public Customer(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}
    

