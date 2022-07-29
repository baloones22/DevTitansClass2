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
public void ligarMotor(Motor motorzinho){
    if(!motorzinho.getAtivo()){
        motorzinho.ligar();
        System.out.println("Vrummm no motor :"+motorzinho.getModelo());}
    else{
        System.out.println("Motor já estava ligado");}
        }

public void desligarMotor(Motor motorzinho){
    if(motorzinho.getAtivo()){
    motorzinho.desligar();
    System.out.println("mmuurrV no motor :"+motorzinho.getModelo());}
else{
    System.out.println("Motor já estava desligado");}
    }


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
 if(motorEsquerdo.getAtivo()){
    this.velocidade=this.velocidade+50;
    if(motorDireito.getAtivo()){
        this.velocidade=this.velocidade+50;}}
else{
    if(motorDireito.getAtivo()){
        this.velocidade=this.velocidade+50;}
    else{
        System.out.println("ERRO:MOTORES DESLIGADOS"); }}
    String result ="Aviao a "+this.velocidade+"km/h";
    System.out.println(result);
    this.atualizarStatusVoo();
 }
 
public void desacelerar(){
    if(motorEsquerdo.getAtivo()&&this.velocidade>=50){
        this.velocidade=this.velocidade-50;
        if(motorDireito.getAtivo()&&this.velocidade>=50){
            this.velocidade=this.velocidade-50;}}
    else{
        if(motorDireito.getAtivo()&&this.velocidade>=50){
            this.velocidade=this.velocidade-50;}
        else{
            System.out.println("ERRO:MOTORES DESLIGADOS"); }}
        String result ="Aviao a "+this.velocidade+"km/h";
        System.out.println(result);
        this.atualizarStatusVoo();
     }
}

