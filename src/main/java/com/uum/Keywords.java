//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment 2
//Matrik: #240788
//Name: #Tee Mei Yit
package com.uum;

import static com.uum.Asg2.absoluteFilePath;
import static com.uum.Cloc.actual;
import static com.uum.Keywords.keywordsCount;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.stream.IntStream;

public class Keywords {

    static int keywordsCount[] = new int[53];
    static int total = 0;

    static int[] keywords() throws FileNotFoundException, IOException {

        String lineRead = null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(absoluteFilePath), Charset.defaultCharset()))){

            while ((lineRead = br.readLine()) != null) {
                if (lineRead.contains(" abstract ")) {
                    keywordsCount[0]++;
                }
                if (lineRead.contains(" assert ")) {
                    keywordsCount[1]++;
                }
                if (lineRead.contains(" boolean ")) {
                    keywordsCount[2]++;
                }
                if (lineRead.contains(" break ")) {
                    keywordsCount[3]++;
                }
                if (lineRead.contains(" byte ")) {
                    keywordsCount[4]++;
                }
                if (lineRead.contains(" case ")) {
                    keywordsCount[5]++;
                }
                if (lineRead.contains(" catch ")) {
                    keywordsCount[6]++;
                }
                if (lineRead.contains(" char ")) {
                    keywordsCount[7]++;
                }
                if (lineRead.contains("class")) {
                    keywordsCount[8]++;
                }
                if (lineRead.contains(" continue ")) {
                    keywordsCount[9]++;
                }
                if (lineRead.contains(" default ")) {
                    keywordsCount[10]++;
                }
                if (lineRead.contains(" do ")) {
                    keywordsCount[11]++;
                }
                if (lineRead.contains(" double ")) {
                    keywordsCount[12]++;
                }
                if (lineRead.contains(" else ")) {
                    keywordsCount[13]++;
                }
                if (lineRead.contains(" enum ")) {
                    keywordsCount[14]++;
                }
                if (lineRead.contains(" extends ")) {
                    keywordsCount[15]++;
                }
                if (lineRead.contains(" final ")) {
                    keywordsCount[16]++;
                }
                if (lineRead.contains(" finally ")) {
                    keywordsCount[17]++;
                }
                if (lineRead.contains(" float ")) {
                    keywordsCount[18]++;
                }
                if (lineRead.contains(" for ")) {
                    keywordsCount[19]++;
                }
                if (lineRead.contains(" if ")) {
                    keywordsCount[20]++;
                }
                if (lineRead.contains(" implements ")) {
                    keywordsCount[21]++;
                }
                if (lineRead.contains(" import ")) {
                    keywordsCount[22]++;
                }
                if (lineRead.contains(" instanceof ")) {
                    keywordsCount[23]++;
                }
                if (lineRead.contains(" int ")) {
                    keywordsCount[24]++;
                }
                if (lineRead.contains(" interface ")) {
                    keywordsCount[25]++;
                }
                if (lineRead.contains(" long ")) {
                    keywordsCount[26]++;
                }
                if (lineRead.contains(" native ")) {
                    keywordsCount[27]++;
                }
                if (lineRead.contains(" new ")) {
                    keywordsCount[28]++;
                }
                if (lineRead.contains("package")) {
                    keywordsCount[29]++;
                }
                if (lineRead.contains(" private ")) {
                    keywordsCount[30]++;
                }
                if (lineRead.contains(" protected ")) {
                    keywordsCount[31]++;
                }
                if (lineRead.contains(" public ")) {
                    keywordsCount[32]++;
                }
                if (lineRead.contains(" return ")) {
                    keywordsCount[33]++;
                }
                if (lineRead.contains(" short ")) {
                    keywordsCount[34]++;
                }
                if (lineRead.contains(" static ")) {
                    keywordsCount[35]++;
                }
                if (lineRead.contains(" strictfp ")) {
                    keywordsCount[36]++;
                }
                if (lineRead.contains(" super ")) {
                    keywordsCount[37]++;
                }
                if (lineRead.contains(" switch ")) {
                    keywordsCount[38]++;
                }
                if (lineRead.contains(" synchronized ")) {
                    keywordsCount[39]++;
                }
                if (lineRead.contains(" this ")) {
                    keywordsCount[40]++;
                }
                if (lineRead.contains(" throw ")) {
                    keywordsCount[41]++;
                }
                if (lineRead.contains(" throws ")) {
                    keywordsCount[42]++;
                }
                if (lineRead.contains(" transient ")) {
                    keywordsCount[43]++;
                }
                if (lineRead.contains(" try ")) {
                    keywordsCount[44]++;
                }
                if (lineRead.contains(" void ")) {
                    keywordsCount[45]++;
                }
                if (lineRead.contains(" volatile ")) {
                    keywordsCount[46]++;
                }
                if (lineRead.contains(" while ")) {
                    keywordsCount[47]++;
                }
                if (lineRead.contains(" true ")) {
                    keywordsCount[48]++;
                }
                if (lineRead.contains(" null ")) {
                    keywordsCount[49]++;
                }
                if (lineRead.contains(" false ")) {
                    keywordsCount[50]++;
                }
                if (lineRead.contains(" const ")) {
                    keywordsCount[51]++;
                }
                if (lineRead.contains(" goto ")) {
                    keywordsCount[52]++;
                }
            }

            total = actual + IntStream.of(keywordsCount).sum();
            System.out.println("Total = " + total);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return keywordsCount;
    }
}
