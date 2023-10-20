/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(String nombre, String cc, String direccion, String telefono, String contraseña, String username) {
        super(nombre, cc, direccion, telefono, contraseña, username);
    }
    
    public void modificarPrecioRuta(Ruta ruta, double nuevoPrecio) {
        if (ruta != null){
            ruta.setPrecio(nuevoPrecio);
    }else{
            System.out.println("La ruta no existe");
        }
    }

    
}
