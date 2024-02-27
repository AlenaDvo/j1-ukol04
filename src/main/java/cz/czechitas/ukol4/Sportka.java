package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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
        /**
         * Zamicha osudi.
         */
        Collections.shuffle(osudi, new Random());
    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> dejVylosovanaCisla() {
        /**
         * Vrati seznam prvnich 6 cisel z osudi.
         */

        List<Integer> vylosovanaCisla = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            vylosovanaCisla.add(osudi.get(i));
        }
        Collections.sort(vylosovanaCisla);
        return vylosovanaCisla;
    }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dejDodatkoveCislo() {
        /**
         * Vrati sedme cislo z osudi.
         */
        return osudi.get(6);
    }
}
