import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WerkdagTest {

    @Test
    void setMinuten0() {


        Werkdag werkdag = new Werkdag();
        werkdag.setMinuten(0);

        assertEquals(0,werkdag.getMinuten() );

    }

    @Test
    void setMinuten1() {


        Werkdag werkdag = new Werkdag();
        werkdag.setMinuten(1);

        assertEquals(0,werkdag.getMinuten() );

    }

    @Test
    void setMinuten29() {


        Werkdag werkdag = new Werkdag();
        werkdag.setMinuten(29);

        assertEquals(0,werkdag.getMinuten() );

    }

    @Test
    void setMinuten30() {


        Werkdag werkdag = new Werkdag();
        werkdag.setMinuten(30);

        assertEquals(30,werkdag.getMinuten() );

    }



    @Test
    void setMinuten31() {


        Werkdag werkdag = new Werkdag();
        werkdag.setMinuten(31);

        assertEquals(30,werkdag.getMinuten() );

    }

    @Test
    void setMinuten59() {


        Werkdag werkdag = new Werkdag();
        werkdag.setMinuten(59);

        assertEquals(30,werkdag.getMinuten() );

    }



    @Test
    void testSetUren8() {
        Werkdag werkdag = new Werkdag();
        werkdag.setUren(8);
        assertEquals(8, werkdag.getUren());
    }

    @Test
    void testSetUren9() {
        Werkdag werkdag = new Werkdag();
        werkdag.setUren(9);
        assertEquals(8, werkdag.getUren());
    }







}