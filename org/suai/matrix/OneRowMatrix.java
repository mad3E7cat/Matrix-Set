package org.suai.matrix;
import org.suai.matrix.*;
import org.suai.exception.*;
public class OneRowMatrix extends Matrix{
    public OneRowMatrix(int r, int c){
        super(1, c);
        rows = r;
    }
    public int getElement(int i, int j) throws ExtendedException{
        if((i < 0) || (j < 0) || (i > rows) || (j > columns)) throw new ExtendedException("No such element: [" + i + "]" + "[" + j + "]");
        return matrix[0][j];
    }
    public void setElement(int i, int j, int value) throws ExtendedException{
        if((i < 0) || (j < 0) || (i > rows) || (j > columns)) throw new ExtendedException("No such element: [" + i + "]" + "[" + j + "]");
        matrix[0][j] = value;
    }
}