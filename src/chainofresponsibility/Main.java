package chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        //chainofresponsibility
        Employee employee=new Employee();
        Director director=new Director();
        CEO ceo=new CEO();
        employee.setPerson(director);
        director.setPerson(ceo);
double amount=150;
employee.Request(amount);

//Yeni burada ele bir dovre qururuq ki,bir abstract class vasitesile hamsi bir biri ile elaqedardir ve
        //eger birine aid deilse digerine oturur,adindan da gorunduyu kimi zencir kimi gedir.
    }
}