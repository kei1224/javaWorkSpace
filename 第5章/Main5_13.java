public class Main5_13{
	public static void main(String[] args){
		Pocket<Object> pocket = new Pocket<Object>();
		System.out.println("使い捨てのインスタンスを作りpocketに入れます");
		pocket.put(new Object(){
			String innerField;
			void innerMethod(){
				
			}
		});
	}
}