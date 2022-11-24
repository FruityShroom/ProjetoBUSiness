package business;

import bancoDados.BancoDados;
import java.util.Scanner;
import java.util.Vector;
import modelo.Usuario;

public class BUSiness 
{
    
    private static Scanner input = new Scanner(System.in);

    
    public static void main(String[] args) 
    {
             
        BancoDados.inicia();
        Usuario user = login();
        
    }
    
    public static Usuario login()
    {
        boolean valido;
        Usuario user;
        
        do
        {
            System.out.println("------------LOGIN-----------\n"
                    + "email: ");
            String email = input.nextLine();
            
            user = BancoDados.retornaUserEmail(email);
            
            if(user == null)
            {
                System.out.println("Email nao registrado.\nDeseja se registrar? nao(0) sim(1)");
                int opcao = input.nextInt();
                input.skip("\n");
                
                if(opcao == 1)
                {
                    registroComum();
                }
                
            }else{
                System.out.println("senha: ");
                String senha = input.nextLine();
                valido = user.logar(senha);
            }
            
        }while(valido = false);
        
        System.out.println("Login feito com sucesso!\nOla, " + user.getNome());
        return user;
    }

    private static void registroComum() 
    {
        System.out.println("------------REGISTRO-----------\n"
                    + "nome: ");
        String nome = input.nextLine();
        System.out.println("email:");
        String email = input.nextLine();
        System.out.println("senha: ");
        String senha = input.nextLine();
        
        BancoDados.addUser(nome, senha, email);
        System.out.println("Cadastro feito com sucesso!");
    }
        
    
}
