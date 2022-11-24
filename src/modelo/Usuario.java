package modelo;

public class Usuario 
{
    
    //Atributos
    protected String nome;
    protected String email;
    protected String senha;
    
    
    //Constructor
    public Usuario(String nome, String senha, String email) 
    {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    
    
    //Getters
    public String getNome() 
    {
        return nome;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    
    //Metodos
    public boolean logar(String senha)
    {
        return this.senha.equals(senha);
    }
}
