package chainofresponsibility;

public abstract class User {
    User user;
    public abstract double maxAmount();
    public abstract String role();
    public void setPerson(User user){
        this.user=user;
    }
    public void Request(double amount) {
        if(maxAmount()>amount) {
            System.out.println("My role is: "+role());
        }
        else {
            user.Request(amount);
        }
    }

}
