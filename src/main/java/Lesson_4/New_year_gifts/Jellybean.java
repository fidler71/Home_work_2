package Lesson_4.New_year_gifts;

	public class Jellybean extends Present {
		private String type;

		public Jellybean(){}

		public Jellybean(String name, int weight, Double price, String type) {
			super(name, weight, price);
			this.type = type;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public String toString(){
			return "Jellybean: "+super.toString() + ", Тип: "+type;
		}

	}


