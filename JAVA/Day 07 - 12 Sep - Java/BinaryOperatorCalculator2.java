/* This program is for making a calculator that can be performed binary operation.

Valid Input Data Types: Integer
Output Data Type: Double

Definition of Binary Operation: In mathematics, a binary operation or dyadic operation is a rule for combining two elements (called operands) to produce another element. More formally, a binary operation is an operation of arity two. 
*/

class BinaryOperatorCalculator2 {
	double x, y;

	public BinaryOperatorCalculator2(int variableX, int variableY) {
		// Casing integer to double to store int:variableX, int:variableY to double:x, double:y
		x = (double) variableX;
		y = (double) variableY;
	}

	double addition() {
		return x + y;
	}

	double subtraction() {
		return x - y;
	}

	double multiplication() {
		return x * y;
	}

	double division() {
		return x / y;
	}

	double remainder() {
		return x % y;
	}
}

