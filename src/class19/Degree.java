package class19;
//Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
//Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
//Call the method by creating an object of each of the three classes.
//Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.
public class Degree {
    void getprerequisite(){
        System.out.println("to get a degree you need high shcool diploma");

    }
}

class Bachelors extends Degree {

}
 class Master extends Degree {
     @Override
     void getprerequisite() {
         super.getprerequisite();
     }
 }
 class Degreetest{
     public static void main(String[] args) {
         Degree obj1=new Degree();
         Bachelors obj2=new Bachelors();
         Master obj3=new Master();
         obj1.getprerequisite();
         obj2.getprerequisite();
         obj3.getprerequisite();
     }
 }
