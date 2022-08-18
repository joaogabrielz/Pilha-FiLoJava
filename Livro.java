/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas;

/**
 *
 * @author rf4053
 */
public class Livro {
    public int cod;
    public String Titulo;
    
    public Livro(){
        cod = Input.readInt("Digite o codigo: ");
        Titulo  = Input.readString("Digite o titulo: ");   
    }
    
    public void imprime(){
        System.out.println("\nCodigo: "+cod);      
        System.out.println("Titulo: "+Titulo+"\n");
        
        
    }
}
