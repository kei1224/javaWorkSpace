import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main3_4{
	public static void main(String[] args){
		Set<String> colors = new HashSet<>();
		colors.add("Ô");
		colors.add("Â");
		colors.add("‰©");
		colors.add("Ô");
		System.out.println("F‚Í" + colors.size() + "í—Ş");
		for(String s : colors){
			System.out.print(s + "¨");
		}
		System.out.print("\n");
		Iterator<String> it = colors.iterator();
		while(it.hasNext()){
			String e = it.next();
			System.out.print(e + "¨");
		}
	}
}