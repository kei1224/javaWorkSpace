import java.util.*;

class Hero {
	public String name;
}

public class Main3_9{
	public static void main(String[] args){
		Hero h = new Hero();
		h.name = "�~�i�g";
		List<Hero> list = new ArrayList<Hero>();
		list.add(h);
		h.name = "�X�K����";
		System.out.println(list.get(0).name);
	}
}