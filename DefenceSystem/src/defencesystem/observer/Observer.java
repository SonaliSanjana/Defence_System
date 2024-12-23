/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defencesystem.observer;

import defencesystem.observer.enumcls.Strength;

/**
 *
 * @author Sonali Peiris
 */
public interface Observer {
    void setMessage (String msg);
    void setArealbl(String lbl);
    void setButtonState(Strength s);
    void clearTxtArea();
}
