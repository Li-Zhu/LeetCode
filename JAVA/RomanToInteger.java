/*

Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.


*/
public class Solution {
    public int romanToInt(String s) {
        int res = 0;
    	for (int i = s.length() - 1; i >= 0; i--) {
        	char c = s.charAt(i);
        	switch (c) {
        		case 'I':
            		res += (res >= 5 ? -1 : 1); // check the 'I' is before 'V' or befind.
            		break;
        		case 'V':
            		res += 5;
            		break;
        		case 'X':
            		res += 10 * (res >= 50 ? -1 : 1); // check the 'X' is before 'L' or befind.
            		break;
        		case 'L':
            		res += 50;
            		break;
        		case 'C':
            		res += 100 * (res >= 500 ? -1 : 1); // check the 'C' is before 'D' or befind.
            		break;
        		case 'D':
            		res += 500;
            		break;
        		case 'M':
            		res += 1000;
            		break;
       	 	}
    	}
    return res;
	}
}
