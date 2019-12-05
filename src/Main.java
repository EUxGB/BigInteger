import java.math.*;

public class Main {

    public static BigInteger factorial(int value) {

        if (value <= 0) {
                return BigInteger.ZERO;
            }

            BigInteger k;
            BigInteger m = BigInteger.ONE;

            for (k = BigInteger.ONE; ; k = k.add(BigInteger.ONE)) {
                m = m.multiply(k);
                if (k.equals(new BigInteger(String.valueOf(value)))) {
                    break;
                }
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10000));
    }


}