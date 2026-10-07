package co.edu.unal.paralela;

import java.util.Random;
import junit.framework.TestCase;

public class SetupTest extends TestCase {
    
    public void testSetup(){
        final int resultado = Setup.setup(42);
        assertEquals(42, resultado);
    }
}
