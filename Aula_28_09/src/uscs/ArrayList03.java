package uscs;

import java.util.ArrayList;

public class ArrayList03 {
	public static void main(String[] args) {
		ArrayList<String> x = new ArrayList<String>();
		
		x.add("ADS");
		x.add("USCS");
		x.add(0, "Essa turma � querida");
		x.add("Essa turma � 10!");
		
		System.out.println(x.toString());
	}
}
