package eog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class TestBeboer {
    
    private static Beboer b;
    private static BeboerRegister beboerRegister;
    
    public TestBeboer() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        beboerRegister = new BeboerRegister();
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
    public void testCreateBeboer() {
        System.out.println("TestCreateBeboer");
        String firstname = "Patrick";
        String lastname = "Kann";
        String address = "Morbærhaven 8-56";
        String phone = "29718007";
        String email = "pkkann@gmail.com";
        String role = "beboer";
        
        b = beboerRegister.createBeboer(firstname, lastname, address, phone, email, role);
        
        String resultFirstname = b.getFirstname();
        String resultLastname = b.getLastname();
        String resultAddress = b.getAddress();
        String resultPhone = b.getPhone();
        String resultEmail = b.getEmail();
        String resultRole = b.getRole();
        
        assertEquals(firstname, resultFirstname);
        assertEquals(lastname, resultLastname);
        assertEquals(address, resultAddress);
        assertEquals(phone, resultPhone);
        assertEquals(email, resultEmail);
        assertEquals(role, resultRole);
    }

    @Test
    public void testGetBeboer() {
        System.out.println("TestGetBeboer");
        
        Beboer bResult = beboerRegister.getBeboer(b.getId());
        
        assertEquals(b, bResult);
    }
}
