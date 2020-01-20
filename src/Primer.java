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
    public List<Integer> Primer(int n) {
        return primesRecursive(n, 2);
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