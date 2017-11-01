//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment 2
//Matrik: #240788
//Name: #Tee Mei Yit
package com.uum.asg2;

import static com.uum.asg2.Cloc.actualLOC;
import static com.uum.asg2.Cloc.blank;
import static com.uum.asg2.Cloc.cloc;
import static com.uum.asg2.Cloc.comment;
import static com.uum.asg2.CommentInfo.commentInfo;
import static com.uum.asg2.Keywords.keywords;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class Asg2 {

    // public static final String directory = "C:\\Users\\Mei Yit\\Documents\\NetBeansProjects\\240788_A2\\test\\MyThread1.java";
    static String filename = "test";
    static String workingDirectory = System.getProperty("user.dir");
    static String absoluteFilePath = workingDirectory + File.separator + filename;
    static ArrayList javafile = new ArrayList();
    static File directory = new File(absoluteFilePath);
    static File[] files = directory.listFiles();

    public static void main(String args[]) throws FileNotFoundException, IOException {

        System.out.println("Directory path : " + absoluteFilePath);
        int[] keywordsCount;
        String[] Keywords = {"abstract", "assert", "boolean", "break", "byte", "case",
            "catch", "char", "class", "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float", "for", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native", "new", "package",
            "private", "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient",
            "try", "void", "volatile", "while", "true", "null", "false", "const", "goto"};

        String courseInfo[];

        for (File fileName : files) {
                if (fileName.getName().endsWith(".java")) {
                    for (int i = 0; i < javafile.size(); i++) {
                        absoluteFilePath = javafile.get(i).toString();
                        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(absoluteFilePath), Charset.defaultCharset()))) {
                            courseInfo = commentInfo();
                            int lineNumberCount = cloc();
                            int blankCount = blank();
                            int commentCount = comment();
                            int actual = actualLOC();
                            keywordsCount = keywords();
                            int loc[] = {lineNumberCount, blankCount, commentCount, actual};
                            Excel ex = new Excel();
                            ex.exportResultInExcel(courseInfo, loc, Keywords, keywordsCount);

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                javafile.add(fileName.getAbsolutePath());
            } 
        }
    }
}
