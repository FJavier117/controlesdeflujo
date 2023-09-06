public class DiaSemana {
    private int opcion1;
    private String opcion2;
    public DiaSemana(int opcion1) {
        this.opcion1 = opcion1;
    }

    public DiaSemana(String opcion2) {
        this.opcion2 = opcion2;
    }


    public String diaSemana() {
        String dia;
        switch (opcion1) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miercoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sabado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Dia incorrecto... El valor debe ser entre 1 y 7.";
        }
        return dia;
    }


    public String diaSemanaCadena() {
        String dia = switch (opcion2) {
            case "Lunes" -> "Lunes";
            case "Martes" -> "Martes";
            case "Miercoles" -> "Miercoles";
            case "Jueves" -> "Jueves";
            case "Viernes" -> "Viernes";
            case "Sabado" -> "Sabado";
            case "Domingo" -> "Domingo";
            default -> "Dia incorrecto";
        };
        return dia;
    }
}