package polymorphism4instanceOf;

import java.util.ArrayList;

public class TestForm {
    public static void main(String[] args) {

        Circle circle1 = new Circle(4.15);
        Circle circle2 = new Circle(5.23);

        Square square1 = new Square(5);
        Square square2 = new Square(8);


        calculate(circle1);

    }

    public static void calculate(Form form){

        if (form instanceof Square){
            System.out.println("- Square -");
            System.out.println("Area: " + form.getArea());
        }
        else if (form instanceof Circle){
            System.out.println("- Circle - ");
            System.out.println("Area: " + form.getArea());
            System.out.println("Environment: " + form.getEnvironment());
        }

        System.out.println();
    }


}
