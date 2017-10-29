//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment 2
//Matrik: #240788
//Name: #Tee Mei Yit
package com.uum.asg2;

import static com.uum.asg2.Asg2.absoluteFilePath;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class CommentInfo {

    static String lineRead = null;
    static String sem, course, group, task, matrik, name;
    static String[] courseInfo = new String[5];

    static String[] commentInfo() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(absoluteFilePath), Charset.defaultCharset()))){

            while ((lineRead = br.readLine()) != null) {
                if (lineRead.contains("//Semester: #")) {
                    sem = lineRead;
                    sem = sem.replace("//Semester: #", "");
                    courseInfo[0] = sem;
                    System.out.println("Semester = " + sem);
                }
                if (lineRead.contains("//Course: #")) {
                    course = lineRead;
                    course = course.replace("//Course: #", "");
                    System.out.println("Course = " + course);
                    courseInfo[1] = course;
                }
                if (lineRead.contains("//Group: #")) {
                    group = lineRead;
                    group = group.replace("//Group: #", "");
                    System.out.println("Group = " + group);
                    courseInfo[2] = group;
                }
                if (lineRead.contains("//Task: #")) {
                    task = lineRead;
                    task = task.replace("//Task: #", "");
                    System.out.println("Task = " + task);
                    courseInfo[3] = task;
                }
                if (lineRead.contains("//Matrik: #")) {
                    matrik = lineRead;
                    matrik = matrik.replace("//Matrik: #", "");
                    System.out.println("Matrik = " + matrik);
                    courseInfo[4] = matrik;
                }
                if (lineRead.contains("//Name: #")) {
                    name = lineRead;
                    name = name.replace("//Name: #", "");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courseInfo;
    }

}
