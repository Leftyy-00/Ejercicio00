
public class holaGitHub {
    private int numero1;
    private int numero2;

    // Constructor que recibe los valores
    public holaGitHub(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método para sumar
    public int sumar() {
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        // Primera suma (10 + 20)
        holaGitHub suma1 = new holaGitHub(10, 20);
        System.out.println("La primera suma es: " + suma1.sumar());

        // Segunda suma (30 + 40)
        holaGitHub suma2 = new holaGitHub(30, 40);
        System.out.println("La segunda suma es: " + suma2.sumar());
    }
}