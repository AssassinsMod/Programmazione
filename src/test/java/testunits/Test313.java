package testunits;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import exercises.*;

public class Test313 {
    List<String> parole = Arrays.asList(
        "parola",
        "parol0",
        "lastringaèfottutamenteinfinita",
        "facchiu",
        "zoo"
    );

    @Test
    public void lessMinima() {
        assertEquals(
            "facchiu",
            Es313.filtra(parole, Es313.Selettore.LESSMIN)
        );
    }

    @Test
    public void lessMassima() {
        assertEquals(
            "zoo",
            Es313.filtra(parole, Es313.Selettore.LESSMAX)
        );
    }

    @Test
    public void piuPiccola() {
        assertEquals(
            "zoo",
            Es313.filtra(parole, Es313.Selettore.SHORTEST)
        );
    }

    @Test
    public void piuGrande() {
        assertEquals(
            "lastringaèfottutamenteinfinita",
            Es313.filtra(parole, Es313.Selettore.LONGEST)
        );
    }
}
