package aulapoo;

import aulapoo.Liquidificador;

public class App {

	public static void main(String[] args) {
		Liquidificador l1 = new Liquidificador();
		
		l1.setMarca("arno");
		l1.setCor("azul");
		l1.setVelocidade(3);
		l1.setTampado(true);
		
		Liquidificador l2 = new Liquidificador();

		l2.setMarca("brastemp");
		l2.setCor("rosa");
		l2.setVelocidade(7);
		l2.setTampado(false);
		
		Liquidificador l3 = new Liquidificador();
		
		l1.status();
		l2.status();
		l3.status();

	}

}
