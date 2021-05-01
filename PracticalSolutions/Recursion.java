
public class Recursion {
	
	public int fibonacci(int n) {
		   if ((n < 2))
		      return n;
		   else
		      return fibonacci(n - 1) + fibonacci(n - 2);
		}
	public void towersOfHanoi(int disk, String source, String dest, String auxiliary) {
		int n = 0;
		if ((n == 0)) {
	
		}
		else {
			towersOfHanoi(disk - 1, source, auxiliary, dest);
			towersOfHanoi(disk - 1, auxiliary, dest, source);
		}
	}
}
