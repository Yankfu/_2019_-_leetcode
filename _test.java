package com.LeetCode;

public class _test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(intToRoman(1994));
		int[] digits= {4,3,2,1};
		int[] temp=plusOne(digits);
		for(int a:temp) {
			System.out.print(a+" ");
		}
	}
	public static int[] plusOne(int[] digits) {
        int len=digits.length;
        int jinwei=0;
        for(int i=len-1;i>=0;i--) {
        	if(i==len-1) {
            	if(digits[i]==9) {
            		jinwei=1;
            		digits[i]=0;
            	}else if(digits[i]!=9) {
            		digits[i]++;
            		break;
            	}
        	}else {
        		if(jinwei==0) {
        			break;
        		}
        		else if(digits[i]==9 && jinwei==1) 
        		{
        			jinwei=1;
            		digits[i]=0;
        		}else if(digits[i]!=9 && jinwei==1) {
        			digits[1]++;
        			break;
            	}
        	}
        }
        if(jinwei==1) {
        	int[] reasult=new int[len+1];
        	reasult[0]=1;
        	for(int i=1;i<len+1;i++) {
        		reasult[i]=digits[i-1];
        	}
        	return reasult;
        }
        return digits;
    }
}
