package com.qa;

import java.util.Collection;
import java.util.HashMap;

public class main {

	public static void main(String[] args) {
		translateMorse();
	}

	public static void translateMorse() {
		String morseToEnglishPre = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
		morseToEnglishPre = morseToEnglishPre.toLowerCase();
		String[] morseToEnglish = morseToEnglishPre.split(" ");

		int i = 0;
		while (i < morseToEnglish.length) {
			HashMap<String, Character> morseAlphabet = new HashMap<>();
			morseAlphabet.put(".-", 'A');
			morseAlphabet.put("-...", 'B');
			morseAlphabet.put("-.-.", 'C');
			morseAlphabet.put("-..", 'D');
			morseAlphabet.put(".", 'E');
			morseAlphabet.put("..-.", 'F');
			morseAlphabet.put("--.", 'G');
			morseAlphabet.put("....", 'H');
			morseAlphabet.put("..", 'I');
			morseAlphabet.put(".---", 'J');
			morseAlphabet.put("-.-", 'K');
			morseAlphabet.put(".-..", 'L');
			morseAlphabet.put("--", 'M');
			morseAlphabet.put("-.", 'N');
			morseAlphabet.put("---", 'O');
			morseAlphabet.put(".--.", 'P');
			morseAlphabet.put("--.-", 'Q');
			morseAlphabet.put(".-.", 'R');
			morseAlphabet.put("...", 'S');
			morseAlphabet.put("-", 'T');
			morseAlphabet.put("..-", 'U');
			morseAlphabet.put("...-", 'V');
			morseAlphabet.put(".--", 'W');
			morseAlphabet.put("-..-", 'X');
			morseAlphabet.put("-.--", 'Y');
			morseAlphabet.put("--..", 'Z');
			morseAlphabet.put("-----", '0');
			morseAlphabet.put(".----", '1');
			morseAlphabet.put("..---", '2');
			morseAlphabet.put("...--", '3');
			morseAlphabet.put("....-", '4');
			morseAlphabet.put(".....", '5');
			morseAlphabet.put("-....", '6');
			morseAlphabet.put("--...", '7');
			morseAlphabet.put("---..", '8');
			morseAlphabet.put("----.", '9');
			morseAlphabet.put("/", ' ');

			Collection<Character> values = morseAlphabet.values();
			for (Character string : values) {
				System.out.print(string + " ");

//				System.out.println(morseToEnglishPre + " ");
//				System.out.println(morseToEnglish[i]);
			}
			i++;

		}
		System.out.println(" ");
		System.out.print("Expected = HELLO DAILY PROGRAMMER GOOD LUCK ON THE CHALLENGES TODAY");
	}
}
