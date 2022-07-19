package studio;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a radius: ");
            String radius = input.next();
            try {
                if (Double.valueOf(radius) < 0) {
                    System.out.println("Please put a positive number");
                } else {
                    Double area = Circle.getArea(Double.valueOf(radius));
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
                    break;
                }
            } catch (Exception e) {
                System.out.println("Radius must be a number");

            }
        }
    }
}
//        while (true) {
//            System.out.println("Enter a radius: ");
//            String radius = input.next();
//            try {
//                if (Double.valueOf(radius) > 0) {
//                    Double area = Circle.getArea(Double.valueOf(radius));
//                    System.out.println("The area of a circle of radius " + radius + " is: " + area);
//                    break;
//                } else {
//                    System.out.println("Please put a positive number");
//                }
//            } catch (Exception ignore) {
//            }
//        }

//        if (radius.isNaN()) {
//            System.out.println("Please enter valid number");
////            System.out.println("Enter a radius: ");
//        } else if (radius < 0) {
//            System.out.println("Please enter positive number");
//        } else if (radius.equals("")) {
//            System.out.println("Please enter valid number");
//        } else {
//            Double area = Circle.getArea(radius);
//            System.out.println("The area of a circle of radius " + radius + " is: " + area);
//        }


