package semana8;

import java.util.InputMismatchException;
import java.util.Scanner;
public class TestInterfaces {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    try{	
    System.out.println("Retangulo");
	System.out.println("Altura:");
	float h = input.nextFloat();
	System.out.println("Largura:");
	float l = input.nextFloat();
	Retangulo retangulo = new Retangulo(altura,largura);
	retangulo.getPerimetro();
	retangulo.print();
	System.out.println("__________\n");
	System.out.println("Lado 1:");
	float l1 = input.nextFloat();
	System.out.println("Lado 2:");
	float l2 = input.nextFloat();
	System.out.println("Lado 3:");
	float l3 = input.nextFloat();
	Triangulo tri = new Triangulo(l1,l2,l3);
	tri.getArea();
	tri.getPerimetro();
	tri.print();
	System.out.println("__________\n");
	System.out.println("Círculo");
	System.out.println("Raio:");
	float r = input.nextFloat();
	Circulo cir = new Circulo(r);
	cir.getArea();
	cir.getPerimetro();
	cir.print();
}
  catch(InputMismatchException e1){
    System.out.println("Digite somente numeros");	
    }
  catch(Exception e){
    	System.out.println("Erro");
    }
  finally{
	  System.out.println("Fim");
	  input.close();
  }
}
}
