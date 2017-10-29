/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.asg2;

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
public class CommentInfoTest {



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
     * Test of commentInfo method, of class commentInfo.
     */
    @Test
    public void testCommentInfo() {
        System.out.println("commentInfo");
        String[] expResult = new String[]{"A171", "STIW3054", "A", "Assignment1", "898989"};
        String[] result = CommentInfo.commentInfo();
        assertArrayEquals(expResult, result);

    }

}
