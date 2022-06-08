package edu.Lecture1;

public class CalFunction {
	public int calFunction(int firstValue, int secondValue, String mark) {
		if (mark.equals("+")) {
			firstValue += secondValue;
		} else if(mark.equals("-")) {
			firstValue -= secondValue;
		} else if(mark.equals("*")) {
			firstValue *= secondValue;
		} else if(mark.equals("/")) {
			firstValue /= secondValue;
		}
		
		return firstValue;
	}
}
