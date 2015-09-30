/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

"((()))", "(()())", "(())()", "()(())", "()()()"
*/

import java.util.ArrayList;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<String> ();
        backTracking(ls,"",0,0,n);
        return ls;
    }
    
    private void backTracking (List<String>ls, String par, int start, int end, int max){
        if (par.length() == max*2)
            ls.add(par);
            return;
        if (start < max) backTracking(ls,par+"(",start+1,end,max);
        if (end < start) backTracking(ls,par+")",start,end+1,max);
    }
}