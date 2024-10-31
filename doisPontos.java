/*Escreva um método que calcula a distância entre dois pontos (x1,y1) e (x2,y2), 
com a leitura de parâmetros no próprio método. Escreva outro método com o mesmo 
nome, mas que passa os valores de x1, x2, y1 e y2, e que também calcula a 
distância entre dois pontos. */

import java.util.Scanner;
public class doisPontos {
    //METODO 1: LE AS CORDENADAS
    public static double calculaDistancia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Digite o valor de y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Digite o valor de x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Digite o valor de y2: ");
        double y2 = sc.nextDouble();

        //CALCULA DISTANCIA
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + 
        Math.pow(y2 - y1, 2));
        return distancia;
    }
    
    //METODO 2: RECEBE AS CORDENADAS COM PARAMETROS
    public static double calculaDistancia(double x1, double y1, 
    double x2, double y2) {
        //CALCULA DISTANCIA
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + 
        Math.pow(y2 - y1, 2));
        return distancia;
    }

    public static void main(String[] args) {
        //CHAMA O METODO 1 Q LE AS CORDENADAS
        double distancia1 = calculaDistancia();
        System.out.println("A distância calculada (método 1) é: " + distancia1);
        //CHAMA O 2 METODO CM VALORES PASSADOS CM PARAMETROS
        double distancia2 = calculaDistancia(1, 1, 4, 5);
        System.out.println("A distância calculada (método 2) é: " + distancia2);
    }
}
