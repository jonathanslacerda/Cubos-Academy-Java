public class Exercicios {
    public static void main(String[] args) {
        int peso = 150;
        int altura = 180;
        double imc;

        double alturaMetros = altura / 100.0;
        imc = peso / (alturaMetros * alturaMetros);

        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " cm");
        System.out.println("IMC: " + imc);

    }
}