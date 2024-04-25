package proyectofecha;
import java.util.Scanner;

//El método main tiene complejidad constante de O(1), pues se hace una asignación de valores
//a través de la consola. Se llama a la clase Fecha, y se crea un objeto a partir de esta llamada
//y con ello, se llaman métodos con complejidad constante O(1), por lo que al ser todas operaciones
//básicas ejercidas, este método es de complejidad O(1).
public class ProyectoFecha {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        System.out.println("Ingrese a continuación el día, el mes, y el año de la fecha en orden:");
        int dia = pc.nextInt();
        int mes = pc.nextInt();
        int anio = pc.nextInt();
    
        Fecha fecha = new Fecha();
        
        fecha.setAnio(anio);
        fecha.setMes(mes);
        fecha.setDia(dia);
        
        if(fecha.validarFecha(dia, mes, anio)==true){
            System.out.println(fecha.fechaLarga(dia, mes, anio));
        }else{
            System.out.println("Fecha incorrecta");
        }
    } 
}
