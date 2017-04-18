package com.nanda.string;

/**
 * Created by nandakumar.menon on 16-04-2017.
 */
public class ReverseWordsInString {

    public static void main(String args[]){
        String string = "My name is Nanda";
        System.out.println(ReverseWordsInString.reverseWords(string));
    }

    public static String reverseWords(String sentence) {
        StringBuilder sb = new StringBuilder(sentence.length() + 1);
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(' ');
        }
        sb.setLength(sb.length() - 1);  // Strip trailing space
        return sb.toString();
    }
}
