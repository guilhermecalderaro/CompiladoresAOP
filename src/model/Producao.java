/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author guilherme
 */
public class Producao {
    public String simbolo;
    public List<String> prod;
    public List<String> primeiros;
    public List<String> ultimos;

    public Producao() {
        this.simbolo = "";
        this.prod = new LinkedList<String>();
    }

    public Producao(String simbolo) {
        this.simbolo = simbolo;
        this.prod = new LinkedList<String>();        
    }
    
    public void addProd(String s){
        this.prod.add(s);
    }
    
    
    
}
