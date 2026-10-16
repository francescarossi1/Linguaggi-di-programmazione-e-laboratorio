class GruppoAlieni {
    private Alieno[]  alieni;

    public GruppoAlieni(int alieniNum){
        this.alieni = new Alieno[alieniNum];
    }

    public void aggiungiAlieno(Alieno nuovoAlieno, int indice){
        this.alieni[indice] = nuovoAlieno;
    }

    public Alieno[] getAlieni(){
        return this.alieni;
    }

    public int calcolaDanno(){
        int danno = 0;
        for(int i=0;i<alieni.length;i++){
            danno += this.alieni[i].getDanno();
        }
        return danno;
    }
}
