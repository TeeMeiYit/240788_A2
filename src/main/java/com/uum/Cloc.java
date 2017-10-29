//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment 2
//Matrik: #240788
//Name: #Tee Mei Yit
package com.uum;

import static com.uum.Asg2.absoluteFilePath;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Cloc {

    static String lineRead = null;
    static int lineNumberCount = 0;
    static int blankCount = 0;
    static int commentCount = 0;
    static int actual;

    public static int cloc() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(absoluteFilePath), Charset.defaultCharset()))) {
            while (br.readLine() != null) {
                lineNumberCount++;
                }
            System.out.println("LOC = " + lineNumberCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineNumberCount;

    }

    public static int blank() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(absoluteFilePath), Charset.defaultCharset()))) {
            while ((lineRead = br.readLine()) != null) {
                if (lineRead.trim().isEmpty()) {
                    blankCount++;
                }
            }
            System.out.println("Blank = " + blankCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return blankCount;
    }

    public static int comment() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(absoluteFilePath), Charset.defaultCharset()))) {
            while ((lineRead = br.readLine()) != null) {
                if (lineRead.contains("//") || lineRead.contains("*") || lineRead.contains("/*") || lineRead.contains("*/")) {
                    commentCount++;
                }
            }
            System.out.println("Comment = " + commentCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return commentCount;
    }

    public static int actualLOC() {
        actual = (lineNumberCount - blankCount - commentCount);
        System.out.println("Actual LOC = " + actual);
        return actual;
    }
}
