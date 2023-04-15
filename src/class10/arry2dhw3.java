package class10;

public class arry2dhw3 {
    public static void main(String[] args) {
        String[][] grocerylist = {
                {"milk", "yogurt", "chees", "butter"},
                {"banana", "strawbery", "apple", "orang"},
                {"tomato", "potato", "pepper", "eggplant"},
                {"choclat", "candy", "gummies", "cake"}
        };
        for (int i = 0; i < grocerylist.length; i++) {
            for (int j = 0; j < grocerylist[i].length; j++) {
                System.out.print(grocerylist[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (String[] strings : grocerylist) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
            System.out.println();
            
        }
    }
}



