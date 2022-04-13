public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */
    System.out.println("The sum of 100 and 50 is " + App.computeSum(100, 50));
        System.out.println("The sum of 100, 50 and 50 is " + App.computeSum(100, 50, 50));
        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 45 and 100 is " + App.greaterValue(45, 100));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 3.14 and 9.8 is " + App.greaterValue(3.14, 9.8));

    }
}
