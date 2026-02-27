package ExceptionHandling;

public class ThrowKeyword {
	
	public static void main(String[] args) {
		
		String data = null;
		if(data == null) {
			try {
			throw new Exception("DATANOTFOUND");
			}
			catch(Exception e) {
				System.out.println("exception is comming");
				e.printStackTrace(); 
			}
		}
		
	}

}
