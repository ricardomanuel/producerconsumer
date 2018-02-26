package ch.ffhs.ftoop.p1.producerconsumer;

public class Speicher implements SpeicherIf {

    private int wert;
    private boolean hatWert = false;

    @Override
    public synchronized int getWert() throws InterruptedException {
        while (!hatWert) {
            wait();
        }

        hatWert = false;
        notifyAll();
        return wert;
    }

    @Override
    public synchronized void setWert(int wert) throws InterruptedException {
        while (hatWert) {
            wait();
        }

        this.wert = wert;
        hatWert = true;
        notifyAll();
    }

    @Override
    public boolean isHatWert() {
        return hatWert;
    }
}
