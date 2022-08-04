class Passageiro{
    private String primeiroNome;
    private String ultimoNome;
    private String cpfString;
    Passageiro(String primeiroNome, String ultimoNome, String cpfString){
        this.setPrimeiroNome(primeiroNome);
        this.setUltimoNome(ultimoNome);
        this.setCpf(cpfString);
    }
    Passageiro(String cpfString){
        this.setCpf(cpfString);}
    
    private void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
    public String getPrimeiroNome(){
        return this.primeiroNome; }
    private void setUltimoNome(String ultimoNome) {
            this.ultimoNome = ultimoNome;}
    public String getUltimoNome(){
                return this.ultimoNome; }
    private void setCpf(String cpf){
        this.cpfString=cpf;}
    public String getCpf(){
            return this.cpfString; }
}
