package modelo;

import java.util.Vector;

public class Motorista extends Usuario
{
    
    //Atributos
    private String numCNH;
    private Vector<String> frota;
    private String onibusAtual;
    
    
    //Contructor
    public Motorista(String numCNH, String nome, String senha, String email) 
    {
        super(nome, senha, email);
        this.numCNH = numCNH;
    }
    
    
    //Getters
    public String getNumCNH() 
    {
        return numCNH;
    }

    public String getOnibusAtual() 
    {
        return onibusAtual;
    }
    
    
    //Setters
    public void setOnibusAtual(String onibusAtual)
    {
        this.onibusAtual = onibusAtual;
    }
    
    
}
