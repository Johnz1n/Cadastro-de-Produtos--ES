/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author João Pedro
 */
public class Produto extends Produto_impl{
    private Integer codigo;
    private String nome;
    private String unindade;
    private String tipo;
    private Integer valor;

    public Produto() {
    }

    public Produto(Integer codigo) {
        this.codigo = codigo;
    }

    public Produto(Integer codigo, String nome, String unindade, String tipo, Integer valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.unindade = unindade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnindade() {
        return unindade;
    }

    public void setUnindade(String unindade) {
        this.unindade = unindade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.getCodigo());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + getCodigo() + ", nome=" + getNome() + ", unindade=" + getUnindade() + ", tipo=" + getTipo() + ", valor=" + getValor() + '}';
    }
    
    public static final Comparator<Produto> ORDEM_ID = new Comparator<Produto>() {
        public int compare(Produto obj1, Produto obj2) {
            return obj1.codigo.compareTo(obj2.codigo);
        }
    };
}
