package chainofresponsibility;

public class CEO extends User{
    @Override
    public double maxAmount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public String role() {
        return "CEO";
    }
}
