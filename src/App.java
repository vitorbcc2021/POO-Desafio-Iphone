import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone meuIphone = new Iphone();
        
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("""
                ====================================
                O que deseja fazer?
                    1. Abrir reprodutor de musica
                    2. Abrir navegador de internet
                    3. Abrir lista telefonica
                    4. Encerrar
                ====================================
                    """);

            int opcao = sc.nextInt();
            
            if(opcao == 1){
                System.out.printf("""
                    REPRODUTOR DE MUSICA
                        1. tocar musica
                        2. pausar
                        3. selecionar musica

                        """);

                        opcao = sc.nextInt();

                        if (opcao == 1) meuIphone.tocar();
                        else if (opcao == 2) meuIphone.pausar();
                        else if (opcao == 3) meuIphone.selecionarMusica("Iron Maiden: The Trooper");
                        else System.out.println("ERRO: Opcao invalida!!");
                        
            } else if(opcao == 2){
                System.out.printf("""
                    NAVEGADOR DE INTERNET
                        1. exibir pagina
                        2. adicionar nova aba
                        3. atualizar pagina
                        """);

                        opcao = sc.nextInt();

                        if (opcao == 1) meuIphone.exibirPagina("www.github.com/vitorbcc2021");
                        else if (opcao == 2) meuIphone.adicionarNovaAba();
                        else if (opcao == 3) meuIphone.atualizarPagina();
                        else System.out.println("ERRO: Opcao invalida!!");

            } else if(opcao == 3){
                System.out.printf("""
                    APARELHO TELEFONICO
                        1. ligar
                        2. atender
                        3. iniciar correio de voz
                        """);
                          
                        opcao = sc.nextInt();

                        if (opcao == 1) meuIphone.ligar("+00 (00) 0000-0000");
                        else if (opcao == 2) meuIphone.atender();
                        else if (opcao == 3) meuIphone.iniciarCorreioVoz();
                        else System.out.println("ERRO: Opcao invalida!!");
                        
            } else if(opcao == 4){
                System.out.println("encerrando....");
                sc.close();
                break;
            }
            else {
                System.out.println("ERRO: Opcao invalida!!");
            }
        }
    }
}
