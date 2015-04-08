/**
 * 
 */

/**
 * @author irvin
 *
 */
public class HelloWorldAgain {

	/**
	 * 
	 */
	private String myText;
	
	
	public HelloWorldAgain() {
		// TODO Auto-generated constructor stub
		this.myText = "Hello World, once again ... i'm back!";
	}

	public String getMyText(){
		return this.myText;
	}

	public void setMyText(String newText){
		this.myText = newText;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldAgain myHelloWorldObj = new HelloWorldAgain();
		
		String stuff2PrintOut = "";
		stuff2PrintOut = myHelloWorldObj.getMyText();
		
		System.out.println(stuff2PrintOut);
		
		myHelloWorldObj.setMyText("This used to be cool right? It's going to be so again!");
		
		System.out.println(myHelloWorldObj.getMyText());
	}

}
