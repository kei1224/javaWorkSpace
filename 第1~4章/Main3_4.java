import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main3_4{
	public static void main(String[] args){
		Set<String> colors = new HashSet<>();
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		System.out.println("�F��" + colors.size() + "���");
		for(String s : colors){
			System.out.print(s + "��");
		}
		System.out.print("\n");
		Iterator<String> it = colors.iterator();
		while(it.hasNext()){
			String e = it.next();
			System.out.print(e + "��");
		}
	}
}