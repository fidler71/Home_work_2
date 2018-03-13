package Lesson_3;

import java.util.Scanner;
/**
 * Поиск максимального элемента в массиве.
 * Для начала задать массив слов.Размерность массива произвольна, задается в консоли.
 * После чего в консоли вводятся слова в количестве равном заданной длине массива.
 * В полученном массиве необходимо найти самое длинное слово.
 * Результат вывести на консоль
 */

public class Max_Massiv {
	static Scanner sc = new Scanner(System.in);
	private static String[] createMass(int n){
		String[] Mass = new String[n];
		for (int i=0; i<n; i++){
			Mass[i] = sc.next();
		}
		return Mass;
	}
	private static int searchFirstBigElement(String[] mas){
		int indexOfMaxLength=0;
		for (int i=0; i<mas.length; i++){
			if (mas[indexOfMaxLength].length() < mas[i].length()) indexOfMaxLength = i;
		}
		return indexOfMaxLength;
	}
	public static void arrayOfString() {
		System.out.println("Задать размер массива");
		int lengthOfMass = sc.nextInt();
		System.out.println("Введите слова");
		String [] mass = createMass(lengthOfMass);
		System.out.println("Самое длинное слово в данном массиве это: " + mass[searchFirstBigElement(mass)]);
	}

}
