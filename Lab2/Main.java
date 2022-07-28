class Main {

    public static void main(String[] args){


        Motor cavaloRed;
        Motor cavaloLaranja;
        cavaloLaranja= new Motor("orange dragon",(float) 50.0);
        cavaloRed= new Motor("red dragon",(float) 50.0);
        Aviao vacaloLaranja;
        vacaloLaranja= new Aviao("blue Dragon","frankstein",cavaloRed,cavaloLaranja);
        vacaloLaranja.imprimaOk();
        

        System.out.println("Model:"+vacaloLaranja.getModelo()+"\nID:"+vacaloLaranja.getIdentificador()+
                            "\nStatus:"+vacaloLaranja.getEstadoMotor()+"\nAltura:"+vacaloLaranja.getAltura());        ;
        vacaloLaranja.ligarMotor(cavaloLaranja);        
        vacaloLaranja.imprimeEstadoMotor();
        vacaloLaranja.desligarMotor(cavaloRed);
        vacaloLaranja.imprimeEstadoMotor();
        vacaloLaranja.ligarMotor(cavaloRed);
        vacaloLaranja.acelerar();
        vacaloLaranja.acelerar(); 
        vacaloLaranja.desligarMotor(cavaloLaranja); 
        vacaloLaranja.acelerar();  

        vacaloLaranja.ligarMotor(cavaloLaranja);
        vacaloLaranja.desacelerar(); 
        vacaloLaranja.desacelerar(); 
        vacaloLaranja.desacelerar(); 
        vacaloLaranja.desligarMotor(cavaloRed);
        vacaloLaranja.desacelerar(); 
        

        vacaloLaranja.ligarMotor(cavaloLaranja);
        vacaloLaranja.acelerar(); 
        vacaloLaranja.acelerar(); 
        vacaloLaranja.acelerar();
        vacaloLaranja.acelerar(); 
        vacaloLaranja.acelerar(); 
        vacaloLaranja.desligarMotor(cavaloRed);
        vacaloLaranja.desacelerar();
        vacaloLaranja.desacelerar();
        vacaloLaranja.desacelerar();
        vacaloLaranja.desligarMotor(cavaloLaranja);
        vacaloLaranja.desacelerar();
        vacaloLaranja.desacelerar();
        vacaloLaranja.desacelerar();
        vacaloLaranja.desligarMotor(cavaloRed);
    }
    
}
