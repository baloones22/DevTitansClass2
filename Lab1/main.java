class Main {

    public static void main(String[] args){


        Motor cavaloRed;
        Motor cavaloLaranja;
        cavaloLaranja= new Motor("orange dragon",(float) 50.0);
        cavaloRed= new Motor("red dragon",(float) 50.0);
        Aviao vacaloLaranja;
        vacaloLaranja= new Aviao("blue Dragon","frankstein");
        vacaloLaranja.imprimaOk();
        

        System.out.println("Model:"+vacaloLaranja.getModelo()+"\nID:"+vacaloLaranja.getIdentificador()+
                            "\nStatus:"+vacaloLaranja.getMotor()+"\nAltura:"+vacaloLaranja.getAltura());        ;
        vacaloLaranja.ligarMotor();        
        vacaloLaranja.imprimeEstadoMotor();
        vacaloLaranja.desligarMotor();
        vacaloLaranja.imprimeEstadoMotor();
        vacaloLaranja.ligarMotor();
        vacaloLaranja.acelerar();
        vacaloLaranja.acelerar(); 
        vacaloLaranja.desligarMotor(); 
        vacaloLaranja.acelerar();  

        vacaloLaranja.ligarMotor();
        vacaloLaranja.desacelerar(); 
        vacaloLaranja.desacelerar(); 
        vacaloLaranja.desacelerar(); 
        vacaloLaranja.desligarMotor();
        vacaloLaranja.desacelerar(); 
        

        vacaloLaranja.ligarMotor();
        vacaloLaranja.acelerar(); 
        vacaloLaranja.acelerar(); 
        vacaloLaranja.acelerar();
        vacaloLaranja.acelerar(); 
        vacaloLaranja.acelerar(); 
        
        vacaloLaranja.desacelerar();
        vacaloLaranja.desacelerar();
        vacaloLaranja.desacelerar();
        vacaloLaranja.desacelerar();
        vacaloLaranja.desacelerar();
        vacaloLaranja.desacelerar();
        vacaloLaranja.desligarMotor();
    }
    
}
