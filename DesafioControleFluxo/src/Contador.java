import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();  // pega e salva o primeiro número

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();  // pega e salva o segundo número

        try {
            // tentando o método de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // mostrar a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }

        terminal.close();  // fechando o Scanner
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // ver se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        // usando o for para imprimir os números com base na contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
