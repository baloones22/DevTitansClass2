class Aviao {
private String modelo;
private String identificador;
private Boolean motor;
private float altura;
private float velocidade;
private Boolean emVoo;

Aviao(String novoM, String novoId){
    this.setModelo(novoM);
    this.setIdentificador(novoId);
    this.setMotor(false);
    this.setAltura(0.0f);
    this.setVelocidade(0.0f);
    this.setVoo(false);}

public void imprimaok(){
    System.out.println("Ok");
}    
public Boolean getVoo(){
    return this.emVoo;
}
private void setVoo(boolean novoValor){
    this.emVoo=novoValor;
}
public String getModelo(){
    return this.modelo;
}
public void atualizarStatusVoo(){
    if(this.emVoo){
        if(this.velocidade>=200){
            System.out.println("i'm Flying, aces high");}
        else{ this.setVoo(false);
            System.out.println("Estoy Aterrisando");}
        }
    else{
        if(this.velocidade>=200){
            this.setVoo(true);
            System.out.println("Estoy Decolando");}
        else{
            System.out.println("Estou em solo");}
    }
    
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
public float getVelocidade(){
    return this.velocidade;
}
public void setVelocidade(float novoValor){
    this.velocidade=novoValor;
}
public void ligarMotor(){
    setMotor(true);
    System.out.println("Vruuuuuuuummmmmmmmmmm");
}
public void desligaMotor(){
    setMotor(false);
    System.out.println("mmmmmmmmmmuuuuuuurrV");
}
public void imprimeEstadoMotor(){
    if(this.getMotor()){
        System.out.println("O motor está ligado");
    }
    else{
        System.out.println("O motor está desligado");
    }
}
public void acelerar(){
 if(this.getMotor()){
    this.velocidade=this.velocidade+50;
    String result ="Aviao a "+this.velocidade+"km/h";
    System.out.println(result);
    this.atualizarStatusVoo();
 }
 else{
    System.out.println("ERRO:MOTOR DESLIGADO");
 }
}

public void desacelerar(){
    if(this.getMotor()){
        if(this.velocidade>49){
       this.velocidade=this.velocidade-50;
       String result ="Aviao a "+this.velocidade+"km/h";
       System.out.println(result);}
       else{
        this.velocidade=0;
        String result ="Aviao a "+this.velocidade+"km/h";
        System.out.println(result);}
       this.atualizarStatusVoo();}
    else{
       System.out.println("ERRO:MOTOR DESLIGADO");}
   }
}

