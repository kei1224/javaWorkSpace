import java.util.*;

class Hero {
	public String name;
	public boolean equals(Object o){
		if(o == this) return true;
		if(o == null) return false;
		if(!(o instanceof Hero)) return false;
		Hero h = (Hero) o;
		if(!this.name.equals(h.name)){
			return false;
		}
		return true;
	}
}

public class Main4_3{
	public static void main(String[] args){
		List<Hero> list = new ArrayList<>();
		Hero h1 = new Hero();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数＝" + list.size());
		h1 = new Hero();
		h1.name = "ミナト";
		list.remove(h1);
		System.out.println("要素数＝" + list.size());
	}
}