/***/

public class RationalFraction {
    private int m;
    private int n;
    private double fraction;

    public RationalFraction(int m, int n) {
        this.m = m;
        this.n = n;
        this.fraction = (double) m / n;
    }


    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public double getFraction() {
        return fraction;
    }

    /**
     * This method summarizes the existing rational fraction with the transmitted fraction.
     *
     * @param fraction value rational fraction
     * @param m        value numerator
     * @param n        value denominator
     */
    public void updateFraction(double fraction, int m, int n) {
        this.fraction += fraction;
        if (n == this.n) {
            this.m += m;
        } else {
            this.m = this.m * n + m * this.n;
            this.n *= n;
        }
    }
}
