class AguiaGigante implements Motorizavel{
    private float peso;
    private String nome;
    private float forca;
    private boolean acordada;

    AguiaGigante(String nome, float peso,float forca){
        this.setNome(nome);
        this.setPeso(peso);
        this.setForca(forca);
        this.setAcordada(true);}


private void setNome(String newNome){
    this.nome=newNome;
}
private void setPeso(float newPeso){
    this.peso=newPeso;
}
private void setForca(float newForca){
    this.forca=newForca;
}
private void setAcordada(boolean newAcordada){
    this.acordada=newAcordada;
}

private String getNome(){
    return this.nome;
}
private boolean getAcordada(){
    return this.acordada;
}
private float getPeso(){
    return this.peso;
}
private float getForca(){
    return this.forca;
}
public boolean getAtivo(){
    return this.acordada;
}
public void ligar(){
    if(!this.acordada){
    this.setAcordada(true);
    if(this.nome=="Smaug"){System.out.println("RUAARRRR QUEM TA MEXENDO NO MEU DINHEIRO VO QUEIMAR GERAL");}
    else{System.out.println("Levantou da caverna o Corno "+this.nome);}
    }
}
public void desligar(){
    if(this.acordada){
    this.setAcordada(false);
    System.out.println("Foi dormir o Monstro "+this.nome);}
}
public float getPotencia(){
    if(acordada){
        return this.forca;}
    else{return 0;}}
}