class Aviao {
private String modelo;
private String identificador;
private Boolean motor;
private float altura;

public void imprimaok(){
    System.out.println("Ok");
}    
public String getModelo(){
    return this.modelo;
}

public void setModelo(String novoValor){
    this.modelo=novoValor;
}
public String getIdentificador(){
    return this.identificador;
}
public void setIdentificador(String novoValor ){
    this.identificador=novoValor;
}
public Boolean getMotor(){
    return this.motor;
}
public void setMotor(boolean novoValor){
this.motor=novoValor;
}
public float getAltura(){
    return this.altura;
}
public void setAltura(float novoValor){
    this.altura=novoValor;
}

}
