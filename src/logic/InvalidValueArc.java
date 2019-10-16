package logic;
/**
* 
* Exception raised when the user tries to create an invalid ARC
* 
* @author  Daniel Santos and Guillem Sanyas
*/
public class InvalidValueArc extends Exception{
	@Override
	public String getMessage() {
		String msg = "The value of the Arc must be positive.";
		return msg;
	}
}
