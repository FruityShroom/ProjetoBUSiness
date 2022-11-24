package modelo;

public class Viagem
{
    
    //Atributos
    private String data;
    private String onibus;
    private String usuario;
    private String motorista;
    private int num;
    
    
    //Constructor
    public Viagem(String data, String onibus, String usuario, String motorista, int num) 
    {
        this.data = data;
        this.onibus = onibus;
        this.usuario = usuario;
        this.motorista = motorista;
        this.num = num;
    }
    
    
    //Getters
    public String getData() 
    {
        return data;
    }

    public String getOnibus() 
    {
        return onibus;
    }

    public String getUsuario() 
    {
        return usuario;
    }

    public int getNum() 
    {
        return num;
    }
    
}
