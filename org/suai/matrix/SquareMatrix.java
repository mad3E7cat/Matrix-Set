package org.suai.matrix;
import org.suai.matrix.*;
import org.suai.exception.*;
public class SquareMatrix extends Matrix{
	public SquareMatrix(int size){
		super(size, size);
		rows = columns = size;
		matrix = new int[rows][columns];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < columns; j++){
				matrix[i][j] = (i == j) ? 1 : 0;
			}
		}
	}
	public SquareMatrix sum(SquareMatrix m){
		SquareMatrix res = new SquareMatrix(rows);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				res.setElement(i, j, (matrix[i][j] + m.getElement(i, j)));
			}
		}
		return res;
	}
}