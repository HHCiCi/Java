import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Test4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.FRANCE);
		GregorianCalendar g = new GregorianCalendar();
		int today = g.get(Calendar.DAY_OF_MONTH);
		g.set(Calendar.DAY_OF_MONTH, 1);
	    int f = g.getFirstDayOfWeek();
		System.out.println(f);

	}

}
