/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturas;

/**
 *
 * @author pericles.lopes
 */



public class Programa {
    public static void menu(){    
        System.out.println("\n*** Menu ***");
        System.out.println("1 - Empilhar");
        System.out.println("2 - Desempilhar");
        System.out.println("3 - Imprimir");
        System.out.println("4 - Quantidade de Livros");    
        System.out.println("-1 - Sair\n");
    }
    
    public static void main(String[] args) {
        int opcao=0;        
        Pilha P = new Pilha();
        
        while(opcao != -1){
            menu();
            opcao = Input.readInt("Digite a opcao: ");
            
            switch(opcao){
                case 1:
                    P.push(); 
                    break;
                case 2:
                    P.pop();
                    break;
                case 3:
                    P.imprime();
                    break;
                case 4:
                    P.qtdLivros();
                    break;
                    
                case -1:
                    System.out.println("\nSaindo...\n");            
            }            
        }
    }    
    
}
