package vcelearner;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author J.Weidehaas
 */
public class Test {

    public static void main(String[] args) {
        
////       //Testen Lernkarte§Themenbereich
//        Lernkarte2Themenbereich lK2TB = new Lernkarte2Themenbereich(1, 1);
//        Lernkarte2Themenbereich.insert(lK2TB);

//         //Testen PotentielleAntwort.insert()
//         PotentielleAntwort pA = new PotentielleAntwort(true, "Raum 5.2", 1);
//         PotentielleAntwort.insert(pA);
//        //Testen Lernkarte ohne Array
//        LernKarte lK = new LernKarte("Wie spät?", 1);
//        
        //zusätzlich testen Lernkarte mit Themenbereich  ArrayList
//        ArrayList<Themenbereich> tBs = new ArrayList<>();
//        tBs.add(new Themenbereich(1,"Java advanced"));
//        tBs.add(new Themenbereich(2, "Whatever"));
//        lK.settBs(tBs);
//         //zusätzlich testen Lernkarte mit PotentielleAntworten  ArrayList
//        ArrayList<PotentielleAntwort> pAs = new ArrayList<>();
//        pAs.add(new PotentielleAntwort(true, "Raum 5.2"));
//        pAs.add(new PotentielleAntwort(false, "Gebäudee 2"));
//        lK.setpAs(pAs);
//        
//        //Methode testen
//        LernKarte.insert(lK);
//        ArrayList<LernKarte> lKs = LernKarte.getAll();
//        System.out.println(lKs);
////        Lernkarte2Themenbereich.delete(1);
////        PotentielleAntwort.delete(1);
//          LernKarte.delete(lK);
/**
 * ein bischen unsinnn
 */
        Sitzung s = new Sitzung();
//        s.addLernKarte(new LernKarte("Wie spät?", 1));
//        System.out.println(s.getAktuelleLernKarte());
//        System.out.println(s.getNextLernKarte());
//        System.out.println(s.getNextLernKarte());
//        System.out.println(s.getNextLernKarte());
//        System.out.println("------------------");
////        System.out.println(s.getPrevLernKarte());
////        System.out.println(s.getPrevLernKarte());
////         s.removeLernKarte(new LernKarte("Wie spät?", 1));
////         
////        System.out.println(s.getNextLernKarte());
////        System.out.println(s.getNextLernKarte());
////        System.out.println(s.getNextLernKarte());
////        System.out.println(s.getPrevLernKarte());
//         
//        s.setAktuelleLernKarte(new LernKarte("Wie früh?", 1));
//         
//        System.out.println(s.getNextLernKarte());
//        System.out.println(s.getNextLernKarte());
//        System.out.println(s.getNextLernKarte());
//        System.out.println(s.getNextLernKarte());
//        LernKarte lK = s.getById(3);
//        System.out.println(lK);

/**
 * Test Team Datenbank ... Isabel und Rainer
 */

//    LernSitzung2LernKarte lS2lK = new LernSitzung2LernKarte(5, 1, true);
//    LernSitzung2PotentielleAntwort lS2pA = new LernSitzung2PotentielleAntwort(5, 4);
//    LernSitzung2PotentielleAntwort lS2pA1 = new LernSitzung2PotentielleAntwort(5, 5);
//    LernSitzung lS = new LernSitzung("ungewertet", "2016-05-30", 1);
//    LernSitzung.insert(lS);
//    LernSitzung2LernKarte.insert(lS2lK);
//    LernSitzung2PotentielleAntwort.insert(lS2pA);
//    LernSitzung2PotentielleAntwort.insert(lS2pA1);
    
//    System.out.println(lS.toString());
//    System.out.println(lS2lK.toString());
//    System.out.println(lS2pA.toString());
//    System.out.println(lS2pA1.toString());

        LernSitzung ls = new LernSitzung("Lern", 2);
        LernSitzung.insert(ls);
        
        ArrayList<LernSitzung> lss = new ArrayList<>(LernSitzung.getAll());
        
        System.out.println(lss);
    }
}
