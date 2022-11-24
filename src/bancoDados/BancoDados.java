package bancoDados;

import java.util.Vector;
import modelo.Motorista;
import modelo.Onibus;
import modelo.Ponto;
import modelo.Rota;
import modelo.Usuario;
import modelo.Viagem;

public class BancoDados 
{
    
    private static Vector<Usuario> usuarios;
    private static Vector<Onibus> onibus;
    private static Vector<Viagem> viagens;
    private static Vector<Rota> rotas;
    private static Vector<Ponto> pontos;
    
    
    //Iniciando o banco
    public static void inicia()
    {
        
        usuarios = new Vector();
        onibus = new Vector();
        viagens = new Vector();
        rotas = new Vector();
        pontos = new Vector();
        
        usuarios.add(new Usuario("fulano", "senhaForte", "fulano@gmail"));
        usuarios.add(new Usuario("ciclana", "senhaForte", "ciclana@gmail"));
        usuarios.add(new Usuario("beutrano", "senhaForte", "beutranoo@gmail"));
        usuarios.add(new Motorista("44947479918", "Jorge", "senhaForte", "jorge@gmail"));
        usuarios.add(new Motorista("30849851476", "Maria", "senhaForte", "maria@gmail"));
        
        onibus.add(new Onibus("HQD-7791"));
        onibus.add(new Onibus("JZX-6174"));
        onibus.add(new Onibus("HPX-3794"));
        
        viagens.add(new Viagem("12/10/2022", "HPX-3794", "fulano@gmail", "44947479918", 1));
        viagens.add(new Viagem("13/10/2022", "HPX-3794", "fulano@gmail", "44947479918", 2));
        viagens.add(new Viagem("14/10/2022", "HPX-3794", "fulano@gmail", "30849851476", 3));
        
        rotas.add(new Rota(1, "Bairro Feliz, Centro"));
        rotas.add(new Rota(2, "Bairro Alegre, Centro"));
        rotas.add(new Rota(3, "Bairro Torto, Centro"));
        
        pontos.add(new Ponto("Bairro Feliz, Rua A", 1));
        pontos.add(new Ponto("Bairro Feliz, Rua A", 2));
        pontos.add(new Ponto("Bairro Alegre, Rua Um", 3));
        
    }
    
    
    //Metodos
    public static Usuario retornaUserEmail(String email)
    {
        for(Usuario u : usuarios)
        {
            if(u.getEmail().equals(email))
            {
                return u;
            }
        }
        
        return null;
    }
    
    public static void addUser(String nome, String senha, String email)
    {
        usuarios.add(new Usuario(nome, senha, email));
    }
}
