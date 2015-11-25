public class PoisonMatango extends Matango {
	private int count = 5;
	public PoisonMatango(char suffix){
		super(suffix);
	}
	public void attac(Hero h){
		super.attack(h);
		if(count > 0){
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.getHp() / 5;
			h.setHp(h.getHp() - this.dmg);
			System.out.println(this.dmg + "ポイントのダメージ");
			this.count -=1;
		}
	}
}