class Main {

    public static void main(String[] args){
        Aviao vacaloLaranja;
        vacaloLaranja= new Aviao();
        vacaloLaranja= new Aviao("blue Dragon","frankstein");
        vacaloLaranja.imprimaok();
        ;

        vacaloLaranja.setModelo("Blue Dragon");
        vacaloLaranja.setIdentificador("Freiherr");
        vacaloLaranja.setMotor(false);
        vacaloLaranja.setAltura(0.0f);
        System.out.println("Model:"+vacaloLaranja.getModelo()+"\nID:"+vacaloLaranja.getIdentificador()+
                            "\nStatus:"+vacaloLaranja.getMotor()+"\nAltura:"+vacaloLaranja.getAltura());        ;
        vacaloLaranja.ligarMotor();
        vacaloLaranja.imprimeEstadoMotor();
        vacaloLaranja.desligaMotor();
        vacaloLaranja.imprimeEstadoMotor();
        vacaloLaranja.ligarMotor();
        vacaloLaranja.acelerar();
        vacaloLaranja.acelerar();
        vacaloLaranja.desligaMotor();
        vacaloLaranja.acelerar();

        vacaloLaranja.ligarMotor();
        vacaloLaranja.desacelerar();
        vacaloLaranja.desacelerar();
        vacaloLaranja.desacelerar();
        vacaloLaranja.desligaMotor();
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
        vacaloLaranja.desligaMotor();
    }

}
