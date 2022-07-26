class Main{

	public static void main(String[] args){
	
	     Aviao baraoVermelho;
	          
	     baraoVermelho = new Aviao("Fokker DR1","Freiherr");     
	     baraoVermelho.imprimaOk();
	     
	          
	     System.out.println("Modelo: "+baraoVermelho.getModelo()+
	     			"\nId: "+baraoVermelho.getIdentificador()+
	     			"\nStatus Motor: "+baraoVermelho.getMotor()+
	     			"\nAltura: "+baraoVermelho.getAltura());
	     			     
	    baraoVermelho.ligarMotor();
	    baraoVermelho.imprimeEstadoMotor(); 		
	    baraoVermelho.desligarMotor();
	    baraoVermelho.imprimeEstadoMotor();  
	    
	    baraoVermelho.ligarMotor();
	    baraoVermelho.acelerar();
	    baraoVermelho.acelerar();
	    baraoVermelho.desligarMotor();
	    baraoVermelho.acelerar();
	    
	    baraoVermelho.ligarMotor();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desligarMotor();
	    baraoVermelho.desacelerar();
	    
	    baraoVermelho.ligarMotor();
	    baraoVermelho.acelerar();
	    baraoVermelho.acelerar();	
	    baraoVermelho.acelerar();
	    baraoVermelho.acelerar();    
	    baraoVermelho.acelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();
	    baraoVermelho.desacelerar();   
	    	 			
	}
}


/*
 
 baraoVermelho.setModelo("Fokker DR1");
	     baraoVermelho.setIdentificador("Freiherr");
	     baraoVermelho.setMotor(false);
	     baraoVermelho.setAltura(0.0f);
	     
*/



