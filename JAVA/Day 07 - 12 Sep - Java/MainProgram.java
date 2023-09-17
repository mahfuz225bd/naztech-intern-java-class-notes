class MainProgram {
	public static void main(String[] args) {
		VariableInClass vic = new VariableInClass();
		
		System.out.println("== VariableInClass ==");
		System.out.println("vic.x=" + vic.x);
		System.out.println("vic.y=" + vic.y);
		
		
		System.out.println();
		
		
		System.out.println("== BinaryOperatorCalculator1 ==");
		
		BinaryOperatorCalculator1 bocInt = new BinaryOperatorCalculator1(30, 11);
		
		int x1, y1, additionValue1, subtractionValue1, multiplicationValue1, divisionValue1, remainderValue1;
		x1 = bocInt.x;
		y1 = bocInt.y;
		additionValue1 = bocInt.addition();
		subtractionValue1 = bocInt.subtraction();
		multiplicationValue1 = bocInt.multiplication();
		divisionValue1 = bocInt.division();
		remainderValue1 = bocInt.remainder();
		
		System.out.println("bocInt.x=" + x1 + ", bocInt.y=" + y1);
		System.out.println("Addition=" + additionValue1);
		System.out.println("Subtraction=" + subtractionValue1);
		System.out.println("Multiplication=" + multiplicationValue1);
		System.out.println("Division=" + divisionValue1);
		System.out.println("Remainder=" + remainderValue1);
		
		
		System.out.println();
		
		
		System.out.println("== BinaryOperatorCalculator2 ==");
		
		BinaryOperatorCalculator2 bocIntDouble = new BinaryOperatorCalculator2(30, 11);
		
		double x2, y2, additionValue2, subtractionValue2, multiplicationValue2, divisionValue2, remainderValue2;
		x2 = bocIntDouble.x;
		y2 = bocIntDouble.y;
		additionValue2 = bocIntDouble.addition();
		subtractionValue2 = bocIntDouble.subtraction();
		multiplicationValue2 = bocIntDouble.multiplication();
		divisionValue2 = bocIntDouble.division();
		remainderValue2 = bocIntDouble.remainder();
		
		System.out.println("bocIntDouble.x=" + x2 + ", bocIntDouble.y=" + y2);
		System.out.println("Addition=" + additionValue2);
		System.out.println("Subtraction=" + subtractionValue2);
		System.out.println("Multiplication=" + multiplicationValue2);
		System.out.println("Division=" + divisionValue2);
		System.out.println("Remainder=" + remainderValue2);
		
		
		System.out.println();
		
		
		System.out.println("== BinaryOperatorCalculator3 ==");
		
		BinaryOperatorCalculator3 bocDouble = new BinaryOperatorCalculator3(30.5, 11.334);
		
		double x3, y3, additionValue3, subtractionValue3, multiplicationValue3, divisionValue3, remainderValue3;
		x3 = bocDouble.x;
		y3 = bocDouble.y;
		additionValue3 = bocDouble.addition();
		subtractionValue3 = bocDouble.subtraction();
		multiplicationValue3 = bocDouble.multiplication();
		divisionValue3 = bocDouble.division();
		remainderValue3 = bocDouble.remainder();
		
		System.out.println("bocDouble.x=" + x3 + ", bocDouble.y=" + y3);
		System.out.println("Addition=" + additionValue3);
		System.out.println("Subtraction=" + subtractionValue3);
		System.out.println("Multiplication=" + multiplicationValue3);
		System.out.println("Division=" + divisionValue3);
		System.out.println("Remainder=" + remainderValue3);
	}
}