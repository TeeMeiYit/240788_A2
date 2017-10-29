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

/**
 *
 * @author Mei Yit
 */
public class ExcelTest {

    public ExcelTest() {
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
        Excel.excel();
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
        Excel instance = new Excel();
        instance.exportResultInExcel(courseInfo, loc, keywords, keyCount);
    }

}
