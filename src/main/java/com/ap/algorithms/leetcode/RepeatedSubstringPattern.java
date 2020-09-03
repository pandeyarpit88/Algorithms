package com.ap.algorithms.leetcode;

public class RepeatedSubstringPattern {
	/*
	 Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000
	 */
	public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        String s1 = s.substring(1, n) + s.substring(0,n-1);
        return s1.contains(s);
    }
	
	public static void main(String ...args) {
		System.out.println(repeatedSubstringPattern("abcabcabc"));
	}
}
