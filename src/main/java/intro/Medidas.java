//1 - Pacote
package intro;

//2 - Referência às bibliotecas

import java.util.Scanner;

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
    // O println entende o tipo a partir do lançamento. Se selecionar o int mas informar string, o ide entende.
    // Dentro do método main só enxerga os métodos static

    public static void main(String[] args){

        //Utilizar a classe Scanner do Java para ler a escolha do usuário no console.
        Scanner scanner = new Scanner(System.in); // in é a entrada no sistema
        System.out.println("M E N U  D E  O P Ç Õ E S: ");
        System.out.println("c ou C - Calcular Area Modo Curto ");
        System.out.println("d ou D - Contar até 10 ");
        System.out.println("e ou E - Calcular Area Modo Extenso ");
        System.out.println("i ou I - Calcular Area ifSimples ");
        System.out.println("r ou R - Contagem Regressiva de 10 a 0 ");
        System.out.println("Digite a opção desejada: ");

        String opcao = scanner.next(); // pega a próxima letra que for digitada

        //switch: selecionar o comportamento do programa conforme a escolha da pessoa ou do software.

        //String opcao = "ifSimples";

        switch (opcao){
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            case "d":
            case "D":
                System.out.println("Você escolhe executar o método contarAteDez");
                contarAteDez();
                break;
            case "i":
            case "I": // em java não usa or, usa outro case
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "r":
            case "R": // em java não usa or, usa outro case
                System.out.println("Você escolheu executar o método contarAteZero");
                contarAteZero();
                break;
            //no java não usa o else com o switch, usa o default
            default:
                System.out.println("Você escolheu outro valor que não tem uma ação associada");
                calcularAreaModoExtenso();
                break; //Não precisa do break no default. Se não tiver ele nos demais casos, ele executa todos os casos.

        }
    }

    public static void ifSimples(){

        //Condicional: Verificar uma condição - Fazer uma pertuna para uma pessoa, um hardwre ou sotware
        //if = se
        //else = senão

        String modo = "curto";

        if(modo == "curto"){
            calcularAreaModoCurto();
        }

        else{
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto(){

        System.out.println ("Cálculo de Areas Modo Curto");

        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento +
                "m a área é de " + largura * comprimento + "m2");

    }

    //Para escrever nome de método (camel case). Primeira letra da palavra minúscula e a partir do segundo, maiúscula.
    public static void calcularAreaModoExtenso(){

        System.out.println ("Cálculo de Areas Modo Extenso");

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

        public static void contarAteDez(){

        // Loops ou Repetições
        // for: repetição incondicional (determina quantas vezes quer que repita)

        System.out.println("Contagem Crescente");
        for(int i = 1; i <=10; i++){ // o ++ soma mais 1 e o -- diminui 1
            System.out.println(i);

        }
        }

    public static void contarAteZero(){
            System.out.println("Contagem Decrescente");
            for(int i = 10; i > -1; i--){
                System.out.println(i);
//Para automação de testes ou programa simples, não tem problema usar o <= ou >=. Mas para um programa maior, é melhor
// utilizar o -1, por exemplo.
            }
        }


   }
