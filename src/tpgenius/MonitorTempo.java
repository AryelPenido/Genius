/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpgenius;

import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aryels
 */
public class MonitorTempo extends Thread {
   private boolean contagemFinalizada = false;
  
   
 public void cronometro(){
     java.util.Timer cont = new java.util.Timer();
     //cont.wait(5000);
        class PiscarVerde extends TimerTask{
            @Override
            public void run(){
                System.out.println("aqui");
            }
        }
            cont.schedule(new PiscarVerde(),2000);
  
    
  }
   
   
  public boolean isContagemFinalizada(){
    return this.contagemFinalizada;
  }
}
