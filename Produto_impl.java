/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author João Pedro
 */
public class Produto_impl {
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
     
}
