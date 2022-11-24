package modelo;

public class Ponto 
{
    
    //Atributos
    private String endereco;
    private double frequencia;
    private int num;
    
    
    //Contructor
    public Ponto(String endereco, int num) 
    {
        this.endereco = endereco;
        this.num = num;
    }
    
    
    //Getters
    public String getEndereco() 
    {
        return endereco;
    }

    public double getFrequencia() 
    {
        return frequencia;
    }

    public int getNum() 
    {
        return num;
    }
    
    
    //Metodos

    public void setFrequencia(int quant) 
    {
        double frequencia = quant/24;
        this.frequencia = frequencia;
    }
    
}
