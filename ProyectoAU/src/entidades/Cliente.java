/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author LENOVO
 */
public class Cliente extends Usuario {

    public Cliente() {
    }

    public Cliente(String nombre, String cc, String direccion, String telefono, String contraseña, String username) {
        super(nombre, cc, direccion, telefono, contraseña, username);
    }
    
}
