public class Practice6_1{
	public static boolean isOdd(int x){return (x % 2 == 1);}
	public static String addNamePrefix(boolean male, String name){
		if (male == true){return "Mr." + name;}
		else{return "Ms." + name;}
	}
	public static void main(String[] args){
		Func1 func1 = Practice6_1::isOdd;
		Func2 func2 = Practice6_1::addNamePrefix;
		boolean a = func1.call(5);
		if(a){
			System.out.println("����͊");
		}else{
			System.out.println("����͋���");
		}
		String b = func2.call(true, "Yamada");
		System.out.println("���O��" + b);
	}
}