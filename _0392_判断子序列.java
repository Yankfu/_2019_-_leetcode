package com.LeetCode;

public class _0392_判断子序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubsequence("leeeeetcode","yy"));
	}
	
	public static boolean isSubsequence(String s, String t) {
		int i = 0;
		if(s.length()==0)
		{
			return true;
		}
		while(i <= s.length()) {
			for(int j=0;j<t.length();j++)
			{
				if(s.charAt(i)==t.charAt(j))
				{
					//System.out.println("s:"+s.charAt(i)+"\ti:"+i+"\tj+"+j);
					i++;
				}
				else {
					continue;
				}
			}
			if(i == s.length())
			{
				return true;
			}
			else {
				return false;
			}
		}
		
        return true;
    }
}
