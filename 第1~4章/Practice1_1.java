public class Pructice1_1{
	public static void main(String[] args){
		StringBuilder sb = new StringBuilder();
		for(i = 1; i <= 100; i++){
			sb.sppend(i).append(",");
		}
		String s = sb.toString();
		String[] a = s.split(",");
	}
}