public class Main1_4 {
	public static void main (String[] srgs){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10000; i++){
			sb.append("Java");
		}
		String s = sb.toString();
	}
}