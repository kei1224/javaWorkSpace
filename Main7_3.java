import java.util.*;

public class Main7_3{
	public static void main(String[] args){
		System.out.println("�����p��Java�̃o�[�W����:");
		System.out.println(System.getProperty("java.version"));
		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("�y�V�X�e���v���p�e�B�ꗗ�z");
		while(i.hasNext()){
			String key = i.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}
	}
}