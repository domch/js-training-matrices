package tests;

import java.util.ArrayList;
import java.util.Arrays;

public class IW_Matrix {

	public static void main(String[] args) {
		Matrix mtx1 = new Matrix();
		mtx1.push(new ArrayList<>(Arrays.asList(4, 8, 12)));
		mtx1.push(new ArrayList<>(Arrays.asList(1, 2, 3)));
		mtx1.push(new ArrayList<>(Arrays.asList(1, 2, 3)));

		Matrix mtx2 = new Matrix();
		mtx2.push(new ArrayList<>(Arrays.asList(2, 2, 2)));
		mtx2.push(new ArrayList<>(Arrays.asList(1, 2, 3)));
		mtx2.push(new ArrayList<>(Arrays.asList(1, 2, 3)));

		/*
		 * System.out.println("Add:"); mtx1.add(mtx2).display();
		 * System.out.println("Substract:"); mtx1.substract(mtx2).display();
		 * System.out.println("Multiply:"); mtx1.multiply(mtx2).display();
		 * System.out.println("Divide:"); mtx1.divide(mtx2).display();
		 */
		mtx1.multiply(mtx2).display();

	}

}
