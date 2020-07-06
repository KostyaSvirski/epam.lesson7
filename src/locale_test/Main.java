package locale_test;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("1 - русский \n2 - английский \nлюбой - белорусский");
		for (int i = 0; i < 3; i++) {
			String country = "";
			String language = "";
			switch (i + 1) {
			case 1:
				country = "RU";
				language = "ru";
				break;
			case 2:
				country = "US";
				language = "en";
				break;
			}
			Locale locale = new Locale(language, country);
			ResourceBundle rb = ResourceBundle.getBundle("property.text", locale);
			String first = rb.getString("s1");
			String second = rb.getString("s2");
			System.out.println(i + 1 + ":\n" + first + "\n" + second);
		}

	}

}
