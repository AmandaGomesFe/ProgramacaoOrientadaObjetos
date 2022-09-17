package uscs;

public class Computador {
	
	private String numeroSerie;
	private Mouse mouse;
	private Teclado teclado;
	private Gabinete gabinete;
	private Monitor monitor;
	
	public Computador(String numeroSerie, Mouse mouse, Teclado teclado, Gabinete gabinete, Monitor monitor) {
		super();
		this.numeroSerie = numeroSerie;
		this.mouse = mouse;
		this.teclado = teclado;
		this.gabinete = gabinete;
		this.monitor = monitor;
	}
	
	public Computador() {
		
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Gabinete getGabinete() {
		return gabinete;
	}

	public void setGabinete(Gabinete gabinete) {
		this.gabinete = gabinete;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public void imprimeComputador() {
		System.out.println("Número de serie do computador: " + this.numeroSerie);
		this.gabinete.imprimeGabinete();
		this.teclado.imprimeTeclado();
		this.mouse.iprimeMouse();
		this.monitor.imprimeMonitor();
		
	}
	
	
	
}
