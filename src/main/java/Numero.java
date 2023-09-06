public class Numero {
    private int numero;
    public Numero(int numero) {
        this.numero = numero;
    }

    public void numero() {
        int i = 1;
        while (i <= numero) {
            // muestro el valor de i
            System.out.println(i);
            // incremento el valor de i
            i++;
        }
    }

    public void numeroDos() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i <= numero);
    }


    public void numeroTres(){
        for(int i=1; i<=numero; i++ )
        {
            System.out.println(i);
        }
    }

    public void forEach(){
        String [] dias = {"LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};

        for (String dia: dias) {
            System.out.println(dia);
        }

    }
}
