// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

import org.junit.Test;
import static org.junit.Assert.*;

public class YourTests {
    @Test
    public void EncodeTest() {

        //DynamicArray<Character> message = new DynamicArray<Character>(5, ["Binah"]);
        CaesarCipher offset = new CaesarCipher(5);
        CaesarCipher offset2 = new CaesarCipher(7);
        
        assertTrue("Is message1 encoded correctly?", offset.encode("Binah").equals("Wdivc"));
        assertTrue("Is message2 encoded correctly?", offset2.encode("Clara").equals("Vetkt"));
    }

    @Test
    public void DecodeTest() {

        //DynamicArray<Character> message = new DynamicArray<Character>(5, ["Binah"]);
        CaesarCipher offset = new CaesarCipher(7);
        CaesarCipher offset2 = new CaesarCipher(13);
        
        assertTrue("Is message1 encoded correctly?", offset.decode("Ubgta tgw Vetkt tkx tpxlhfx").equals("Binah and Clara are awesome"));
        assertTrue("Is message2 encoded correctly?", offset2.decode("Orfg cebtenzzre").equals("Best programmer"));
    }



}