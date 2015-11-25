import java.util.*;

class Hero{
	private String name;
	public Hero(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}

public class Practice3_1{
	public static void main(String[] args){
		Hero h1 = new Hero("Ö“¡");
		Hero h2 = new Hero("—é–Ø");
		List<Hero> heroes = new ArrayList<>();
		heroes.add(h1);
		heroes.add(h2);
		Iterator<Hero> it = heroes.iterator();
		while(it.hasNext()){
			Hero h = it.next();
			System.out.println(h.getName());
		}
		
		Map<Hero, Integer> heroes2 = new HashMap<>();
		heroes2.put(h1, 3);
		heroes2.put(h2, 7);
		for(Hero h : heroes2.keySet()){
			int i = heroes2.get(h);
			System.out.println(h.getName() + "‚ª“|‚µ‚½“G" + i);
		}
	}
}