import java.io.*;

class UserNotFoundException  extends Exception{

	public UserNotFoundException(){
		System.out.println("User Not Found Constructor");
	}

	public String toString(){
		return "From UNF toString()";
		
	}
}

class ValidationClass{
	
	public void validate(){
		try{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader  br = new BufferedReader(isr);

		
		System.out.println("Enter username");
		String un= br.readLine();

		System.out.println("Enter password");
		String pwd=br.readLine();


		if(un.equals("priya") && pwd.equals("pass")){
			System.out.println("Welcome  " +  un);
		}
		else{
			throw new UserNotFoundException();
		}
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		catch(UserNotFoundException unf){
			System.out.println("User Not Found");
		}

	}

}




class CustomException{

	public static void main(String[] args)
	{
		ValidationClass vc = new ValidationClass();
		vc.validate();
	}

}