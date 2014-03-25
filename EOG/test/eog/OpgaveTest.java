/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eog;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Patrick
 */
public class OpgaveTest {
    
    private static Opgave opgave;
    private static OpgaveRegister opgaveRegister;
    
    public OpgaveTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        opgaveRegister = new OpgaveRegister();        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCreateOpgave() {
        String titel = "Haveklipning";
        String beskrivelse = "Klip haver";
        String datoForOprettelse = "12/09/1991";
        String tidsfrist = "14/09/1991";
        String afbudsdato = "11/09/1991";
        
        opgave = opgaveRegister.createOpgave(titel, beskrivelse, datoForOprettelse, tidsfrist, afbudsdato);
        Opgave result = opgaveRegister.getOpgave(opgave.getId());
        assertEquals(opgave, result);
    }
    
}
