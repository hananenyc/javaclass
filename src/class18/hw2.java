package class18;

public class hw2 {
    /*Create 1 class with a static method that has 3 overloaded forms.
   Then call each overloaded method with specific arguments and observe result.*/
    static  void divide(int a,int b){
        System.out.println(a/b);
    }
    static void divide(double a,double b){
        System.out.println(a/b);
    }
    static void divide(double a,int b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        divide(10,2);
        divide(15.5,2.6);
        divide(22.5,9);
}
    }
