/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

Hint:

A naive implementation of the above process is trivial. Could you come up with other methods?
What are all the possible results?
How do they occur, periodically or randomly?
You may find this (https://en.wikipedia.org/wiki/Digital_root) useful.

*/

public class Solution {
    public int addDigits(int num) {
        int decade = 0;
        int unit = 0;
        while (num >=10){
            decade = num / 10;
            unit = num % 10;
            num = decade + unit;
        }
        
        return num;

        // Method Two (Digital_root): return (num - 1) % 9 + 1;
    }
}

