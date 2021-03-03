package Clock;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Created 19/02/2021
 * @Project Labbar T4
 * @auther Mewk
 */

public class clockTest {


    //I varje test så kommer det skapas en ny klocka.
    //Då slipper jag skriva en ny rad varje gång.
    @BeforeEach
    public void init(){

    }

    @Test
    public void transitionS1S2() {
        clock c = new clock();
        assertEquals("2000:01:01", c.changeMode());
    }

    @Test
    public void transitionS2S1() {
        clock c = new clock();
        c.changeMode();//för att vi redan har testat den ovan, som fungerar.
        assertEquals("00:00:00", c.changeMode());
    }

    @Test
    public void transitionS1S3() {
        clock c = new clock();
        assertEquals("00:00:00", c.ready());
    }

    @Test
    public void transitionS3S1() {
        clock c = new clock();
        c.ready();
        assertEquals("00:00:01", c.set(00,00,01));
    }

    @Test
    public void transitionS2S4() {
        clock c = new clock();
        c.changeMode();
        assertEquals("2000:01:01", c.ready());
    }

    @Test
    public void transitionS4S2() {
        clock c = new clock();
        c.changeMode();
        c.ready();
        assertEquals("2000:01:02", c.set(2000,01,02));
    }




    //Vi måste ha testfall för alla i 0-Switch.
    //Vi ska göra 6 valide fall och 6 invalide fall, alltså fall som inte fungerar.
    //Sista steget, programmera klockan!

    //Först göra testerna!
    //Sen skiva kod för klockan.

    //Totalt 36 tester.
}
