package problems.string;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Anagram {

    /*
     *
     * write a Java Program to check if the two String are Anagram
     * two Strings are called Anagram when there is same character but in different order
     * examples: "CAT" and "ACT", "ARMY" and "MARY"
     *
     */
    public static boolean Anagram(String stri2, String stri1) {
        if (stri2.length() != stri1.length())
            return false;

        for (int i = 0; i < stri2.length(); i++) {
            char c = stri22.charAt(i);
            int index = stri11.indexOf(c);
            if (index != -1) {
                str1 = stri11.substring(0, index) + stri11.substring(index + 1);
            } else
                return false;
        }
        return stri1.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("premier mot : ");
        String str1 = (sc.nextLine());
        System.out.println("deuxieme mot : ");
        String str2 = (sc.nextLine());

        if (Anagram(stri1, stri2))
            System.out.println(stri1+" and "+stri2+" are anagrams");
        else
            System.out.println(stri1+" and "+stri2+" are not anagrams");

    }

}
