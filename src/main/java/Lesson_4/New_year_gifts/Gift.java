package Lesson_4.New_year_gifts;

	public class Gift {
		public static void main(String[] args) {
			Candy candy1 = new Candy("Пахлава", 9, 67.2, "Маме");
			Candy candy2 = new Candy("Тянучка", 10, 19.0, "Папе");
			Jellybean ch1 = new Jellybean("Мамба", 11, 15.7, "Розовый");
			Jellybean ch2 = new Jellybean("Супрадин", 20, 100.1, "Горький");

			double sum = 0;
			int weight = 0;

			Present [] gift = {candy1, candy2, ch1, ch2};
			for (Present ny: gift) {
				System.out.println(ny);
				sum += ny.getPrice();
				weight += ny.getWeight();
			}
			System.out.println("Общий вес = "+ weight+ ", Общая сумма = " +sum);
		}
	}


