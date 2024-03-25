package main.java.br.com.fatec.equacao2grau;
import java.util.Scanner;
public class CalcularEquacao {
    public void executar() {
        Scanner teclado = new Scanner(System.in);
        int a, b, c;
        String desejaContinuar;
        boolean continua;
        System.out.print("*Programa que calcula equação de segundo grau*\n\n"+
                "Olá usuário, este programa irá fazer a equação de segundo grau com base nos 3 valores fornecidos por você, devolvendo o x1 e x2 no final\n\n");
        do{
            System.out.print("Por favor informa o valor para a: ");
            a = teclado.nextInt();
            System.out.print("Por favor informa o valor para b: ");
            b = teclado.nextInt();
            System.out.print("Por favor informa o valor para c: ");
            c = teclado.nextInt();
            teclado.nextLine();
            EquacaoDeSegundoGrau equacao = new EquacaoDeSegundoGrau(a, b, c);
            try {
                System.out.println("\nO resultado para a equação sendo A = "+ a + ", B = " + b + " e C = " + c + " é: " +
                        "\nRaiz x1: " + equacao.calcularX1());
                System.out.println("Raiz x2: " + equacao.calcularX2());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Deseja efetuar mais uma equação? (s/n)");
            desejaContinuar = teclado.nextLine();
            continua = desejaContinuar.equalsIgnoreCase("s") || desejaContinuar.equalsIgnoreCase("sim");
        }while(continua);
    }
}
