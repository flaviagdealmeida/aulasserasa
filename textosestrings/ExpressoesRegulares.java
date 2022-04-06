package textosestrings;

public class ExpressoesRegulares {

	private String email;

	
	public ExpressoesRegulares(String email) {
		if (email== null || ! email.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			System.out.println("Email invalido");
		}
		
		this.email = email;
	}
	
	
	public String getEmail() {
		return this.email;
	}
	
	
	
	
	
	
}
