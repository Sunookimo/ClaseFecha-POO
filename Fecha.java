package proyectofecha;
import java.util.HashMap;

public class Fecha {
private int dia;
private int mes;
private int anio;

//Método 1: Al tener asiganciones de las variables, y crear una cadena con estas variables
//y retornar tal cadena, se manejan procesos básicos, por lo que este método tiene complejidad
//O(1).
public String fechaCorta(int dia, int mes, int anio){
    this.dia=dia;
    this.mes=mes;
    this.anio=anio;
    String fecha = dia + "/" + mes + "/" + anio;
    return fecha;
}
//Método 2: En este método se hace uso de switch case, donde los casos son ejecutados según el
//número asigando al atributo "mes". A partir de este entero, se hace una comparación con la condicional
//if, o if else, y retorna true o false según la validación de la condición. Estas evaluaciones son
//de tipo básico, por lo que tienen una complejidad constante de O(1).
//Lo único diferente es el caso 2, donde a partir del módulo se ejecuta la condicional if, pero sigue
//retornando true o false, por lo que también tiene complejidad constante O(1).
public boolean validarFecha(int dia, int mes, int anio){
    if(dia >= 1 && mes >= 1 && anio >=1){
    if(anio <=2024 && mes <= 12){
        switch (mes) {
            case 1, 3, 5, 8, 10, 12 :
            {
                if(dia<=31){
                    return true;
                }
            }
            case 2 :
            {
                int anioBisiesto = anio % 4;
                int anioBisiesto2 = anio % 400;
                if(anioBisiesto==0 || anioBisiesto2==0){
                    return dia <= 29;
                }else{
                    return dia <= 28;
                }
            }
            case 4, 6, 7, 9, 11 :
            {
                if(dia <= 30){
                    return true;
                }
            }
            default : 
            {
                return false;
            }
        }
    }
    }else{
        return false;
    }
    return false;
}
//Método 3: En este método se hace uso de la clase HashMap, y se hacen asignaciones a valores
//enteros, a valores de tipo String, por lo que no deja de ser una asignación, la complejidad de este
//método es O(1).
private String masLetra(int mes){
    HashMap <Integer, String> mesesLetra = new HashMap<>();
    mesesLetra.put(1, "enero");
    mesesLetra.put(2, "febrero");
    mesesLetra.put(3, "marzo");
    mesesLetra.put(4, "abril");
    mesesLetra.put(5, "mayo");
    mesesLetra.put(6, "junio");
    mesesLetra.put(7, "julio");
    mesesLetra.put(8, "agosto");
    mesesLetra.put(9, "septiembre");
    mesesLetra.put(10, "octubre");
    mesesLetra.put(11, "noviembre");
    mesesLetra.put(12, "diciembre");
    
    String fechaa = mesesLetra.get(mes);
    return fechaa;
}
//Metodo 4: En este método se hace uso de la misma clase para llamar a un método pertenciente
//a la clase llamada (valga la rebundancia), y a partir de los atributos dia, mes, y anio; se crea
//la cadena que luego será retornada. Como no deja su simplicidad de lado, este método tiene una
//complejidad constante de O(1).
public String fechaLarga(int dia, int mes, int anio){
    Fecha metodo3 = new Fecha();
    String mesNombre = metodo3.masLetra(mes);
    String date = dia + " de " + mesNombre + " del " + anio;
    return date;
}

//Métodos getter & setter: Los métodos getter y setter tienen una complejidad constante de O(1).
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}
