package com.nanda.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Nandakumar.Menon on 17-02-2017.
 */
public class Dictionaries {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map phoneNumberMap = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneNumberMap.put(name,phone);
        }
        while(in.hasNext()){
            String name = in.next();
            Object phoneNumber = phoneNumberMap.get(name);
            System.out.println((phoneNumber == null?"Not found": name+"="+ phoneNumber));
        }
        in.close();
    }
}
