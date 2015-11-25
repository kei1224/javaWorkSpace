public class Main7_5{
	public static void main(String[] args){
		Class<?> info1 = String.class;
		System.out.println(info1.getSimpleName());
		System.out.println(info1.getName());
		System.out.println(info1.getPackage().getName());
		System.out.println(info1.isArray());
		Class<?> info2 = info1.getSuperclass();
		Class<?> info3 = args.getClass();
		System.out.println(info3.isArray());
	}
}