import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MayorIf mayorIf = new MayorIf(12);
        mayorIf.comparaEdad();
        System.out.println(mayorIf.inLine());
        DiaSemana diaSemana1 = new DiaSemana(2);
        DiaSemana diaSemana2 = new DiaSemana("Lunes");
        System.out.println(diaSemana1.diaSemana());
        System.out.println(diaSemana2.diaSemanaCadena());
        
    }
}
