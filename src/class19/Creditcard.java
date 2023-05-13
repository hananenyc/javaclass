package class19;
////Create a class CreditCard and define variable balance and interest. Create an instance method that will
// calculate interest based on the given balance.
////Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
////Call the method by creating an object of each of the three classes.
public class Creditcard {
    int balance;
    int interest;

    public void setInterest(){
        System.out.println(balance+interest);
    }
}
class visa extends Creditcard{

}
class AX extends Creditcard{
    @Override
    public void setInterest() {
        super.setInterest();

    }
}
class Creditcardtest{
    public static void main(String[] args) {
        Creditcard obj=new Creditcard();
        visa obj2=new visa();
        AX obj3=new AX();
        obj.setInterest();
        obj2.setInterest();
        obj3.setInterest();
    }
}
