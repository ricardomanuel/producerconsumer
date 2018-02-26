package ch.ffhs.ftoop.p1.producerconsumer;

public class Drucker extends Thread {
    private Speicher speicher;

    Drucker(Speicher s) {
        this.speicher = s;
    }

    /**
     * Holt einen Wert vom Zaehler und gibt ihn aus, gefolgt von einem einzelnen
     * Leerzeichen.
     */
    @Override
    public void run() {
        while (true) {
            try {
                System.out.print(speicher.getWert() + " ");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
