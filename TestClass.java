import org.suai.exception.*;
import org.suai.matrix.*;	
class TestClass{
	public static void main(String[] args) {
		/*
		Matrix m1 = new Matrix(2,2);
		Matrix m2 = new Matrix(2,2);
		// init
		m1.setElement(0, 0, 2);
		m1.setElement(0, 1, 3);
		m1.setElement(1, 0, 3);
		m1.setElement(1, 1, 2);
		System.out.println("mt1: ");
		m1.toString();
		m2.setElement(0, 0, 2);
		m2.setElement(0, 1, 3);
		m2.setElement(1, 0, 3);
		m2.setElement(1, 1, 2);
		System.out.println("mt2: ");
		m2.toString();
		// multiplication
		Matrix m3 = m1.product(m2);
		m3.toString();
		// addittion
		m3 = m1.sum(m2);
		m3.toString();
		// equals() method
		System.out.println("m1.equals(m2): ");
		System.out.println(m1.equals(m2));
		*/
		/*
		Matrix m4 = new Matrix(2, 2);
		Matrix m5 = new Matrix(3, 3);
		Matrix m6 = new Matrix(3, 3);
		m4.setElement(0, 0, 2);
		m4.setElement(0, 1, 3);
		m4.setElement(1, 0, 2);
		m4.setElement(1, 1, 2);
		System.out.println("mt4: ");
		m4.toString();
		//
		m5.setElement(0, 0, 1);
		m5.setElement(0, 1, 2);
		m5.setElement(0, 2, 3);
		m5.setElement(1, 0, 4);
		m5.setElement(1, 1, 5);
		m5.setElement(1, 2, 6);
		m5.setElement(2, 0, 7);
		m5.setElement(2, 1, 8);
		m5.setElement(2, 2, 9);
		System.out.println("mt5: ");
		m5.toString();
		// addittion exception test
		// System.out.println("mt4 + mt5: ");
		// m6 = m4.sum(m5);
		//multyplication exception test
		// System.out.println("mt4 * mt5: ");
		// m6 = m4.product(m5);
		// invalid element acception exception test
		//System.out.print("\nmt4[40][80] = " + m4.getElement(40, 80));
		//
		//*/
		//
		/*
		SquareMatrix sqm1 = new SquareMatrix(2);
		SquareMatrix sqm2 = new SquareMatrix(2);
		Matrix sqm3 = new SquareMatrix(2); // because we'll use product() which returns Matrix
		sqm1.setElement(0, 0, 4);
		sqm1.setElement(0, 1, 5);
		sqm1.setElement(1, 0, 6);
		sqm1.setElement(1, 1, 7);
		//
		sqm2.setElement(0, 0, 8);
		sqm2.setElement(0, 1, 9);
		sqm2.setElement(1, 0, 10);
		sqm2.setElement(1, 1, 11);
		//
		System.out.println(sqm1);
		System.out.println(sqm2);
		//
		sqm3 = sqm1.product(sqm2);
		System.out.println(sqm3);
		*/
		/*
		OneRowMatrix oneRow1 = new OneRowMatrix(4,2);
		OneRowMatrix oneRow2 = new OneRowMatrix(3,2);
		Matrix oneRow3 = new OneRowMatrix(2,2);
		oneRow1.setElement(0,0,1);
		oneRow1.setElement(0,1,1);
		oneRow1.setElement(1,0,1);
		oneRow1.setElement(1,1,1);
		//
		oneRow2.setElement(0,0,2);
		oneRow2.setElement(0,1,2);
		oneRow2.setElement(1,0,2);
		oneRow2.setElement(1,1,2);
		System.out.println("\n" + oneRow1.toString());
		System.out.println("\n" + oneRow2.toString());
		System.out.println("\n" + oneRow1.getElement(0,0));
		oneRow3 = oneRow1.sum(oneRow2);
		System.out.println("\n" + oneRow3.toString());
		oneRow3 = oneRow1.product(oneRow2);
		System.out.println("\n" + oneRow3.toString());
		*/
		//equals() test:
		Matrix m1 = new Matrix(3, 3);
		SquareMatrix m2 = new SquareMatrix(3);
		Integer int1 = new Integer(100);
		System.out.println("m1 == m2: " + m1.equals(m2)); // false because SquareMatrix makes E-matrix, and Matrix makes Z-matrix
		System.out.println("m1 == int1: " + m1.equals(int1));
	}
}
//***matrix with all strings equal - only one string is to be kept
//extends Matrix, uses its getElement(), setElement(), sum(), product()
//sum exception class
