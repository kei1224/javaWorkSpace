public interface MyFunction{
	public abstract int call(int x, int y);
}

public class Main6_3{
	public static int sub(int a, int b){
		return a - b;
	}
	public static void main(String[] args){
		MyFunction func = Main6_3::sub;
		int a = func.call(5, 3);
		System.out.println("5-3‚Í" + a);
	}
}