package Clases;

public class Principal {

	public static void main(String[] args) {
		Computadora computadoras[] = new Computadora[4];
		
		Computadora c4 = new Computadora(3.4f, 23423f, 6666666, "1024x1090","Rojo","Linux","Lenovo","R45");

		Computadora c1 = new Computadora();
		c1.setColor("Rojo");
		c1.setMarca("DELL");
		c1.setModelo("ND344");
		c1.setSistemaOperativo("Linux");
		
		System.out.println(c1);
		
		Computadora c2 = new Computadora();
		c2.setColor("Verde");
		c2.setMarca("Asus");
		c2.setModelo("ROG");
		c2.setSistemaOperativo("Windows");
		
		Computadora c3 = new Computadora();
		c3.setColor("Anaranjada");
		c3.setMarca("Mac");
		c3.setModelo("Nose");
		c3.setSistemaOperativo("X");
		
		
		computadoras[0] = c1;
		computadoras[1] = c2;
		computadoras[2] = c3;
		computadoras[3] = c4;
		
	}

}

