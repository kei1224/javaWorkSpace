import java.util.*;

public class Main3_8{
	public static void main(String[] args){
		Map<String, Integer> prefs = new HashMap<>();
		prefs.put("���s�{", 255);
		prefs.put("�����s", 1261);
		prefs.put("�F�{��", 182);
		for(String key : prefs.keySet()){
			int value = prefs.get(key);
			System.out.println(key + "�̐l���́A" + value);
		}
	}
}