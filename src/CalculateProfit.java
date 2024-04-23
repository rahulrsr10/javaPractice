
public class CalculateProfit {

	public static void main(String[] args) {
		int[] nos = { 22, 3, 5, 11, 12, 8, 10 };
		int min = 0;
		int max = 0;
		int countmin = 0;
		int countmax = 0;
		for (int i = 0; i < nos.length - 1; i++) {
			if(nos[i]<nos[i+1]) {
				min=nos[i];
				countmin = i;
				break;
			}

		}
		for (int i = countmin; i < nos.length - 1; i++) {
			if(nos[i]>nos[i+1]) {
				max=nos[i];
				countmax = i;
				break;
			}

		}
		System.out.println("Profit : "+(max-min)+"Rs.");

	}
}
