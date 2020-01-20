import java.util.ArrayList;
import java.util.List;

/**
 * Finds prime factors
 */
public class Primer {

    /**
     * Constructor
     *
     * @param n user number
     * @return list of prime factors
     */
    public String Primer(int n) {
        return toString(primesRecursive(n, 2));
    }

    /**
     * Converts list to String
     *
     * @param list given list
     * @return list as string
     */
    public String toString(List<Integer> list) {
        StringBuffer sb = new StringBuffer();

        for (Integer s : list) {
            sb.append(s);
            sb.append(", ");
        }
        return sb.toString().substring(0, sb.toString().length() - 2);
    }

    /**
     * Recursive prime finder
     *
     * @param n the current number
     * @param f the factor
     * @return list of factors
     */
    private static List<Integer> primesRecursive(int n, int f) {
        if (n == 1) return new ArrayList<Integer>();
        if (n % f == 0) {
            List<Integer> factors = primesRecursive(n / f, f);
            factors.add(f);
            return factors;
        } else
            return primesRecursive(n, f + 1);
    }
}