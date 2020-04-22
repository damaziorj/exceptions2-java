package model.exceptions;

public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	private String msg;

	public DomainException(String msg) {
		super();
		this.msg = msg;
	}
	

	
	
}
