pulbic class Main4_9{
	public static void main(String[] args){
		Hero h1 = new Hero("�~�i�g");
		Sword s = new Sword("�͂��˂̌�");
		h1.setSword(s);
		System.out.println("�����F" + h1.getSword().getName());
		system.out.println("clone()�ŕ������܂�");
		Hero h2 = h1.clone();
		System.out.println("�R�s�[���̗E�҂̌��̖��O��ς��܂�");
		h1.getSword().setname("�q�m�L�̖_");
		System.out.println("�R�s�[���ƃR�s�[��̗E�҂̑�����\�����܂�");
		System.out.println("�R�s�[���F" + h1.getSword().getname() + "/�R�s�[��F" + h2.getSword().getName());
	}
}