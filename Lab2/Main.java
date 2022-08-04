class Main {

    public static void main(String[] args){


        MotorTurbinado  cavaloRed= new MotorTurbinado("red dragon",(float) 50.0f);
        MotorTurbinado cavaloLaranja = new MotorTurbinado("orange dragon",(float) 50.0f);
        Aviao vacaloLaranja;
        vacaloLaranja= new Aviao("blue Dragon","frankstein",cavaloRed,cavaloLaranja);
        vacaloLaranja.imprimaOk();
        Passageiro p1 = new Passageiro("joquinha","loreiro","444");
        Passageiro p2 = new Passageiro("fiveson","oleiviera","555");
        Passageiro p3 = new Passageiro("Ti","Nhoso","666");
        Passageiro p4 = new Passageiro("Jessie","Bad","777");
        Passageiro p5 = new Passageiro("White","Walter","888");
        

        System.out.println("Model:"+vacaloLaranja.getModelo()+"\nID:"+vacaloLaranja.getIdentificador()+
                            "\nStatus:"+vacaloLaranja.getEstadoMotor()+"\nAltura:"+vacaloLaranja.getAltura());        ;
       
        vacaloLaranja.ligarMotor(cavaloLaranja);
        vacaloLaranja.adicionarPassageiro(p1);
        vacaloLaranja.adicionarPassageiro(p2);
        vacaloLaranja.adicionarPassageiro(p3);
        vacaloLaranja.adicionarPassageiro(p4);
        vacaloLaranja.adicionarPassageiro(p5);   

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
        vacaloLaranja.desembarcarPassageiros();
        vacaloLaranja.imprimirListaDePassageiro();
        vacaloLaranja.desligarMotor(cavaloRed);
    }
    
}
