package uscs;
import java.util.ArrayList; //'ctrl + shift + o' para criar o import

public class ArrayList01 {
	public static void main(String[] args) {
		ArrayList<String> x = new ArrayList<String>();
		x.add("USCS"); //add para adicionar o texto no array
		x.add("ADS");
		System.out.println(x.toString()); //toString converte o array em string
	}
	
	
}
