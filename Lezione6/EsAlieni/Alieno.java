package EsAlieni;

public class Alieno {
    protected String nome;
    protected int salute;

    public Alieno(String nome, int salute) {
        this.nome = nome;
        this.salute = salute;
    }

    public String getNome() {
        return nome;
    }

    public int getSalute() {
        return salute;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalute(int salute) {
        this.salute = salute;
    }

    public int getDanno() {
        return 0;
    }
}
