public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

    @Override
    public void pausar() {
        System.out.println("Reprodutor Musical: Pausando a musica...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Trocando de musica...");
        try {
            Thread.sleep(1000); //Para simular a lentidão de um app de musica ao trocar de faixa
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Reprodutor Musical: Agora reproduzindo a musica: " + musica);
        
    }

    @Override
    public void tocar() {
        System.out.println("Reprodutor Musical: Reproduzindo faixa atual!!!........");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Navegador: Abrindo nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Navegador: Atualizando pagina...");
        System.out.println("Navegador: Pagina Atualizada!");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Navegador: Redirecionando para: " + url);
        System.out.println("Navegador: Carregando página....");
        System.out.println("Navegador: Pagina carregada!");
        
    }

    @Override
    public void atender() {
        System.out.println("Aparelho Telefonico: Atendendo ligação...");
        System.out.println("Aparelho Telefonico: Ligação Atendida!");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Aparelho Telefonico: Iniciando correio de voz...");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finalizando correio de voz...");
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Aparelho Telefonico: Ligando para " + numero + ".");
    }
    
}
