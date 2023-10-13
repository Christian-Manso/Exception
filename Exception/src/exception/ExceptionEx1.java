package exception;

public class ExceptionEx1 {

    public static void main(String args[]) {

        int[] nums = {3, 2, 6, 1};

        badUse(nums);

    }

    public static void badUse(int[] vals) {
        try {
            int total = 0;

            for (int i = 0; i < vals.length; i++) {
                int index = vals[i];
                try {
                    total += vals[index];
                } catch (Exception e) {
                    System.out.println("Out of bounds, value skipped");
                }
            }
            System.out.println(total);
        } catch (Exception e) {
            System.out.println("Exeption: " + e);
        }
    }
}
