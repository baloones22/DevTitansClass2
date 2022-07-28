class Aviao {
private String modelo;
private String identificador;
private float altura;
private float velocidade;
private Boolean emVoo;
private Motor motorEsquerdo;
private Motor motorDireito;

Aviao(String novoM, String novoId, Motor motor1, Motor motor2){
    this.setModelo(novoM);
    this.setIdentificador(novoId);
    this.setAltura(0.0f);
    this.setVelocidade(0.0f);
    this.setVoo(false);
    this.setMotores(motor1,motor2);}

private void setMotores(Motor novoMotor1,Motor novoMotor2){
    this.motorDireito=novoMotor1;
    this.motorEsquerdo=novoMotor2;}
public void imprimaOk(){
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
    if(motorDireito.getAtivo()){
        if(motorEsquerdo.getAtivo()){
        System.out.println("Todos os motores já estavam ligados"); }
        else{motorEsquerdo.ligar();}}
    else{
        motorDireito.ligar();
        if(!motorEsquerdo.getAtivo()){motorEsquerdo.ligar();}
        }
        System.out.println("Vruuuuuuuummmmmmmmmmm");}

public void desligarMotor(){
    if(!motorDireito.getAtivo()){
        if(!motorEsquerdo.getAtivo()){
        System.out.println("Todos os motores já estavam desligados"); }
        else{motorEsquerdo.desligar();}}
    else{
        motorDireito.desligar();
        if(motorEsquerdo.getAtivo()){motorEsquerdo.desligar();}
        }
        System.out.println("mmmmm.....");}

public void imprimeEstadoMotor(){
    if(motorEsquerdo.getAtivo()||motorDireito.getAtivo()){
        System.out.println("O motor está ligado");
    }
    else{
        System.out.println("O motor está desligado");
    }
}
public boolean getEstadoMotor(){
    if(motorEsquerdo.getAtivo()||motorDireito.getAtivo()){
        return true;
    }
    else{
        return false;
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

