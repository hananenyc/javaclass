package class9;
//From an array of integer elements find the largest number.
public class arrysHW7 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 4, 20};
        int largest = numbers[3];
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println(largest);
    }
}
