package modelo;

public class Rota 
{
    
    //Atributos
    private int num;
    private String destinos;
    
    
    //Constructor
    public Rota(int num, String destinos) 
    {
        this.num = num;
        this.destinos = destinos;
    }
    
    
    //Getters
    public int getNum() 
    {
        return num;
    }

    public String getDestinos() 
    {
        return destinos;
    }
    
}
