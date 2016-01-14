import java.util.*;

import prog.utili.*;

/**
 * Collection of chapter 3's exercises
 * @author AssassinsMod
 * @version 1.0.0
 * @since 1.1.0
 */
public class Chapter3 {
    /**
     * Given an int n it calculates the sum of `1 + 1/2 + ... + 1/n`
     * @param  n  Last fraction's denominator
     * @return    Summ of all fractions with `1 <= denominator <= n`
     * @throws FrazioneException When it fails to calculate the sum
     */
    public static Frazione Excercise21(int n) throws FrazioneException {
        if (n < 1) throw new NumberFormatException("Given number was < 1!");

        Frazione result = new Frazione(1);
        for (; n > 1; n--)
            result = result.piu(new Frazione(1, n));

        return result;
    }

    /**
     * Given an int n in calculates the sum of `1 + 1/2 + ... + 1/(n^2)`
     * @param  n  Last fraction's denominator
     * @return    Summ of all fractions with `1 <= denominator <= n^2`
     * @throws FrazioneException When it fails to calculate the sum
     */
    public static Frazione Excercise22(int n) throws FrazioneException {
        if (n < 1) throw new NumberFormatException("Given number was < 1!");

        Frazione result = new Frazione(1);
        for (; n > 1; n--)
            result = result.piu(new Frazione(1, n * n));

        return result;
    }

    /**
     * If `n = 0` gives back 0, otherwise it returns the sum from `n` to `0` of
     * 1/n.
     * @param  n  Last fraction's denominator
     * @return    Summ of all fractions
     * @throws FrazioneException When it fails to calculate the sum
     */
    public static Frazione Excercise23(int n) throws FrazioneException {
        if (n == 0) return new Frazione(0);

        if (n < 0) {
            return Excercise21(-n).per(new Frazione(-1));
        } else {
            return Excercise21(n);
        }
    }
}
