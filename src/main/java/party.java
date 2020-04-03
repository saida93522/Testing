import static input.InputUtils.intInput;

class party {

    public static void main(String[] agra) {
        System.out.println("This program will add two numbers.");
        int number1 = intInput("Please enter the first number");
        int number2 = intInput("Please enter the second number");

        int total = addNumbers(number1, number2);

        // Print the output, using String formatting
        System.out.printf("Adding %d to %d makes %s", number1, number2, total);


    }

    public static int addNumbers(int num1, int num2){
        int total = num1 + num1;

        return total;

    }
}
