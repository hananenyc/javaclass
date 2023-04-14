package class9;
//Create an array of animals and store 5 elements into it.
// Using 2 different loops print all elements from the array.
public class arrysHW5 {
    public static void main(String[] args) {
        String[] animals = {"dog", "cat", "panda", "hors", "tiger"};
        for (String animal : animals) {
            System.out.println(animal + " ");
        }
        System.out.println();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i] + " ");
        }
        System.out.println();
        int i = 0;
        while (i < animals.length) {
            System.out.println(animals[i] + " ");
            i++;

        }
    }
}
