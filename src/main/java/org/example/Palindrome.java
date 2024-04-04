package org.example;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new NullPointerException("String must not null");
        }
        s = s.toLowerCase().replaceAll("\\s+", "");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j++;
            i--;
        }
        return true;
    }
// apres la correction de l'erreur au niveau des indice i et j  tel que i incrémente et j décrémente

    public static boolean isPalindromeaprescorrection(String s) {
        if (s == null) {
            throw new NullPointerException("String must not null");
        }
        s = s.toLowerCase().replaceAll("\\s+", "");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}