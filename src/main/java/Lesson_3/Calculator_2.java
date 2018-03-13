package Lesson_3;

/**
 * Created by Ivan.I on 05.03.2018.
 */
import java.util.Scanner;

public class Calculator_2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.println("Введите первое число:");
		float first = scanner.nextFloat();
		System.out.println("Введите второе число:");
		float second = scanner.nextFloat();

		System.out.println("Выберите операцию (+,-,*,/): ");
		char op = scanner.next().charAt(0);

		switch (op) {
			case '+':
				System.out.printf("Sum: %.4f\n", addition(first, second));
				break;
			case '-':
				System.out.printf("Div: %.4f\n", subtraction(first, second));
				break;
			case '*':
				System.out.printf("Mult: %.4f\n", multiplication(first, second));
				break;
			case '/':
				System.out.printf("Quot: %.4f\n", division(first, second));
				break;
		}

	}

	/**
	 *
	 * @param a Первое расчётное значение
	 * @param b Второе расчётное значение
	 * @return Возвращаем результат сложения
	 */

	private static float addition (float a, float b){
		return a + b;
	}
	/**
	 *
	 * @param a Первое расчётное значение
	 * @param b Второе расчётное значение
	 * @return Возвращаем результат вычитания
	 */
	private static float subtraction (float a, float b) {
		return a - b;
	}
	/**
	 *
	 * @param a Первое расчётное значение
	 * @param b Второе расчётное значение
	 * @return Возвращаем результат умножения
	 */
	private static float multiplication (float a, float b){
		return a * b;
	}
	/**
	 *
	 * @param a Первое расчётное значение
	 * @param b Второе расчётное значение
	 * @return Возвращаем результат деления
	 */
	private static float division (float a, float b){
		return a / b;
	}

}



