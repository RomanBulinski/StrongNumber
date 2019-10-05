import java.util.Arrays;

public class StrongNumber {

    public static String isStrongNumber(int num) {
        int effect = Arrays.stream(String.valueOf(num).split("")).mapToInt(n ->silnia( n )).sum();
        return ( num == effect ) ? "STRONG!!!!":"Not Strong !!";
    }

    static int silnia(String i) {
        int res = 1;
        for (int j = 1; j <= Integer.valueOf(i); j++) {
            res = res * j;
        }
        return res;
    }
}
