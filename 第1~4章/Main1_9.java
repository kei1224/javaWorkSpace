public class Main1_9 {
	public static void main (String[] args){
		final String FORMAT = "%8s &6s Š‹à%,5d";
		String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		System.out.println(s);
	}
}