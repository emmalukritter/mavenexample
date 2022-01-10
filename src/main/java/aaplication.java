//import org.slf4j.Logger;
import org.apache.log4j.*;


import java.util.*;

class Calculator {
    public int add(int i, int j) {
        System.out.println("Addition of " + i + "," + j + " is: " + (i + j));
        return i + j;
    }

    public int mul(int i, int j) {
        System.out.println("Multiplication of " + i + "," + j + " is: " + (i * j));
        return i * j;
    }

    public int sub(int i, int j) {
        System.out.println("Subtraction of " + i + "," + j + " is: " + (i - j));
        return i - j;
    }

    public double div(double i, double j) {
        if (j != 0) {
            System.out.println("Division of " + i + "," + j + " is: " + (i / j));
            return i / j;
        } else {
            System.out.println("Division with 0 is not possible");
            return 0;
        }
    }
    void print() {

        Logger log = Logger.getLogger(application.class.getName());
        log.info("This is from log4j");
        log.error("This is from log4j");
        log.debug("This is from log4j");
    }
}
class application {


    public static void main(String[] args) {
        BasicConfigurator.configure();
        System.out.println("Simple Calculator");
        System.out.println();
        Calculator cal = new Calculator();
        cal.print();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        cal.add(a, b);
        cal.mul(a, b);
        cal.sub(a, b);
        cal.div(a, b);        sc.close();
    }
}
