class Motor{
    private String modelo;
    private float potencia;
    private boolean ativo;

    Motor(String novoM, Float novaPot){
        this.setModelo(novoM);
        this.setPotencia(novaPot);
        this.setAtivo(false);}

    public String getModelo(){
        return this.modelo;}
    private void setModelo(String novoValor){
        this.modelo=novoValor;}
    
    public float getPotencia(){
        return this.potencia;}
    private void setPotencia(float novoValor){
        this.potencia=novoValor;}

    public boolean getAtivo(){
        return this.ativo;}    
    private void setAtivo(boolean novoValor){
        this.ativo=novoValor;}

    public void ligar(){
        this.setAtivo(true);
        System.out.println("Vruuuuuuuummmmmmmmmmm");
    }
    public void desligar(){
        this.setAtivo(false);
        System.out.println("mmmmmmmmm.....");
    }
    }
