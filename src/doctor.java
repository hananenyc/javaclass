public class doctor {
    String firstname,lastname;
    String speciality;
    int yearofexper;
    double salary;
    static boolean degree;
     doctor(String firstname,String lastname){
         this.firstname=firstname;
         this.lastname=lastname;

     }
     doctor(String firstname,String lastname,String speciality){
         this(firstname,lastname);
         this.speciality=speciality;
     }
     public void printinfo(){
         System.out.println(" doctor name is "+ " "+ firstname+lastname+" "+ "and speciality is "+ speciality);
     }
     protected void trat(){
         System.out.println("");

     }


}
