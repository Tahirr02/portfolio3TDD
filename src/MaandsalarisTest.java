import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaandsalarisTest {

    @Test
    void TestIsDatumCorrect() {
        Maandsalaris maandsalaris = new Maandsalaris();
        maandsalaris.setMaand(13);
        maandsalaris.setJaartal(330);
        assertFalse(maandsalaris.isDatumCorrect());
    }
}