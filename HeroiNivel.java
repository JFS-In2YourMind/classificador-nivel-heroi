import java.util.Scanner;

public class HeroiNivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do nome
        System.out.print("Digite o nome do herói: ");
        String nome = scanner.nextLine();

        // Entrada do XP
        System.out.print("Digite o XP do herói: ");
        int xp = scanner.nextInt();

        String nivel;

        if (xp <= 5000) {
            nivel = "Bronze";
        } else if (xp <= 7000) {
            nivel = "Prata";
        } else if (xp <= 8000) {
            nivel = "Ouro";
        } else if (xp <= 9000) {
            nivel = "Platina";
        } else if (xp <= 10000) {
            nivel = "Ascendente";
        } else if (xp <= 11000) {
            nivel = "Imortal";
        } else {
            nivel = "Radiante";
        }

        // Saída
        System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);

        scanner.close();
    }
}
