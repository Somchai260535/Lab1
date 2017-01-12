package Rmuti.Lab1;

public class App {
	public static void main(String[] args) {
		ArrayOperation obj = new ArrayOperation();

		int sumObj = obj.SumArrays();
		System.out.println("Sum = " + sumObj);

		int maxObj = obj.MaxArrays();
		System.out.println("Max = " + maxObj);

	}
}
