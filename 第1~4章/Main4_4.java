import java.util.*;

class Hero{
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
	public int hashCode(){
		int result = 37;
		result = result * 31 + name.hashCode();
		return result;
	}
}

public class Main4_4{
	public static void main(String[] args){
		Set<Hero> list = new HashSet<Hero>();
		Hero h1 = new Hero();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数＝" + list.size());
		h1 = new Hero();
		h1.name = "ミナト";
		System.out.println(h1.hashCode());
		list.remove(h1);
		System.out.println("要素数＝" + list.size());
	}
}