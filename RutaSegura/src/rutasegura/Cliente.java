/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rutasegura;

/**
 *
 * @author LENOVO
 */
public class Cliente {
     private String nombre;
    private int id;

    public Cliente() {
        // Constructor vacío
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("ID del cliente: " + id);
    }
}
