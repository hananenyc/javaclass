package class10;
//reate 2D array of cars : american, german, korean, italian.
// Then retrieve all values from that array using 2 different loops
public class arry2dHW2 {
    public static void main(String[] args) {
        String[][] cars = {
                {"American", "German"},
                {"Korean", "Italian"}
        };
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j] + "");
            }
            System.out.println();
        }for (String[]strings:cars){
            for (String string:strings){
                System.out.println(string+" ");
            }
        }
    }
}