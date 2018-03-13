package Lesson_4;

/**
 Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 Найти максимальный отрицательный и минимальный положительный элементы массива.
 Поменять их местами.
 */

import java.util.Random;

public class Massiv_20 {
	public static void main(String[] args) {

		Random rand = new Random(); //экземляр рандомизатора

		System.out.println("Массив из 20 случайных целых чисел от -10 до 10: ");

		//генерим массив псевдослучайных чисел от -10 до 10 и выводим его на экран
		int[] randArr = new int[20];
		for (int i = 0; i < randArr.length; i++) {
			randArr[i] = rand.nextInt(21)-10;
			System.out.println(i+": "+ randArr[i]);
		}

		//находим максимальное отрицательное число в массиве и выводим его на экран
		int MaxOtr=-10;

		for (int i = 0; i < randArr.length-1; i++)
		{
			if ((randArr[i]<0) && (randArr[i]>MaxOtr))
			{
				MaxOtr = randArr[i];
				if (randArr[i+1]<0)
				{
					if (MaxOtr > randArr[i+1]) {MaxOtr = randArr[i];} else MaxOtr = randArr[i+1];
				}

			}
		}
		System.out.printf("\nМаксимальное отрицательное: ");
		System.out.println(MaxOtr);


		//находим минимальное положительное число в массиве и выводим его на экран
		int MinPol=10;

		for (int i = 0; i < randArr.length-1; i++)
		{
			if ((randArr[i]>0) && (randArr[i]<MinPol))
			{
				MinPol = randArr[i];
				if (randArr[i+1]>0)
				{
					if (MinPol < randArr[i+1]) {MinPol = randArr[i];} else MinPol = randArr[i+1];
				}
			}
		}
		System.out.printf("\nМинимальное положительное: ");
		System.out.println(MinPol);

		//меняем местами максимальные отрицательные и минимальные положительные числа в массиве и выводим их на экран
		System.out.println("\nМассив после замены минимальных положительных на максимальные отрицательные и наоборот: ");
		for (int i = 0; i < randArr.length; i++)
		{
			if (randArr[i]==MinPol) {randArr[i]=MaxOtr;}
			else if (randArr[i]==MaxOtr) {randArr[i]=MinPol;}

			System.out.println(i +": "+randArr[i]);

		}



	}
}




