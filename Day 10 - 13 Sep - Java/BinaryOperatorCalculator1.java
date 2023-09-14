/* This program is for making a calculator that can be performed binary operation.

Valid Input Data Types: Integer
Output Data Type: Integer

Definition of Binary Operation: In mathematics, a binary operation or dyadic operation is a rule for combining two elements (called operands) to produce another element. More formally, a binary operation is an operation of arity two. 
*/

class BinaryOperatorCalculator1 {
	int x, y;

	public BinaryOperatorCalculator1(int variableX, int variableY) {
		x = variableX;
		y = variableY;
	}

	int addition() {
		return x + y;
	}

	int subtraction() {
		return x - y;
	}

	int multiplication() {
		return x * y;
	}

	int division() {
		return x / y;
	}

	int remainder() {
		return x % y;
	}
}

