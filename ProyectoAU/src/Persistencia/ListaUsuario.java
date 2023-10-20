/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public class ListaUsuario implements Iusuario {
    private List<Usuario> listaUsuario;
    
    public ListaUsuario(){
        this.listaUsuario =  new ArrayList();
    }
    
    @Override
    public void agregarUsuario(Usuario T){
        this.listaUsuario.add(T);
    }
    
    @Override
    public ArrayList<Usuario> mostrarDatos(){
        ArrayList<Usuario> ListaU = new ArrayList(this.listaUsuario);
        return ListaU;
    }
    
    @Override
    public Usuario consultarUsuario(String infoUsuario){
        Usuario usuarioConsultado =null;
        for(Usuario T: this.listaUsuario){
            if(T.getCc() == null ? infoUsuario == null : T.getCc().equals(infoUsuario)){
                usuarioConsultado = T;
                break;
            }
        }
        return usuarioConsultado;
    }
}
