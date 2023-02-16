/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobygigi;

/**
 *
 * @author Georgina
 */
public class Usuario {
    private String name;
    
    public Usuario(String name){
        this.name = name;
    }
    public void mostrarNombre(){
        System.out.println(this.name);
    }
    
    public void Mostrar_Nombre2(){
        System.out.println("Su nombre es: " + this.name);
    }
    
}
