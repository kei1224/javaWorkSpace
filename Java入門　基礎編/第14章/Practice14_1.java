import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Practice14_1.java{
	public static void main (String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance ();
		c.setTime (now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, day += 100);
		Date after = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("¼—ïyyyy”NMMŒdd“ú");
		String s = f.format(after);
		System.out.println(s);
	}
}