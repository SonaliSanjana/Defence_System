/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem.observer;

import defencesystem.observer.enumcls.Strength;
import defencesystem.SuperDefence;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sonali Peiris
 */
public class Observable extends  SuperDefence{
    private static final List<SuperDefence> defencelist=new ArrayList<>();
    
    public static List<SuperDefence> getDefenceList(){
        return defencelist;
    }
    
    public static void addDefenceUnit(SuperDefence sd){
        defencelist.add(sd);
    }
    
    public void removeDefenceUnit(SuperDefence sd){
        defencelist.remove(sd);
    }
    
    public void sendPrivateMesseage(String msg,String sendTo) {
        for(SuperDefence sd:defencelist){
            if(sendTo.equalsIgnoreCase(sd.getClass().getSimpleName())){
               sd.setMessage("Private :"+msg); 
            }
        }  
    }
    
    public void sendMessage(String msg,String sendTo) {
        for(SuperDefence sd:defencelist){
                sd.setMessage("Public : "+msg); 
        }   
    }
    
   public void collectInformation(String selected){
       for(SuperDefence sd: getDefenceList()){
            if(selected.equalsIgnoreCase(sd.getClass().getSimpleName())){
                setSoldierCount(sd.getSoldierCount());
                setAmmoCount(sd.getAmmoCount());
            }
        }
   } 
   
   public void setArealbl(String lbl) {
        for(SuperDefence sd: defencelist){
             sd.setArealbl(lbl);
             sd.clearTxtArea();
        }    
    }
   
   public void setButtonState(Strength s) {
        for(SuperDefence sd: defencelist){
            sd.setButtonState(s);
        }
    }   

}
