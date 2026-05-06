/**

        * File: Lesson 5.3

        * Author: Peter

        * Date Created: May 6, 2026

        * Date Last Modified: May 6, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {
		char[] inputArr = {'a', 'b', 'a', 'c', 'a'};
         char[] expected = {'b', 'c'};
		char[] result = removeChars(inputArr, 'a');
		for (int i = 0;i < result.length; i++) {
			System.out.print(result[i]);
		}

	}
	public static String[] addString(String[] strArray, String str, int index){

		String[] newArray = new String[strArray.length + 1];

		for (int i = 0; i < newArray.length; i++){
			if (i < index) {
				newArray[i] = strArray[i];
			}
			else if (i == index) {
				newArray[i] = str;
			}
			else {
				newArray[i] = strArray[i - 1];
			}
		}
		return newArray;

	}

	public static char[] removeChars(char[] character, char regchar){
		int counter = 0;
		for (int i = 0; i < character.length; i++){
			if (character[i] != regchar){
				counter++;
			}

		}
		char[] result = new char[counter];
		int index = 0;
		for (int i = 0; i < character.length; i++){
			if (character[i] != regchar){
			result[index] = character[i];
			index++;
			}
		}
		return result;
	}
	

}
