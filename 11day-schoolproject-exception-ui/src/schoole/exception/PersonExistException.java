package schoole.exception;

public class PersonExistException extends Exception{

	private static final long serialVersionUID = 4216517723998972324L;
	
	public PersonExistException(String message) {
		super(message);
	}

}
