/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsHackerank;

/**
 *
 * @author sarthak sethi
 */
public class isPallindrome {
     static boolean isPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1; 
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        }
        return true; 
    }
    
}
