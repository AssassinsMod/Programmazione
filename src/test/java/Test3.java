import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import prog.utili.*;

/**
 * Tests for Chapter 3
 * @author AssassinsMod
 * @version 1.0.0
 * @since 1.1.0
 */
public class Test3 {
    @Test
    public void Excercise21() {
        // f(4) = 1 + 1/2 + 1/3 + 1/4 = (12+6+4+3)/12 = 25/12
        assertEquals(new Frazione(25, 12), Chapter3.Excercise21(4));

        // f(6) = f(4) + 1/5 + 1/6 = (125+12+10)60 = 147/60
        assertEquals(new Frazione(147, 60), Chapter3.Excercise21(6));
    }

    @Test
    public void Excercise22() {
        // f(3) = 1 + 1/4 + 1/9 = (36+9+4)/36 = 49/36
        assertEquals(new Frazione(49, 36), Chapter3.Excercise22(3));

        // f(4) = f(3) + 1/16 = (196+9)/144 = 205/144
        assertEquals(new Frazione(205, 144), Chapter3.Excercise22(4));
    }

    @Test
    public void Excercise23() {
        // f(4) = 25/12
        assertEquals(new Frazione(25, 12), Chapter3.Excercise23(4));

        // f(-4) = -25/12
        assertEquals(new Frazione(-25, 12), Chapter3.Excercise23(-4));

        // f(6) = 147/60
        assertEquals(new Frazione(147, 60), Chapter3.Excercise23(6));

        // f(-6) = -147/60
        assertEquals(new Frazione(-147, 60), Chapter3.Excercise23(-6));

        // f(0) = 0
        assertEquals(new Frazione(0), Chapter3.Excercise23(0));
    }
}
