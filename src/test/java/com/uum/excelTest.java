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
public class excelTest {

    public excelTest() {
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
     * Test of excel method, of class excel.
     */
    @Test
    public void testExcel() {
        System.out.println("excel");
        excel.excel();
    }

    /**
     * Test of exportResultInExcel method, of class excel.
     */
    @Test
    public void testExportResultInExcel() {
        System.out.println("exportResultInExcel");
        String[] courseInfo = new String[]{"A171", "STIW3054", "A", "Assignment1", "898989"};
        int[] loc = new int[0];
        String[] keywords = new String[0];
        int[] keyCount = new int[0];
        excel instance = new excel();
        instance.exportResultInExcel(courseInfo, loc, keywords, keyCount);
    }

}
