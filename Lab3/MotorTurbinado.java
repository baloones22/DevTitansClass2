class MotorTurbinado extends Motor{

	MotorTurbinado(String novoM, float novoPot){
		super(novoM,novoPot);
	}

	public void ligar(){
		super.ligar();
		System.out.println("TRUMMRUMMMM");
	}
	
	
	public Float getPotencia(){
		return (super.getPotencia() * 1.2f);
	}
	
}
