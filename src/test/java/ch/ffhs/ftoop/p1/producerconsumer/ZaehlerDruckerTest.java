package ch.ffhs.ftoop.p1.producerconsumer;

import ch.ffhs.ftoop.p1.producerconsumer.ZaehlerDrucker;
import student.TestCase;

public class ZaehlerDruckerTest extends TestCase {

    public void testZaehlerDrucker() throws InterruptedException {
        ZaehlerDrucker.main(new String[]{"1", "25"});
        assertFuzzyEquals(
                "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 ",
                systemOut().getHistory());
    }

    public void testZaehlerDruckerTo10() throws InterruptedException {
        ZaehlerDrucker.main(new String[]{"1", "10"});
        assertFuzzyEquals(
                "1 2 3 4 5 6 7 8 9 10 ",
                systemOut().getHistory());
    }

    // TODO Fuegen Sie einen eigenen Test ein.
}
