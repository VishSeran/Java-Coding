import java.util.Scanner;

public class AreaCalculator{
    private static float pi = 3.142f;

    private static float circle(float radius){
        return (pi*radius*radius);
    }

    private static float square(float side){
        return (side * side);
    }

    private static float rectangle(float height, float width) {
        return (height * width);
    }

    public static void main(String s[]){
        System.out.println("welcome to the Area calculator!");

        System.err.println("Please Enter 1 for Circle \n"+
            "Enter 2 for Square \n" + "Enter 3 for Rectangle \n"
        );


        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());

        if(choice ==1) {
            System.err.println("Please enter the radius of the circle: ");
            float radius = Float.parseFloat(scanner.nextLine());
            System.err.println("The area of "+ radius +" circle is: "+ circle(radius) );
        }
        else if(choice ==2){
            System.err.println("Please enter the length of a side of square: ");
            float length = Float.parseFloat(scanner.nextLine());
            System.err.println("The area of side length "+ length + " square: "+ square(length));
        }

        else if(choice==3){
            System.out.println("Please enter the height of the rectangle: ");
            float height = Float.parseFloat(scanner.nextLine());

            System.out.println("Please enter the width of the rectangle: ");
            float width = Float.parseFloat(scanner.nextLine());

            System.out.println("The area of height: " + height + " and width: " + width + " is: "+ rectangle(height, width));

        }

        else{
            System.err.println("Unknow response");
        }


    }
}
