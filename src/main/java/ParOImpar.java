public class ParOImpar {

    private final int numero;
    public ParOImpar(int numero) {
        this.numero = numero;
    }
    public void comparar() {
        // obtenemos el resto de dividir numero/2
        int resto = numero % 2;
        if (resto == 0) {
            System.out.println(numero + " es Par");
        } else {
            System.out.println(numero + " es Impar");
        }
    }

    public String compararInLine() {
        int resto = numero % 2;
        // utilizando un if in-line
        String mensaje = (resto == 0) ? "es Par" : "es Impar";
        return numero + " " + mensaje;
    }

}
