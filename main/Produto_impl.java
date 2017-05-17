/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author João Pedro
 */
public class Produto_impl implements Serializable {
     List<Produto> produto = new ArrayList<>();
    
     public void incluir(Produto obj) throws Exception {
        for(Produto p :produto){
            if(p.equals(obj)){
                Exception ex = new Exception();
                throw ex ;
            }
        }
        produto.add(obj);
    }
    public List<Produto> obterTodos() throws Exception {
        Collections.sort(produto, Produto.ORDEM_ID);
        return produto;
    }
    public void excluir(Produto obj) throws Exception {
        
        produto.remove(obj);
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
    public void salvar(List<Produto> produtos) throws IOException{
         try (ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Produtos_trab_ES")))) {
             objectOut.writeObject(produtos);
         }
    }
    

    public void ler() throws FileNotFoundException, IOException, ClassNotFoundException, Exception{
         try (ObjectInputStream objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Produtos_trab_ES")))) {
             setProduto((List<Produto>) objectIn.readObject());
         }
    }
}
