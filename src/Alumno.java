public class Alumno {
    private String nombre;
    private int edad;
    private boolean aprobado;

    //constructor -> méthod de cómo crear el objeto
    //              cómo vamos a guardar los datos que nos pasan al crear el objeto
    public Alumno(String n, int e, boolean a){
        nombre=n;
        edad = e;
        aprobado = a;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int e) {
        edad = e;
    }

    public void setNombre(String n) {
        nombre=n;
    }

    public void printInfo(){
        System.out.println(nombre+": Edad -> "+ edad+" | Aprobado: "+aprobado);

    }
}
