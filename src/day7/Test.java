package day7;

import java.util.Arrays;

class Test {
	public static int longestSubstringWithoutRepeatingCharacters(String s) {
	    int n = s.length();
	    int i = 0, j = 0;
	    int maxLength = 0;
	    int[] index = new int[128];
	    Arrays.fill(index, -1);
	    int start = 0, end = 0;
	    if(s.length()!=0) {
	    while (j < n) {
	        if (index[s.charAt(j)] != -1) {
	            i = Math.max(index[s.charAt(j)] + 1, i);
	        }
	        if (j - i + 1 > maxLength) {
	            maxLength = j - i + 1;
	            start = i;
	            end = j;
	        }
	        index[s.charAt(j)] = j;
	        j++;
	    }
	    return ((end+1)-start);
	    }else {
	    	return 0;
	    }
	   // return s.substring(start, end + 1);
	}


	public static void main(String[] args) {
		int s =Test.longestSubstringWithoutRepeatingCharacters("gvddngdertyuiopkg");
		System.out.println(s);
	}
			
	
}
