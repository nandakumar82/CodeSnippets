package com.nanda.regex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Nandakumar.Menon on 23-05-2017.
 */
public class PrintNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myRegExString = ".*@gmail.com";


        // Create a Pattern object (compiled RegEx) and save it as 'p'
        Pattern p = Pattern.compile(myRegExString);


        int n = scanner.nextInt();
        List<String> namList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            // This is the string we will check to see if our regex matches:
            String email = scanner.next();
            // We need a Matcher to match our compiled RegEx to a String
            Matcher m = p.matcher(email);
            // if our Matcher finds a match
            if (m.find()) {
                // Print the match
                namList.add(name);
            }

        }
        Collections.sort(namList);
        for (String name : namList) {
            System.out.println(name);

        }
    }
}
