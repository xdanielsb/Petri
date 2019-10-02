package logic;

public class InvalidValueArc extends Exception{
	@Override
	public String getMessage() {
		String msg = "The value of the Arc must be positive.";
		return msg;
	}

}
