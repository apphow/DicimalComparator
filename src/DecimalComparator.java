import java.math.BigDecimal;
import java.util.BitSet;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        //one solution

        a = a * 1000;
        b = b * 1000;

        int a1 = (int) a;
        int b1 = (int) b;

        if (a1 == b1) {
            return true;
        }
        return false;
    }
/*
        // one solution
        BigDecimal num = new BigDecimal(a);
        num = num.setScale(4, BigDecimal.ROUND_HALF_UP);
        BigDecimal num1 = new BigDecimal(b);
        num1 = num1.setScale(4, BigDecimal.ROUND_UP);


        if(Math.abs(a-b) < 0.001) {
            return true;
        }
        return false;
    }

 */


}

