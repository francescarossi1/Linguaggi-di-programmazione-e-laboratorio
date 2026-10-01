public class CoppiaNumeri{
    private int num1; 
    private int num2; 

    public CoppiaNumeri(int num1, int num2)
    {
        this.num1=num1; 
        this.num2=num2; 
    }
    public int somma(){
        return this.num1+this.num2;
    }
    
    public int prodotto(){
        return this.num1*this.num2;
    }

}
