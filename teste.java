
import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import main.Produto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author João Pedro
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        List<Produto> produto = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        Produto aux = new Produto();
        aux.ler();
        while(true){
            Produto p = new Produto();
            System.out.println("Sair?(1-sim)");
            int sair = s.nextInt();
            if(sair == 1){
                break;
            }
            System.out.println("Codigo: ");
            p.setCodigo(s.nextInt());
            System.out.println("Nome: ");
            p.setNome(s.nextLine());
            System.out.println("Tipo: ");
            p.setTipo(s.nextLine());
            System.out.println("Unidade: ");
            p.setUnindade(s.nextLine());
            System.out.println("Valor: ");
            p.setValor(s.nextInt());
            
            aux.incluir(p);
            
            
        }
        
        produto = aux.obterTodos();
        for(Produto m: produto){
            System.out.println(m.getCodigo());
            System.out.println(m.getNome());
            System.out.println(m.getTipo());
            System.out.println(m.getUnindade());
            System.out.println(m.getValor());
            
        }
        aux.salvar(produto);
    }
    
}
