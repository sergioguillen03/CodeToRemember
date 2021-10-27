package construct;

public class NestedConstructors {
	 public NestedConstructors(){
		 System.out.println("Default constructor ran.");
		  }

		  public NestedConstructors(int value){
		 System.out.println(value);
		  }

		  public static void main(String[] args) {
		    //create instances here
		    NestedConstructors c = new NestedConstructors(5839);
		    System.out.println(c);

		  }}
