import lerdados.LerDados;

public class EscolhaUsuario {

    public static void opcaoUsuario(){
        Cliente cliente = new Cliente();

        int escolha;
        boolean escolha_S_or_N;
        System.out.println("Em qual usuário deseja entrar?\nCLINTE - Opção 1\nADMINISTRADOR - Opção 2\nDigite o número da opção: ");
        escolha = LerDados.lerInt();

        if (escolha == 1){
            System.out.println("Deseja fazer o cadastro?");
            escolha_S_or_N = LerDados.lerSimNao();
                if(escolha_S_or_N == true){
                    cliente.escolhaClienteSim();
                }
                else{
                    cliente.escolhaClienteNao();
                }
        }
        else if (escolha == 2 ){
                Administrador.login();
        }
        else{
            System.out.println("Resposta inválida");
        }
    }
}
