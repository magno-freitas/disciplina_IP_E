import java.util.Scanner;

public class Uni7Exe05 {

    private boolean expressaoCorreta (String expressao) {
    /* método para verificar se a expressão está correta quanto ao número de 
    parênteses */
        //criar uma variável para contar os parênteses
        int contParenteses = 0;
        //percorrer o string
        for (int cont = 0; cont < expressao.length(); cont++) {
            //se o caracter na posição for ( acrescenta um
            if (expressao.charAt(cont) == '(') {
                contParenteses++;
            } else {
                // se o carcater na posição for ) diminui um
                if (expressao.charAt(cont) == ')') {
                    contParenteses--;
                    //se tem mais parenteses fechados que aberto, para o método
                    if (contParenteses < 0) {
                        return false;
                    }
                }
            }
        } 
        return contParenteses == 0 ? true : false;
        /* O comando acima equivale a
        if (contParenteses == 0) 
           return true;
        else
            return false;
         */

    }

    private int contarDivMult (String expressao) {
    /* método que retorna a quantidade de operadores de divisão e multiplicação da expressão */
        //variável para ocntar os sinais de multiplicação e divisão
        int contSinais = 0;
        //percorrer o string
        for (int cont = 0; cont < expressao.length(); cont++) {
            //se for sinal de * ou /, contar
            if (expressao.charAt(cont) == '*' || expressao.charAt(cont) == '/') {
                contSinais++;
            }
        }
        return contSinais;
    }

    private int primeiroOperador (String expressao) {
        /* método que retorna a posição do primeiro operador: +, - , *, / 
        se não encontrar retorna -1 */
        
       //percorrer o string
        for (int cont = 0; cont < expressao.length(); cont++) {
            //se for sinal de * ou / ou + ou -, retornar a posição
            if (expressao.charAt(cont) == '*' || expressao.charAt(cont) == '/' ||
                expressao.charAt(cont) == '+' || expressao.charAt(cont) == '-') {
                    return cont;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        //criar um objeto para usar os métodos da classe
        Uni7Exe05 exercicio = new Uni7Exe05();
        //ler a expressão
        System.out.println("Digite uma expressão");
        String expressao = teclado.nextLine();

        //repetir para várias expressões
        while (!expressao.equalsIgnoreCase("fim")) {

            //testar se a expressão está correta quanto ao número de parênteses
            if (exercicio.expressaoCorreta (expressao)) {
                int qtdDivMult = exercicio.contarDivMult (expressao);
                System.out.println("Quantidade de divisões e multiplicações = "+ qtdDivMult);
                int posicaoOperador = exercicio.primeiroOperador (expressao);
                if (posicaoOperador > -1) {
                System.out.println("Posição do primeiro operador = " + posicaoOperador);
                } else {
                    System.out.println("Não existe operador aritmético na expressão");
                }
            } else {
                System.out.println("Expressão incorreta quanto ao uso dos parênteses");
            }
            //ler a expressão
            System.out.println("Digite uma expressão");
            expressao = teclado.nextLine();
        }
    }
}
