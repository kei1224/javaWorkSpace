public class Outer{
	int outerMember;
	void outerMethod(){
		int a = 10;
		class Inner{
			public void innerMethod(){
				System.out.println("innerMethod�ł�");
				System.out.println(outerMember);
			}
		}
		Innner ic = new Inner();
		ic.innerMethod();
	}
}