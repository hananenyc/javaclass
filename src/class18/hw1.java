package class18;

import java.awt.*;

public class hw1 {
        /* Create 1 class in which create a methods that will calculate the area of Method name
                 must be called calculateArea
                 Rectangle
                 Square*/
        public static void calculateArea(int length,int width){

            System.out.println("Square area ="+(length*width));
        }
        public static void calculateArea(double sideLength){
            System.out.println("Rectangle area ="+(sideLength*sideLength));
        }

        public static void main(String[] args) {
            calculateArea(1,2);
            calculateArea(5);
        }

    }

