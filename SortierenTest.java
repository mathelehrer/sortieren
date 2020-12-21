import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;


/**
 * JUnit-Test zum test-driven-development.
 * Implementiere die Methoden tausche und selectionSort,
 * bis diese Tests fehlerfrei ablaufen.
 *
 */
class SortierenTest {

    @Test
    void tauscheTest(){
        Sortieren sortieren = new Sortieren();

        int[] zahlen = new int[]{15,8}; //Testzahlenfeld
        sortieren.setZahlen(zahlen);
        int[] erwartet = new int[]{8,15};
        sortieren.tausche(0,1);
        int[] erhalten = sortieren.getZahlen();

        assertArrayEquals(erwartet,erhalten);
    }

    @Test
    void selectionSortTest(){
        Sortieren sortieren = new Sortieren();

        int[] zahlen = new int[]{15,8,4,27,93,17}; //Testzahlenfeld
        sortieren.setZahlen(zahlen);
        int[] erwartet = new int[]{4,8,15,17,27,93};

        sortieren.selectionSort(zahlen.length);
        int[] erhalten = sortieren.getZahlen();

        assertArrayEquals(erwartet,erhalten);
    }
}