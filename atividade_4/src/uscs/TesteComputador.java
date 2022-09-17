package uscs;

public class TesteComputador {
	public static void main(String[] args) {
		Teclado t = new Teclado (
				"1232",
				"Logitech",
				"preto");
		t.imprimeTeclado();
		System.out.println("----------------");
		
		Monitor mon = new Monitor (
				"AFB876",
				"Samsung",
				"preto");
		mon.imprimeMonitor();
		System.out.println("----------------");
		
		Gabinete g = new Gabinete (
				"4587HHY",
				"Logitech",
				"preto");
		g.imprimeGabinete();
		System.out.println("----------------");
		
		Mouse m = new Mouse (
				"HGY6654",
				"Microsoft",
				"Preto");
		m.iprimeMouse();
		System.out.println("----------------");
				
		Computador cp = new Computador("76TRDE35", m, t, g, mon);
		cp.imprimeComputador();
		
		
	}
}
