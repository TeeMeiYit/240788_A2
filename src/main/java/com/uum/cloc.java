//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment 2
//Matrik: #240788
//Name: #Tee Mei Yit
package com.uum;

//import static com.uum.asg2.directory;
import static com.uum.asg2.absoluteFilePath;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class cloc {

    static String lineRead = null;
    static int lineNumberCount = 0;
    static int blankCount = 0;
    static int commentCount = 0;
    static int actual;

    public static int cloc() {
        try {
            FileReader fr = new FileReader(absoluteFilePath);
            LineNumberReader lr = new LineNumberReader(fr);

            while (lr.readLine() != null) {
                lineNumberCount++;
            }
            System.out.println("LOC = " + lineNumberCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineNumberCount;

    }

    public static int blank() {
        try {
            FileReader fr = new FileReader(absoluteFilePath);
            LineNumberReader lr = new LineNumberReader(fr);

            while ((lineRead = lr.readLine()) != null) {
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
        try {
            FileReader fr = new FileReader(absoluteFilePath);
            LineNumberReader lr = new LineNumberReader(fr);

            while ((lineRead = lr.readLine()) != null) {
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
