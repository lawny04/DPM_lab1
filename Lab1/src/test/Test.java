package test;

import carros.CarroBase;
import carros.Crossover;
import carros.Pickup;
import carros.Sedan;
import carros.Suv;
import motores.MotorDiesel;
import motores.MotorGasolina;

public class Test {
	
	
	

	public static void main(String[] args) {
	     //CarroBase carro = new CarroBase(); //composition
	     //carro.imprimirCategoria();

		MotorGasolina motorGasolina = new MotorGasolina();//composicion
		MotorDiesel diesel = new MotorDiesel();
		
		//inyectando una instancia de motor gasolina al carro sedan
		//esto lo permite el polimorfismo
		//CarroBase carro = new Sedan(motorGasolina);//polimorfismo
		//carro.imprimirCategoria();

		
		/// objeto crossover
		CarroBase crossover = new Crossover(motorGasolina);//polimorfismo
		crossover.imprimirCategoria();
		CarroBase crossoverD = new Crossover(diesel);//polimorfismo
		crossoverD.imprimirCategoria();
		
	}
	
}
