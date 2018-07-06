/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author guilherme
 */
public class Gramatica {
    public List<String> naoTerminais;
    public List<String> terminais;
    public List<Producao> producao;
    

    public Gramatica() {
        this.naoTerminais = new LinkedList<String>();
        this.terminais = new LinkedList<String>();
        this.producao = new LinkedList<Producao>();
       
    }

    public Gramatica(List<String> naoTerminais, List<String> terminais, List<Producao> producao) {
        this.naoTerminais = naoTerminais;
        this.terminais = terminais;
        this.producao = producao;
    }
    
    public void addTerminal(String simb){
        this.terminais.add(simb);
    }
    
    public void addNaoTerminal(String simb){
        this.naoTerminais.add(simb);
    }
    
    public void addProducao(String simb){
        Producao p = new Producao(simb);
        this.producao.add(p);
    }
    
    public void addProd(){
        ;
    }
    
    public Producao find(String s){
        Producao aux;
        for (Producao p : producao) {
            if(p.simbolo.equals(s)){
                return p;
            }
        }        
        return null;
    }
    
    String regex = "[+*^()/&]|[a-z]+";
        
    Pattern pattern = Pattern.compile(regex);
    
    public void findPrimeiros(){
        
        for (Producao p : producao) {
            for (String prod : p.prod) {
                
                Matcher matcher = pattern.matcher(prod);
                if(matcher.find()){
                    p.primeiros.add(matcher.group());
                }
                
                if(prod.equals(find(prod).simbolo)){
                    //findPrimeiros;
                }
                
            }
        }
        
    }
    
    public void imprime(){
        for (String st : naoTerminais) {
            System.out.print(st + " ");
        }
        
        for (String t : terminais) {
            System.out.print(t + " ");
        }
        
        System.out.println("");
        
        for (Producao p : producao) {
            System.out.print("Simbolo: " + p.simbolo);
            System.out.print(" Produções: " + p.prod);
            System.out.println("");
        }
    }
    
    
    
    
    
    
    
    
    
    
}
