import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.lang.String;

public class JavaLibraries {

	public static void main(String[] args) {

		Date today = new Date();
		
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(today);
		calendar.set(Calendar.DAY_OF_MONTH,calendar.get(Calendar.DAY_OF_MONTH)-1);
		System.out.println(calendar.getTime());
		
		GregorianCalendar birthday= new GregorianCalendar(1936,3,16);
		Date birthdayDate = birthday.getTime();
		
		
		System.out.println(today);
		System.out.println(birthdayDate);
		System.out.println(birthday);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    String prettyDate = sdf.format(birthdayDate);
		System.out.println(prettyDate);
		
		LocalDateTime theDateAndTime = LocalDateTime.now();
		LocalDateTime anotherDateAndTime = LocalDateTime.of(2023, 8, 3, 11, 26);
		LocalDate someDate = LocalDate.of(2023, 8, 3);
		LocalTime someTime = LocalTime.from(anotherDateAndTime);
		
		System.out.println(theDateAndTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm")));
		System.out.println(someTime);
		
		
		LocalDate yesterday = LocalDate.now().minusDays(1);
		LocalDate myBirthday = LocalDate.of(2000, 11, 25);
		Period difference = Period.between(myBirthday, yesterday);
		System.out.println("There are " + difference.getYears() + "years and " + difference.getMonths() + "months, and " + difference.getDays() + "days between yesterday and myBirthday												");
		
		
		
		
		
	}

}
