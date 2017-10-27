/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mei Yit
 */
public class clocTest {
    
    public clocTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of cloc method, of class cloc.
     */
    @Test
    public void testCloc() {
        System.out.println("cloc");
        int expResult = 24;
        int result = cloc.cloc();
        assertEquals(expResult, result);

    }

    /**
     * Test of blank method, of class cloc.
     */
    @Test
    public void testBlank() {
        System.out.println("blank");
        int expResult = 4;
        int result = cloc.blank();
        assertEquals(expResult, result);

    }

    /**
     * Test of comment method, of class cloc.
     */
    @Test
    public void testComment() {
        System.out.println("comment");
        int expResult = 6;
        int result = cloc.comment();
        assertEquals(expResult, result);

    }

    /**
     * Test of actualLOC method, of class cloc.
     */
    @Test
    public void testActualLOC() {
        System.out.println("actualLOC");
        int expResult = 14;
        int result = cloc.actualLOC();
        assertEquals(expResult, result);
 
    }
    
}
