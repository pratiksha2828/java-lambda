package lambdaexpdemo;


interface MathOperation{
	int operation(int a,int b);
}
public class lambda {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation add=(a,b)->a+b;
		MathOperation sub=(a,b)->a-b;
		MathOperation mul=(a,b)->a*b;
		MathOperation div=(a,b)->((b!=0)? a/b:0);
		System.out.println("add:"+add.operation(20, 30));
		System.out.println("sub:"+sub.operation(40, 20));
		System.out.println("mul"+mul.operation(2, 10));
		System.out.println("div:"+div.operation(40, 0));

	}

}
