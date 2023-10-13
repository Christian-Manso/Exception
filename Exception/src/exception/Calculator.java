package exception;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    // This method could throw an ArithmeticException
    public double divide(int x, int y) throws ArithmeticException {
        try {
            return x / y;
        } catch (ArithmeticException a) {
            System.out.println("Your math is not mathing, flipping operands");
            return y / x;
        } catch (Exception e) {
            System.out.println("Your math is not mathing, setting to 0");
            return 0;
        }
    }
}
