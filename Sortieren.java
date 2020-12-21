import java.util.Random;

/**
 * The class Sortieren
 *
 * @author p6majo
 * @version 2020-12-12
 */
public class Sortieren {

    /*
     *********************************************
     ***           Attributes           **********
     *********************************************
     */

    private Random zufall;
    private int[] zahlen;

    /*
     **********************************************
     ****           Constructors         **********
     **********************************************
     */

    /**
     * Konstruktor:
     * Initialisierung des Zufallszahlengenerators
     */
    public Sortieren(){
        zufall = new Random();
    }

    /*
     ***********************************************
     ***           Getters              ************
     ***********************************************
     */

    public int[] getZahlen(){return zahlen;}

    /*
     ***********************************************
     ***           Setters              ************
     ***********************************************
     */

    public void setZahlen(int[] pZahlen){zahlen=pZahlen;}

    /*
     ***********************************************
     ***           Public methods       ************
     ***********************************************
     */

    public void selectionSort(int pAnzahl){
       if (zahlen==null){
           waehleZufallszahlen(pAnzahl);
       }

        ausgabe();

        for (int i = pAnzahl-1;i>=1; i--) {
            int pMax = findePositionDerGroesstenZahl(i);
            tausche(pMax,i);
        }

        ausgabe();

    }

    /*
     ***********************************************
     ***           Private methods      ************
     ***********************************************
     */

    private void ausgabe(){
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i]+"\t");
        }
        System.out.println();
    }

    void tausche(int pPosition1, int pPosition2){
        int save = zahlen[pPosition1];
        zahlen[pPosition1]=zahlen[pPosition2];
        zahlen[pPosition2]=save;
    }

    int findePositionDerGroesstenZahl(int pEnde){
        int pMax = 0;
        for (int j = 1; j <= pEnde; j++) {
            if (zahlen[j]>zahlen[pMax]){
                pMax=j;
            }
        }
        return pMax;
    }

    private void waehleZufallszahlen(int pAnzahl){
        zahlen =new int[pAnzahl];
        for (int i = 0; i < pAnzahl; i++) {
            zahlen[i]=zufall.nextInt(100);
        }

    }

    /*
     ***********************************************
     ***           Overrides            ************
     ***********************************************
     */

    /*
     ***********************************************
     ***           toString             ************
     ***********************************************
     */

    @Override
    public String toString() {
        return "Klasse: Sortieren";
    }


}
