package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a data no formato dd/MM/yyy HH:mm:ss");
		String data = sc.nextLine();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = sdf.parse(data);
		Date c = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutes = 1 + cal.get(Calendar.MONTH);
		int hours = cal.get(Calendar.HOUR);
		
		
		System.out.println("Data digitada: " + sdf.format(d));
		System.out.println("Mes: " + minutes);
		System.out.println("Horas: " + hours);
		System.out.println(sdf.format(c));
		
		
		
		
		sc.close();
	}

}
