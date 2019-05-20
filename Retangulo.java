package semana8;

public class Retangulo implements IShape,IShow{
	
	private double h;
	private double l;

    public Retangulo(double h , double l){
    	this.h = h;
    	this.l = l;
    }
	@Override
	public double getArea() {
		return h*l;
	}
	@Override
	public void print(){
    System.out.printf("A area do retangulo é: %.2f \n", getArea());
    System.out.printf("O perimetro do retangulo é: %.2f \n", getPerimetro());
	}
	@Override
	public double getPerimetro() {
		return 2*(h + l);
	}

}
