/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defencesystem;

import defencesystem.UI.Tank;
import defencesystem.UI.Submarine;
import defencesystem.UI.MainController;
import defencesystem.UI.Helicopter;

/**
 *
 * @author Sonali Peiris
 */
public class DefenceStarter {
    public static void main(String[] args) {
        MainController main=MainController.getInstance();
        main.addDefenceUnit(Helicopter.getInstance());
        main.addDefenceUnit(Submarine.getInstance());
        main.addDefenceUnit(Tank.getInstance());
    }
}
