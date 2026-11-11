package logica;

public class Parcial {

	private int a;
	private int b;
	private int c;
	
	public Parcial(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String calcularRaices() throws Exception {
		if (a == 0) {
			throw new Exception ("No se puede ejecutar la solucion");
		}
		
		int discr = (int) Math.pow(b, 2) - 4*a*c;
		
		if (discr < 0) {
			throw new Exception ("Las raices son complejas");
		}
		String raiz = "";
		if (discr == 0) {
			int raizInt = -b/(2*a);
			raiz += raizInt;
		}
		
		else {
			int raiz1 = -b + discr / (2*a);
			int raiz2 = -b - discr / (2*a);
			raiz += raiz1 + ", " + raiz2; 
		}
		
		return raiz;
		 
	}

}
