pulbic class Main4_9{
	public static void main(String[] args){
		Hero h1 = new Hero("ミナト");
		Sword s = new Sword("はがねの剣");
		h1.setSword(s);
		System.out.println("装備：" + h1.getSword().getName());
		system.out.println("clone()で複製します");
		Hero h2 = h1.clone();
		System.out.println("コピー元の勇者の県の名前を変えます");
		h1.getSword().setname("ヒノキの棒");
		System.out.println("コピー元とコピー先の勇者の装備を表示します");
		System.out.println("コピー元：" + h1.getSword().getname() + "/コピー先：" + h2.getSword().getName());
	}
}