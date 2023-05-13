package class18;

public class hw3 {
    /* Create 1 class with a private method that has 3 overloaded forms.
   Then call each overloaded method with specific arguments and observe result.*/
    private static void multiply(int a,int b){
        System.out.println(a*b);
    }
    private  static void multiply(int a,long b){
        System.out.println(a*b);
    }
    private  static void multiply(float a,double b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        multiply(5,3);
        multiply(1555,22222222L);
        multiply(22.22F,45268.23);
    }
}

