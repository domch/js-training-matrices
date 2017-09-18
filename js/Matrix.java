package tests;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
	private ArrayList<ArrayList> matrix;

	private enum Operations {
		ADD, SUBSTRACT, MULTIPLY, DIVIDE
	};

	public Matrix() {
		matrix = new ArrayList<ArrayList>();
	}

	public ArrayList<ArrayList> getMatrix() {
		return matrix;
	}

	public ArrayList<ArrayList> setMatrix(ArrayList<ArrayList> _matrix) {
		return this.matrix = _matrix;
	}

	public ArrayList<ArrayList> push(List list) {
		matrix.add((ArrayList) list);
		return matrix;
	}

	public Matrix add(Matrix mtx) {
		return this.calculate(mtx, Operations.ADD);
	}

	public Matrix substract(Matrix mtx) {
		return this.calculate(mtx, Operations.SUBSTRACT);
	}

	public Matrix multiply(Matrix mtx) {
		return this.calculate(mtx, Operations.MULTIPLY);
	}

	public Matrix divide(Matrix mtx) {
		return this.calculate(mtx, Operations.DIVIDE);
	}

	private Matrix calculate(Matrix mtx, Operations operant) {
		ArrayList<ArrayList> result = new ArrayList<ArrayList>();
		for (int i = 0; i < matrix.size(); i++) {
			ArrayList a = new ArrayList();
			for (int k = 0; k < matrix.size(); k++) {
				int first = (int) this.getMatrix().get(i).get(k);
				int second = (int) mtx.getMatrix().get(i).get(k);
				int total = 0;
				switch (operant) {
					case ADD:
						total = first + second;
						break;
					case SUBSTRACT:
						total = first - second;
						break;
					case MULTIPLY:
						total = first * second;
						break;
					case DIVIDE:
						total =  second == 0 ? 0 : first / second;
						break;
				}
				a.add(total);
			}
			result.add(a);
		}
		this.setMatrix(result);
		return this;
	}

	public void display() {
		for (int i = 0; i < matrix.size(); i++) {
			for (int k = 0; k < matrix.get(i).size(); k++) {
				System.out.print(matrix.get(i).get(k));
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
