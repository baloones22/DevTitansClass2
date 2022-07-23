class Main {

    public static void main(String[] args){
        Aviao vacaloLaranja;
        vacaloLaranja= new Aviao();
        vacaloLaranja.imprimaok();

        vacaloLaranja.setModelo("Blue Dragon");
        vacaloLaranja.setIdentificador("Freiherr");
        vacaloLaranja.setMotor(false);
        vacaloLaranja.setAltura(0.0f); 
        System.out.println("Model:"+vacaloLaranja.getModelo()+"\nID:"+vacaloLaranja.getIdentificador()+
                            "\nStatus:"+vacaloLaranja.getMotor()+"\nAltura:"+vacaloLaranja.getAltura());        ;
    }
}
