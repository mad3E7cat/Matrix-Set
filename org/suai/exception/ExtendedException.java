package org.suai.exception;
import org.suai.matrix.*;
public class ExtendedException extends RuntimeException{
	public ExtendedException(String msg){ // throw new ExtendedException(i, j); in case of calling unexisting element
		super(msg);
	}
}