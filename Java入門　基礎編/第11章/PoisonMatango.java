public class PoisonMatango extends Matango {
	private int count = 5;
	public PoisonMatango(char suffix){
		super(suffix);
	}
	public void attac(Hero h){
		super.attack(h);
		if(count > 0){
			System.out.println("����ɓł̖E�q���΂�܂����I");
			int dmg = h.getHp() / 5;
			h.setHp(h.getHp() - this.dmg);
			System.out.println(this.dmg + "�|�C���g�̃_���[�W");
			this.count -=1;
		}
	}
}