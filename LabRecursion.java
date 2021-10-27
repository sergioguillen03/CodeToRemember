package algorithms;

public class LabRecursion {
	public static void main(String[] args) {

		//create some dummy data for our method

		int input = 5;

		LabRecursion eo = new LabRecursion();

		 

		//call the method here

		System.out.println(eo.factorial(input));

		}

		 

		//create your first method here

		public int factorial(int num) {

		if (num <= 0) return 0;

		 

		if (num == 1) return 1;

		 

		return num * factorial(num-1);

		}

		}
