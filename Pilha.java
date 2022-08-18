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
public class Pilha {
    public Livro vLivro[];
    public int topo;
    public Pilha(){
        int tam = Input.readInt("Digite o tamanho da pilha: ");
        vLivro = new Livro[tam];
        topo = -1;
    }
    public void push(){
        if((topo+1)<vLivro.length){
            vLivro[++topo] = new Livro();
            System.out.println("Livro empilhado!");
        }else
            System.out.println("Pilha cheia!");
    }
    
    public void pop(){
        if(topo>-1){
            topo--;
            System.out.println("Livro desempilhado!");
        }else{
            System.out.println("Pilha vazia!");
        }
    }
    public void qtdLivros(){
        if(topo==-1)
            System.out.println("Pilha vazia!");
        else
            System.out.println("Quantidade de livros: "+(topo+1));
    }
    /*public void insere(){
        if(qtdPessoa<vPessoa.length){
            vPessoa[qtdPessoa++]= new Pessoa();            
            System.out.println("Inserção concluída");
        }
        else
            System.out.println("Vetor sem espaço!");
    }
    public void remove(){
        if(qtdPessoa>0){
            for(int i=1;i<qtdPessoa;i++)
                vPessoa[i-1]=vPessoa[i];
            qtdPessoa--;
            System.out.println("Remoção concluída");
        }else{
            System.out.println("Vetor vazio!");
        }
    }*/
    public void imprime(){
        for(int i=topo;i>-1;i--){
            vLivro[i].imprime();
        }            
    }
}

