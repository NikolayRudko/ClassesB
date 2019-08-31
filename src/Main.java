public class Main {
    public static void main(String[] args) {
        RationalFraction[] rationalFractions = new RationalFraction[6];
        rationalFractions[0] = new RationalFraction(1, 2);
        rationalFractions[1] = new RationalFraction(3, 8);
        rationalFractions[2] = new RationalFraction(5, 4);
        rationalFractions[3] = new RationalFraction(6, 7);
        rationalFractions[4] = new RationalFraction(2, 5);
        rationalFractions[5] = new RationalFraction(8, 5);

        printArray(rationalFractions);
        changeArray(rationalFractions);
        printArray(rationalFractions);

        RationalFraction[] rationalFractions1 = new RationalFraction[2];
        rationalFractions1[0] = new RationalFraction(11, 2);
        rationalFractions1[1] = new RationalFraction(13, 8);

        printArray(rationalFractions1);
        changeArray(rationalFractions1);
        printArray(rationalFractions1);
    }

    /**
     * This method gets an array of rational fractions to input
     * and adds the value of the following item to each even item.
     *
     * @param array an array rational fraction.
     * @return modified array.
     */
    public static void changeArray(RationalFraction[] array) {
        if (array.length > 3) {
            for (int i = 0; i < array.length - 2; i++) {
                if ((i + 1) % 2 == 0) {
                    array[i].updateFraction(array[i + 1].getFraction(), array[i + 1].getM(), array[i + 1].getN());
                }
            }
        }
    }

    /**
     * This method gets the input of an array of rational fractions
     * and outputs the value of its elements to the console.
     *
     * @param array an array rational fraction.
     */
    public static void printArray(RationalFraction[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d] = %d/%d\n", i, array[i].getM(), array[i].getN());
            System.out.println(array[i].getFraction());
        }
    }
}
