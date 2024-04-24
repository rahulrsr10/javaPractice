import java.text.DecimalFormat;

public class StringFormat {
	public static void main(String[] args) {
		String input = "Copay amount is 1234";
		String no=input.replaceAll("[^\\d]", "");
		int n=Integer.parseInt(no);
		DecimalFormat format=new DecimalFormat("#,###");
		System.out.println(format.format(n));
	}

}
