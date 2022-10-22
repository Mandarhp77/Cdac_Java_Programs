package TwoQ3;

class ColoursNotMatchException extends Exception{
	String msg;
	
	public ColoursNotMatchException(){
	    msg = "Colour not matched";
	}
	
	public String getMessage() {
		return msg;
	}
}