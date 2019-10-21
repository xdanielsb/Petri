package logic;
/**
* 
* Exception raised when the user tries to remove jetons from a place which has not enough
* 
* @author  Daniel Santos and Guillem Sanyas
*/
public class InvalidJetonsNumber extends Exception{
	@Override
	public String getMessage() {
		String msg = "The place does not contain enough jetons.";
		return msg;
	}
}
