public class Main7_2{
	public static void main(String[] args) throws Exception{
		System.out.println("�v�Z���J�n���܂�");
		System.out.println("�v�Z�����B���ʂ��������ŕ\�����܂��B");
		ProcessBuilder pb = new ProcessBuilder(
			"c:\\windows\\system32\\notepad.exe",
			"calcreport.txt"
		);
		pb.start();
	}
}