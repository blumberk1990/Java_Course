
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factorial = new Factorial();
		System.out.println(factorial.factor(3));	
	}
	public int factor(int n) {	
		return n>1 ? n * factor(n - 1) : 1;
	}
}
