import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Created 05/02/2021
 * @Project Labbar T4
 * @auther Mewk
 */
public class rovarTest2 {
 @Test
   public void testNull() {
        assertEquals(null, rovar.enrov(null));
    }

    @Test
    public void testEmpty() {
        assertEquals(" ", rovar.enrov(" "));
    }

    @Test
    public void testHejsan() {
        assertEquals("BoBCoCDoDEFoFGoGHoHIJoJKoKLoLMoMNoNOPoPQoQRoRSoSToTUVoVWoWXoXZoZ", rovar.enrov("BCDEFGHIJKLMNOPQRSTUVWXZ"));
    }

    @Test
    public void testSmall() {
        assertEquals("bobcocdodfofhohjojkoklolmomnonopopqoqrorsostotuvovwowxoxzoz", rovar.enrov("bcdfhjklmnopqrstuvwxz"));
    }

    @Test
    public void testNumbers() {
        assertEquals("123456789", rovar.enrov("123456789"));
    }

    @Test
    public void testCharacters() {
        assertEquals("!#€%&/()", rovar.enrov("!#€%&/()"));
    }

    //------------------ test derove --------------------//

    @Test
    public void testNullD() {
        assertEquals(null, rovar.derov(null));
    }

    @Test
    public void testEmptyD() {
        assertEquals(" ", rovar.derov(" "));
    }

    @Test
    public void testHejsanD() {
        assertEquals("BCDEFGHIJKLMNOPQRSTUVWXZ", rovar.derov("BoBCoCDoDEFoFGoGHoHIJoJKoKLoLMoMNoNOPoPQoQRoRSoSToTUVoVWoWXoXZoZ"));
    }

    @Test
    public void testSmallD() {
        assertEquals("bcdfhjklmnopqrstuvwxz", rovar.derov("bobcocdodfofhohjojkoklolmomnonopopqoqrorsostotuvovwowxoxzoz"));
    }

    @Test
    public void testNumbersD() {
        assertEquals("123456789", rovar.derov("123456789"));
    }

    @Test
    public void testCharactersD() {
        assertEquals("!#€%&/()", rovar.derov("!#€%&/()"));
    }


    //Fortsätt sen

   /* public static void main(String[] args) {

        rovar rovar = new rovar();

        String testNull = rovar.enrov("BCDEFGHIJKLMNOPQRSTUVWXYZ" );

        System.out.println(testNull);

    }*/

}
