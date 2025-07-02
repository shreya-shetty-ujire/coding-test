public class Program1 {

    private double num1;
    private double num2;
    private String operation;


    public Program1(double x, double y, String operation) {
        this.num1 = x;
        this.num2 = y;
        this.operation = operation.toLowerCase();
    }


    public double calculate() {
        switch (operation) {
            case "addition":
                return num1 + num2;
            case "subtraction":
                return num1 - num2;
            case "multiplication":
                return num1 * num2;
            case "division":
                if (num2 == 0) {
                    System.out.print("Cannot divide by zero, ");
                    return -1;
                } else {
                    return num1 / num2;
                }
            default:
                System.out.print("Invalid operation type: " + operation + ", ");
                return -1;
        }
    }

    public static void main(String[] args) {
        Program1 example1 = new Program1(10.5, 2.0, "addition");
        System.out.println("Result: " + example1.calculate());

        Program1 example2 = new Program1(10, 0, "division");
        System.out.println("Result: " + example2.calculate());

        Program1 example3 = new Program1(10, 2, "division");
        System.out.println("Result: " + example3.calculate());

        Program1 example4 = new Program1(10, 5, "modulus");
        System.out.println("Result: " + example4.calculate());
    }
}
