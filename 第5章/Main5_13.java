public class Main5_13{
	public static void main(String[] args){
		Pocket<Object> pocket = new Pocket<Object>();
		System.out.println("�g���̂ẴC���X�^���X�����pocket�ɓ���܂�");
		pocket.put(new Object(){
			String innerField;
			void innerMethod(){
				
			}
		});
	}
}