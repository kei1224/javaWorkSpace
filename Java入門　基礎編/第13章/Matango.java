public class Matango{
	int hp = 50;
	private char suffix;
	public void attack(Hero h){
		System.out.println("�L�m�R" + this.suffix + "�̍U��");
		System.out.println("�P�O�̃_���[�W");
		h.setHp(h.getHp() -10);
	}
}