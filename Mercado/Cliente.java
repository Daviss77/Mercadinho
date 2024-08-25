import lerdados.LerDados;

public class Cliente {

    public void escolhaClienteSim(){
        System.out.println("Que bom que você tenha escolhido a opcão de fazer o cadastro");
        informacoes();
        coletaDados();
    }
    public void escolhaClienteNao(){
        System.out.println("OK, espero que tenha uma boa compra e experiência!");
    }

    public void informacoes(){
        System.out.println("Precisamos de alguns dados seus para poder seguir para o processamento de cadastro\nSendo eles: CPF - EMAIL - NOME COMPLETO - NUMERO DO CELULAR - ENDERÇO");
    }

    private void coletaDados(){
        int resposta;
        String resposta_S;
        System.out.println("Por favor insirá seu CPF: ");
        resposta = LerDados.lerInt();

        System.out.println("Insirá seu EMAIL pessoal: ");
        resposta_S = LerDados.lerTexto();

        System.out.println("Insirá seu nome completo: ");
        resposta_S = LerDados.lerTexto();

        System.out.println("Insirá seu número do celular");
        resposta = LerDados.lerInt();

        System.out.println("Insirá seu endereço: ");
        resposta_S = LerDados.lerTexto();
    }

    public void beneficios(){
        System.out.println("BENEFICIOS\nSer um cliente traz benéficios como, receber alguns descontos na suas compras, além de pode participar de diversos sorteios que vai ocorrer futuramente para os clientes.");
    }
}
