package com.codility.stack;

import java.util.Stack;

public class ParanthesisMatchStack {

	public static void main(String args[]) {
		System.out.println(balancedParenthensies("{(a,b)}"));
		System.out.println(balancedParenthensies("{(a},b)"));
		System.out.println(balancedParenthensies("{)(a,b}"));
	}

	public static boolean balancedParenthensies(String s) {
		Stack<Character> brackets = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '{' || ch == '[' || ch == '(') {
				brackets.push(ch);
			} else if (ch == '}') {
				if (brackets.isEmpty())
					return false;
				if (brackets.pop() != '{')
					return false;
			} else if (ch == ']') {
				if (brackets.isEmpty())
					return false;
				if (brackets.pop() != '[')
					return false;
			} else if (ch == ')') {
				if (brackets.isEmpty())
					return false;
				if (brackets.pop() != '(')
					return false;
			}
		}
		return brackets.isEmpty();
	}
}