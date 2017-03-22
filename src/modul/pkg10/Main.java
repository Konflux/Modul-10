/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg10;

/**
 *
 * @author Marius
 */
public class Main{
        
    public static void main(String[] args) {
        Uia uni1 = new Uia();
        uni1.fyllListe();
        uni1.findByName("Marius", "Norli");
        uni1.findByCompetence("IT");
        uni1.findBySubject("IT", 15);
    }
}
