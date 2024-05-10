package chainofresponsibility;

public class Employee extends User{

    @Override
    public double maxAmount() {
        return 100;
    }

    @Override
    public String role() {
        return "Employee";
    }
}
