package tp1Ejer2Package;

public class TP1Ejer2Class {

	public static void main(String[] args) {
		//Ejercicio 2-d
		
		//Variables de entrada.
		 double ingrMen = 489083;
		 int cantVehiculos = 3;
		 int cantInmuebles = 3;
		 boolean naveLujo = true;  
		
		//Si pertenece al segmento de ingresos alto
		if(ingrMen >= 489083 && cantVehiculos >= 3 && cantInmuebles >= 3 && naveLujo == true) {
			System.out.println("La persona pertenece al segmento de ingresos Altos - I.");
		}
		
		//Si pertenece al segmento de ingresos medio nivel II
		if((ingrMen >= 163.539 && ingrMen <= 489083) && cantVehiculos >= 2 && cantInmuebles >= 1 && naveLujo == false) {
			System.out.println("La persona pertenece al segmento de ingresos Medio - II.");
		}
		
		//Si pertenece al segmento de menores ingresos
		if(ingrMen <= 163.539 && cantVehiculos < 1 && cantInmuebles <= 1 && naveLujo == false) {
			System.out.println("La persona pertenece al segmento de Menores ingresos - III.");
		}
	}
	

}
