package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
        for (int num = 0; num < lastPrinted; num++)
        {
            // Short-circuit operator is used
            if (num % 3 == 0)
                System.out.print(num);
        }

    }

    public static void main(String[] args) {
        SkippingThird skippingThird=new SkippingThird();
        skippingThird.printUntilButThird(8);
    }
}
