package class9;
//Create an array of names and store all names of your group. Then print your name from that array.
// (use 2 different ways of creating an array).

public class arrysHW2 {
    public static void main(String[] args) {
        String[]names={"hana","jana","sami"};
        System.out.println(names[0]);

        String[]name={"hana","jana","sami"};
        name[0]="hana";
        name[1]="jana";
        name[2]="sami";
        System.out.println(name[0]);
    }

}
