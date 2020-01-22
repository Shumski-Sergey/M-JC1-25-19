package d.grigirchik.examples.lection6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
	public static void main(String[] args) {
		//регулярные выр. применимы для создания шаблона в строке
		//Класс Pattern применяется для определения регулярных выражений (шаблонов),
		// для которых потом ищутся соотвествие в строке, файле или др. объекте, содержащий символы
		// для определения шаблона применяются спец. синтаксические конструкции.
		// о каждом соотвествии можно получить инф. с помощью класса Matcher
		String text = "Егор Алла Александр";
		Pattern pattern = Pattern.compile("А.+а");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()){
			System.out.println(text.substring(matcher.start(), matcher.end()));
		}
	}
}
