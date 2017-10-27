//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment 2
//Matrik: #240788
//Name: #Tee Mei Yit
package com.uum;

import static com.uum.cloc.actualLOC;
import static com.uum.cloc.blank;
import static com.uum.cloc.cloc;
import static com.uum.cloc.comment;
import static com.uum.commentInfo.commentInfo;
import static com.uum.keywords.keywords;
import java.io.FileNotFoundException;
import java.io.IOException;

public class asg2 {

    public static final String directory = "C:\\Users\\Mei Yit\\Documents\\NetBeansProjects\\240788_A2\\test\\MyThread1.java";

    public static void main(String args[]) throws FileNotFoundException, IOException {

        int[] keywordsCount;
        String[] Keywords = {"abstract", "assert", "boolean", "break", "byte", "case",
            "catch", "char", "class", "continue", "default", "do", "double", "else",
            "enum", "extends", "final", "finally", "float", "for", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native", "new", "package",
            "private", "protected", "public", "return", "short", "static", "strictfp",
            "super", "switch", "synchronized", "this", "throw", "throws", "transient",
            "try", "void", "volatile", "while", "true", "null", "false", "const", "goto"};

        String courseInfo[];

        if (directory != null) {
            courseInfo = commentInfo();
            int lineNumberCount = cloc();
            int blankCount = blank();
            int commentCount = comment();
            int actual = actualLOC();
            keywordsCount = keywords();
            int loc[] = {lineNumberCount, blankCount, commentCount, actual};
            excel ex = new excel();
            ex.exportResultInExcel(courseInfo, loc, Keywords, keywordsCount);
        } 
    }
}
