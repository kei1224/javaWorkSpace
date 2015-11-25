public class Main5_1{
	public static void prints(Object a, Object b){
		for(int i = 0; i < (Integer)b; i++){
			System.out.println(a);
		}
	}
	public static void main(String[] args){
		Object s = "‚±‚ñ‚É‚¿‚Í";
		s = new Hero();
		Object n = 1;
		prints(s, n);
	}
}