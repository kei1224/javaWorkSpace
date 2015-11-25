import java.lang.reflect.*;
public class Launcher{
	public static void main(String[] args){
		String fqcn = args[0];
		String startupCode = args[1];
		showMemory();
		try{
			Class<?> clazz = Class.forName(fqcn);
			showMethods(clazz);
			if(startupCode.equals("E")){
				launchProcess(clazz);
			}else if(startupCode.equals("I")){
				launchProcessInternal(clazz);
			}else{
				throw new IllegalArgumentException("起動方法の指定が不正です。");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(1);
		}
		showMemory();
		System.exit(0);
	}
	public static void showMemory(){
		long fMemory = Runtime.getRuntime().freeMemory();
		long tMemory = Runtime.getRuntime().totalMemory();
		long memoryRate = ((tMemory - fMemory) / 1024 / 1024);
		System.out.println("現在のメモリ使用量は" + memoryRate + "MBです。");
	}
	public static void showMethods(Class<?> clazz){
		System.out.println("メソッドの一覧を表示します。");
		Method[] methodArray = clazz.getDeclaredMethods();
		for(Method m : methodArray){
			System.out.println(m.getName());
		}
	}
	public static void launchProcess(Class<?> clazz) throws Exception{
		ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());
		Process proc = pb.start();
		proc.waitFor();
	}
	public static void launchProcessInternal(Class<?> clazz) throws Exception{
		Method m = clazz.getMethod("main", String[].class);
		String[] args = {};
		m.invoke(null, (Object)args);
	}
}