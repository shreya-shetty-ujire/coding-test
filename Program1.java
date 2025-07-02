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
                if (num2 != 0) {
                    return num1/num2;
                } else {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
            default:
                System.out.println("Invalid operation type: " + operation);
                return 0;
        }
    }

    public static void main(String[] args) {
        Program1 calculator = new Program1(10.5, 2.0, "division");
        System.out.println("Result: " + calculator.calculate());
    }
}
