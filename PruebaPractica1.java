package es.upm.dit.prog.practica1;


public class PruebaPractica1 {
	
	public static void main(String[] args) {
		
		WiFi w1 = new WiFi ("WiFi1", Seguridad.ABIERTA);
		WiFi w2 = new WiFi ("WiFi2", Seguridad.WEP);
		WiFi w3 = new WiFi ("WiFi3", Seguridad.WPA2_EMPRESA);
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);

		w3.setNombre("WiFi3 cambiada");
		w3.setSeguridad(Seguridad.WPA2_PERSONAL);
		System.out.println(w3);
		
		Lectura l1 = new Lectura (w1, -82.0); 
		Lectura l2 = new Lectura (w2, -72.0); 
		Lectura l3 = new Lectura (w3, -69.0); 
		
		System.out.println(l1);			
		System.out.println(l2);
		System.out.println(l3);
		
		
	}

}
