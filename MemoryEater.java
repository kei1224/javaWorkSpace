public class MemoryEater{
	public static void main(String[] args){
		System.out.println("MemoryEaterを起動しました。");
		Class<?> info = MemoryEater.class;
		System.out.println(info.getName());
		long[] memoryEater = new long[1280000];
		for(int i = 0; i < memoryEater.length; i++){
			memoryEater[i] = i;
		}
	}
}