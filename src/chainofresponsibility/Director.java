package chainofresponsibility;

public class Director extends User{
    @Override
    public double maxAmount() {
        return 1000;
    }

    @Override
    public String role() {
        return "Director";
    }
}
