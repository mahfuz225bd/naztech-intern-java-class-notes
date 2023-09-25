/* This program is for making a calculator that can be performed binary operation.

Valid Input Data Types: Double
Output Data Type: Double

Definition of Binary Operation: In mathematics, a binary operation or dyadic operation is a rule for combining two elements (called operands) to produce another element. More formally, a binary operation is an operation of arity two. 
*/

class BinaryOperatorCalculator3 {
	double x, y;

	public BinaryOperatorCalculator3(double variableX, double variableY) {
		x = variableX;
		y = variableY;
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

