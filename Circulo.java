package semana8;

public class Circulo implements IShow,IShape {
	
    double r;
    
    public Circulo(double r){
    	this.r = r;
    }
    
	@Override
	public double getArea() {
	// pi * (r)^2
		return 3.14*(r*r);
	}

	@Override
	public double getPerimetro() {
	// 2* pi* r
		return 2*3.14*r;
	}

	@Override
	public void print() {
		 System.out.printf("A area do circulo: %.2f \n", getArea());
		 System.out.printf("O perimetro do circulo é: %.2f \n", getPerimetro());
	}

}
