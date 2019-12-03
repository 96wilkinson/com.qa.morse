package com.qa;

import java.util.Collection;
import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		translateMorse();
	}

	public static void translateMorse() {
		String morseToEnglishPre = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
		String morseToEnglish = morseToEnglishPre.toLowerCase();


		int i = 0;
		while (i < morseToEnglish.length()) {
			HashMap<Character, String> morseMap = new HashMap<>();
			morseMap.put('a', ".-");
			morseMap.put('b', "-...");
			morseMap.put('c', "-.-");
			morseMap.put('d', "-..");
			morseMap.put('e', ".");
			morseMap.put('f', "..-.");
			morseMap.put('g', "--.");
			morseMap.put('h', "....");
			morseMap.put('i', "..");
			morseMap.put('j', ".---");
			morseMap.put('k', "-.");
			morseMap.put('l', ".-..");
			morseMap.put('m', "--");
			morseMap.put('n', "-.");
			morseMap.put('o', "---");
			morseMap.put('p', ".--.");
			morseMap.put('q', "--.-");
			morseMap.put('r', ".-.");
			morseMap.put('s', "...");
			morseMap.put('t', "-");
			morseMap.put('u', "..-");
			morseMap.put('v', "...-");
			morseMap.put('w', ".--");
			morseMap.put('x', "-..-");
			morseMap.put('y', "-.--");
			morseMap.put('z', "--..");
			morseMap.put(' ', "/");

			Collection<String> values = morseMap.values();
			for (String String : values) {
				System.out.print(values);
			}
			i++;
		}
		System.out.println(" ");
		System.out.println(morseToEnglishPre);
		System.out.print("Expected = HELLO DAILY PROGRAMMER GOOD LUCK ON THE CHALLENGES TODAY");
	}
}
