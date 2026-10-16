class Alieno {
    protected int salute;   // 0 = morto, 100 = vita piena
    protected String nome;
    protected int danno=0;

    public Alieno(int salute, String nome){
        this.salute = salute;
        this.nome = nome;
    }

    public int getDanno(){
        return this.danno;
    }

}
