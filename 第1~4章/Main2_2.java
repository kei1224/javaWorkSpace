import java.time.*;

public class Main2_2{
	public static void main (String[] args){
		Instant i1 = Instant.now();
		
		Instant i2 = Instant.ofEpochMilli(31920291332L);
		long l = i2.toEpochMilli();
		
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 5, ZoneId.of("Asia/Tokyo"));
		
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		
		System.out.println("�����F" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("�����h���F" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		if(z2.isEqual(z3)){
			System.out.println("�����͓����u�Ԃ��w���Ă��܂�");
		}
	}
}