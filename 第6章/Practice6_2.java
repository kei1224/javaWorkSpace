public class Practice6_2{
	public static void main(String[] args){
		Func1 func1 = x -> (x % 2 == 1);
		Func2 func2 = (male, name) ->{
			if(male == true){
				return "Mr." + name;
			}else{
				return "Ms.." + name;
			}
		};
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