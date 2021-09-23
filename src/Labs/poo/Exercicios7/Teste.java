package Labs.poo.Exercicios7;

public class Teste {

	public static void main(String[] args) {
		Quadrado qd = new Quadrado();
		qd.setNome("Quadrado");
		qd.setLado(2);

		Circulo cr = new Circulo();
		cr.setNome("Circulo");
		cr.setRaio(2);

		Triangulo tr = new Triangulo();
		tr.setNome("Triangulo");
		tr.setAltura(2);
		tr.setBase(3);

		Cubo cb = new Cubo();
		cb.setNome("Cubo");
		cb.setAresta(3);

		Cilindro cl = new Cilindro();
		cl.setNome("Cilindro");
		cl.setAltura(3);
		cl.setRaio(2);

		Piramide pi = new Piramide();
		pi.setNome("Piramide");
		pi.setAltura(3);
		pi.setApotema(4);
		pi.setArestaBase(2);
		pi.setNumPoliBase(4);
		pi.setBase(qd);

		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		figuras[0] = qd;
		figuras[1] = cr;
		figuras[2] = tr;
		figuras[3] = cb;
		figuras[4] = cl;
		figuras[5] = pi;

		for (FiguraGeometrica fig : figuras) {
			System.out.print(":: ");
			System.out.println(fig.getNome());
			if(fig instanceof Figura2D) {
				Figura2D f2d =(Figura2D) fig;
				System.out.println(f2d.calcularArea()); 
			}
			
			if(fig instanceof Figura3D) {
				Figura3D f3d = (Figura3D)fig;
				System.out.println(f3d.calcularArea());
				System.out.println(f3d.calcularVolume());
			}
		}
	}

}
