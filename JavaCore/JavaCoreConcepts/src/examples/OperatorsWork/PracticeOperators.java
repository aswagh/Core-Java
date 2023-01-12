package examples.OperatorsWork;

import java.text.Normalizer.Form;

public class PracticeOperators {
	
	public static void unaryOperator(int a, int b) {
		System.out.println("Unary Operator Operations:");
		System.out.println(a++ + ++a);	//
		a = 10; b = 20;
		System.out.println(a-- + --a);	//
		a = 10; b = 20;
		System.out.println(a++ + --b);	//
		a = 10; b = 20;
		System.out.println(++a + b--);	//

	}
	public static void arithmeticOperators(int a, int b) {
		System.out.println("Arithmentic Operators Operation:");
		System.out.println(b%a);
		System.out.println(a%b);
		System.out.println(a+b+" 45 "+a+b+" 54 "+a+b);
	}
	public static void shiftOperator(int a) {
		System.out.println("Shift Operator Operations: ");
		System.out.println(5<<3);	//	5 * 2 ^ 3 = 40
		System.out.println(a<<4);	//	10 * 2 ^ 4 = 160
		System.out.println(40>>3);	//	40 / 2 ^ 3 = 40 / 8 =5
		System.out.println(String.format("value is %d", (a>>4)));	//	10 / 2 ^ 4 = 10/16 = 5/4 = 0
	}
	public static void logicalOperator(int a, int b) {
		System.out.println("Logical Operator Operations: ");
		a = 20; b = 10; int c = 40;
		System.out.println(a<b && b++<c);
		System.out.println(b);
	}
	public static void bitWisseOperator(int a, int b) {
		System.out.println("Bitwise Operator: ");
		a = 5; b = 5;
		System.out.println(a & b);
		a = 20; b = 10; int c = 40;
		System.out.println(a<b & b++<c);
		System.out.println(b);
	}
	public static void ternaryOperator(int a, int b) {
		System.out.println("Ternery Operator ");
		System.out.println((a>b?a:b));
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		shiftOperator(a);
		arithmeticOperators(a, b);
		unaryOperator(a,b);
		bitWisseOperator(a, b);
		logicalOperator(a, b);
		ternaryOperator(a, b);

	}

}
