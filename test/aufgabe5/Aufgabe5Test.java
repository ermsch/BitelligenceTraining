package aufgabe5;

import aufgabe2.Aufgabe2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe5Test {

    @Test
    void calculateKGV(){
        int zahl1 = 5;
        int zahl2 = 7;

        int kgv_result = Aufgabe5.kgv(zahl1, zahl2);
        assertEquals(kgv_result, 35);


    }

}