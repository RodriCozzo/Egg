package mascotapp;

import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

public class MascotAPP {
        
    public static void main(String[] args) {
        
        //Mascota m1 = new Mascota();
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m1 = sm.crearMascota(); //Lo que me devuelve la funcion crear mascota se guarda en "m1"
        
        System.out.println(m1.toString()); //Imprime el objeto "m1"
        
    }

}
