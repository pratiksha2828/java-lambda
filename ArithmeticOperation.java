package lambdaexpdemo;

class Arithmetic{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	
}
public class ArithmeticOperation {
	public static void main(String []args) {
		Arithmetic op=new Arithmetic();
		System.out.println(op.add(10,40));
		System.out.println(op.sub(40,10));
	}

}
