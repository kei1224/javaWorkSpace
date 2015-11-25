public class StrongBox<E>{
	private E data;
	private long count;
	
	public void put(E d){
		this.data = d;
	}
	public E get(){
		count--;
		if(count == 0){
			return this.data;
		}
		return null;
	}
	StrongBox(KeyType s){
		switch(s){
			case PADLOCK: count = 1024;				
			case BUTTON: count = 10000;
			case DIAL: count = 30000;
			case FINGER: count = 1000000L;
		}
	}
}

enum KeyType{
	PADLOCK, BUTTON, DIAL, FINGER;
}