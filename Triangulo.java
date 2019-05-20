package semana8;

public class Triangulo implements IShape,IShow {
	private double l1;
	private double l2;
	private double l3;

	public Triangulo(double l1 , double l2 , double l3){
	    this.l1 = l1;
	    this.l2 = l2;
	    this.l3 = l3;
	}
	@Override
	public void print() {
		 System.out.printf("A area do triangulo é = %.2f \n", getArea());
		 System.out.printf("O perimetro do triangulo é= %.2f \n", getPerimetro());
		
	}

	@Override
	public double getArea() {
		double p = l1 + l2 + l3;
		p= p*(p-l1)*(p-l2)*(p-l3);
		p= Math.sqrt(p);
	    return p;
	}

	@Override
	public double getPerimetro() {
		return l1+l2+l3;
	}
	
	public double getLado1() {
		return l1;
	}
	public void setLado1(double l1) {
		this.l1 = l1;
	}
	public double getLado2() {
		return l2;
	}
	public void setLado2(double l2) {
		this.l2 = l2;
	}
	public double getLado3() {
		return l3;
	}
	public void setLado3(double l3) {
		this.l3 = l3;
	}

}