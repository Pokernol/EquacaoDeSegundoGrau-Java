package main.java.br.com.fatec.equacao2grau;
public class EquacaoDeSegundoGrau {
    private final double a;
    private final double b;
    private final double c;
    public EquacaoDeSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double calcularDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }
    public double calcularX1() {
        double delta = calcularDelta();
        if (delta < 0) {
            throw new IllegalArgumentException("Delta negativo, a equação não possui raízes reais.");
        }
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
    public double calcularX2() {
        double delta = calcularDelta();
        if (delta < 0) {
            throw new IllegalArgumentException("Delta negativo, a equação não possui raízes reais.");
        }
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
}
