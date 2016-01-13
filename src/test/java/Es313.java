import java.util.*;

import prog.io.*;
import prog.utili.*;

public class Es313 {
    public enum Selettore {
        LESSMAX, LESSMIN, LONGEST, SHORTEST
    }

    public static String filtra(List<String> lista, Selettore sel) {
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                switch (sel) {
                    case LESSMAX: return s2.compareTo(s1);
                    case LESSMIN: return s1.compareTo(s2);
                    case LONGEST: return s2.length() - s1.length();
                    case SHORTEST: return s1.length() - s2.length();
                    default: return 0;
                }
            }
        });

        return lista.get(0);
    }

    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        List<String> stringhe = new ArrayList<String>();

        // lettura e calcolo
        String s;
        while ((s = in.readLine("Prossima stringa? ")) != null)
            stringhe.add(s);


    }
}
