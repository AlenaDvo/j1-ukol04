package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();

    public Sportka() {
        /**
         * Naplni osudi cisly 1 až 49.
         */

        for (int i = 0; i < 49; i++) {
            osudi.add(i + 1);
        }
    }

    /**
     * Zamicha osudi.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichej() {
        Collections.shuffle(osudi);
    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> dejVylosovanaCisla() {
        List<Integer> vylosovanaCisla = osudi.subList(0, 6);
        Collections.sort(vylosovanaCisla);
        return vylosovanaCisla;
    }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dejDodatkoveCislo() {
        return osudi.get(6);
    }
}
