package class10;
//@here Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
// Then your program should print name of the students that has A and B grade
public class arry2dHW1 {
    public static void main(String[] args) {
        String[][] names = {
                {"Hanan", "Fatima", "Sami", "Salim"},
                {"A", "B", "C", "D"},
        };
        System.out.println(names[0][0]);
        System.out.println(names[0][1]);
    }

    }


