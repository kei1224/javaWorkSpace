public class Hero extends Character{
	public void attack(Monster m){
		System.out.println(this.name + "�̍U���I");
		System.out.println("�G��10�|�C���g�̃_���[�W����������");
		m.hp -= 10;
	}
}