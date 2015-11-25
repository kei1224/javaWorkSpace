public class Matango{
	int hp = 50;
	private char suffix;
	public void attack(Hero h){
		System.out.println("ƒLƒmƒR" + this.suffix + "‚ÌUŒ‚");
		System.out.println("‚P‚O‚Ìƒ_ƒ[ƒW");
		h.setHp(h.getHp() -10);
	}
}