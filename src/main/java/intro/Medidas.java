//1 - Pacote
package intro;

//2 - Referência às bibliotecas

// 3 - Classe
public class Medidas {
    //3.1 - Atributos - Características: o que possui (nome, endereço, cpf...)
    //3.2 - Métodos e Funções: o que ele sabe fazer.
    // Métodos: é escrita mas não tem retorno. Faz o processo. Método usa o void (não tem retorno)
    // Funções: faz e dá retorno. Função usa o tipo da função (int, string, char...).
    // String [] significa que pode receber uma lista de caracteres.
    // O print escreve na linha. O println escreve e muda de linha. Sempre tem que informar um método inicial (public void main).
    // Atalho para chamar o método principal: digitar sout e pressionar enter ou tab
    // Quanto menos linhas de código, melhor
    //O println entende o tipo a partir do lançamento. Se selecionar o int mas informar string, o ide entende.

    public static void main(String[] args){
        System.out.println ("Cálculo de Areas");

        //Cálculo de área - Reduzido

        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m a área é de " + largura * comprimento + "m2");

    }

    //Para escrever nome de método (camel case). Primeira letra da palavra minúscula e a partir do segundo, maiúscula.
    public void calcularAreaModoExtenso(){
        //Cálculo de área = Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        // = significa recebe, e o == significa igual
        largura = 5;
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m a área é de " + resultado + "m2");
    }

   }
