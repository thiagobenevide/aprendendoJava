package model;

public class DataErroException extends Exception{
	public String msg;

	public DataErroException(Exception e) {
		super();
		this.msg = e.getMessage();
	}
	
	
	
}
