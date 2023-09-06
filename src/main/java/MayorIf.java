public class MayorIf {
    private int edad;
    private static final int MAYORIA_EDAD = 18;
    public MayorIf(int edad){
        this.edad = edad;
    }

    public void comparaEdad(){
        if( edad >= MAYORIA_EDAD )
        {
            System.out.println("Usted. es mayor de edad !");
        } else
        {
            System.out.println("Usted es es menor de edad");
        }

    }

    public String inLine(){
       // condicion ? retorno True : retorno False;
        return edad >= MAYORIA_EDAD ? "Mayor de edad" : "Menor de edad";
    }


}
