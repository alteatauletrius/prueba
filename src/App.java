import java.util.Scanner;

public class App {
    static Alumno a1 = new Alumno("Pepe",22,true);
    static Alumno a2 = new Alumno("Alba",17,false);
    static Alumno a3 = new Alumno("Sonia",25,true);
    static Alumno a4 = new Alumno("Pedro",19,true);
    static Alumno a5 = new Alumno("Carlos",20,false);
    static Alumno a6 = new Alumno("Pepe",22,true);
    static Alumno a7 = new Alumno("Alba",17,false);
    static Alumno a8 = new Alumno("Sonia",25,true);
    static Alumno a9 = new Alumno("Pedro",19,true);
    static Alumno a10 = new Alumno("Carlos",20,false);


    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        System.out.println("GESTOR DE ALUMNOS");
        System.out.println("----------------------------");
        Alumno[] alumnos = new Alumno[]{a1,a2,a3,a4,a5,a6,a7,a8,a9,a10};
        printAlumnos(alumnos);
        System.out.println("¿Cuál quieres modificar?");
        Scanner scn = new Scanner(System.in);
        int pos = scn.nextInt();
        Alumno seleccionado = alumnos[pos];
        seleccionado.printInfo();
        System.out.println("Nueva edad: ");
        int n = scn.nextInt();
        seleccionado.setEdad(n);
        menu();
    }

    private static void printAlumnos(Alumno[] alumnos) {
        for(int i=0;i< alumnos.length;i++){
            System.out.print(i+": ");
            alumnos[i].printInfo();
        }
    }
}
