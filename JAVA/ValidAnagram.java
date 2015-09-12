/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
*/



import java.util.Hashtable;
import java.util.Arrays;
public class Solution { //hash table 
    public boolean isAnagram_HASHTABLE(String s, String t) {
    	if (s.length() != t.length()) return false;

        Hashtable<Character,Integer> ht = new Hashtable<Character, Integer>();
        for (int i = 0 ; i<s.length();i++) {
        	char n = s.charAt(i);
            int count = ht.containsKey(n) ? ht.get(n) : 0;
            ht.put(n,count+1);
        }

       	for (int i = 0 ; i<t.length();i++) {
        	char m = t.charAt(i);
       		if (!ht.containsKey(m)) return false;
       		else {
       			int count = ht.get(m);
       			if (count-1 <0) return false;
       			else ht.put(m,count-1);
       		}
       	}

       	for (int i = 0; i<s.length();i++) {
        	char n = s.charAt(i);
       		int count = ht.get(n);
       		if (count >0 )return false;
       	}

       	return true; 
        
	}

    public boolean isAnagram_SORT(String s, String t) {
    	char[] chars_s = s.toCharArray();
    	char[] chars_t = t.toCharArray();
    	Arrays.sort(chars_s);
    	Arrays.sort(chars_t);
    	s = new String(chars_s);
    	t = new String(chars_t);
    	return s.equals(t) ;

    }
}