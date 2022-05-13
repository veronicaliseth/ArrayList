import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAlumno {
    static ArrayList<Alumno> listaAlumnos = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    static Alumno alum;
    
    public static void main(String[] args) {
        //simpleArrayList();        
        registroAlumno();        
    }
    //Método para leer registros e introducirlos en el array
    public static void registroAlumno(){
        //Declaración de variables para leer los datos de los alumnos
        int matricula=0, i, N=0;
        String nombre;  
        boolean continuarCiclo=true;                      
        
        //se pide por teclado el número de registros a leer
        do {

            try{

                System.out.print("Número de alumnos? ");
                 N = sc.nextInt();
                 continuarCiclo=true;
            }catch(InputMismatchException ex){
                System.out.println(ex);
                sc.nextLine();
                continuarCiclo=false;
            }
            
        } while (continuarCiclo==false || N <= 0);
        sc.nextLine(); //limpiar el intro
        //lectura de N alumnos
        System.out.println("aqui");
        for (i = 1; i <= N; i++) {
            //leer datos de cada alumno
            System.out.println("\n Alumno " + i);
          do{  
           try{
            System.out.print("Matrícula: ");
            matricula = sc.nextInt(); 
            continuarCiclo=true;
           }catch(InputMismatchException e){
            System.out.println(e);
            sc.nextLine();
            continuarCiclo=false;
           }         
           }while(continuarCiclo==false);
           sc.nextLine();
            System.out.print("Nombre: ");
            nombre = sc.next();
            System.out.println(" ");
            sc.nextLine(); //limpiar el intro
            alum = new Alumno(); //Se crea un objeto Alumno y se asigna su referencia a alum
            //se asignan valores a los atributos del nuevo objeto
            alum.setMatricula(matricula);
            alum.setNombre(nombre);

           //se añade el objeto al final del array
            listaAlumnos.add(alum);    
        }
        mostrarTodo();
      
    } 
    public static void mostrarTodo(){
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(i+1+" "+listaAlumnos.get(i).resultado());
        }
        System.out.println("llego aqui");
    }
    
}