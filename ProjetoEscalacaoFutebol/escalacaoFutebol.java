import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class escalacaoFutebol {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);

        ArrayList<String> time = new ArrayList<>();

        System.out.println("****************** ESCALAÇÃO DE FUTEBOL ******************");

        while(true)
        {
            System.out.println("- Digite 1 para acrescentar mais um jogador ao seu time");
            System.out.println("- Digite 2 para listar os jogadores do seu time");
            System.out.println("- Digite -1 para sair do sistema");

            System.out.print("- Sua escolha: ");

            int valor = entrada.nextInt();

            if(valor == 1)
            {
                int numJogadores = AdicionarJogador(time);
                System.out.println("Número de jogadores: " + numJogadores);
                System.out.println("**********************************************************");

            }

            if(valor == 2)
            {
                ListarJogadores(time);
            }
            
            if(valor == -1)
            {
                ListarJogadores(time);
                break;
            }
        }

    }
    public static int AdicionarJogador(ArrayList time)
    {
        // LimparConsole();
        System.out.println("**********************************************************");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do jogador: ");

        String jogador = entrada.nextLine();

        time.add(jogador);

        int numJogadores = time.size();
        
        return numJogadores;

    }
    public static void ListarJogadores(ArrayList time)  
    {
        System.out.println("******************* JOGADORES DE TIME *******************");

        for(int i = 0; i < time.size(); i++){
            System.out.println(time.get(i));
        }

        System.out.println("**********************************************************");

    }
}