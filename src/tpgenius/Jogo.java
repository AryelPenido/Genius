package tpgenius;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Jogo {
    
    List<String> ordem = new ArrayList<>();
    int jogada;
    boolean fimDoTempo;
    
    
    public Jogo(){
        ordem.add("g");
        ordem.add("r");
        ordem.add("b");
        ordem.add("y");
        ordem.add("g");
        ordem.add("r");
        ordem.add("b");
        ordem.add("y");
        jogada = 0;
        
    }
    
    public void Shuffle(){
        Collections.shuffle(ordem);
    }
    
    public void Imprime(){
        System.out.print("Original:");
        for(int i =0; i < ordem.size(); i++){
            System.out.print(" "+ordem.get(i));
        }
    }
    
    public List getOrdem(){
        return ordem;
    }
    public int getJogada(){
        return jogada;
    }
    
    
    public void zeraJogada(){
        jogada = 0;
    }
    
    public void contJogada(){
        jogada ++;
    }
    
}
