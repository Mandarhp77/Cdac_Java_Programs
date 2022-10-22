package TwoQ3;

class ColourPoint extends Exception {
	private static String colour = "Orange" ;
	
	
	public ColourPoint(String col) throws ColoursNotMatchException {
		if(col != colour) {
	        throw new ColoursNotMatchException();
		}else {
			System.out.println("Colour Matched");
		}
	}
}
