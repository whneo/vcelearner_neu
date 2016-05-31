package vcelearner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Isabel
 */
public class Benutzer2LernKarte {

    // Verbindungsvariablen
    static Connection con = null;
    static Statement st = null;
    static PreparedStatement pst = null;
    static ResultSet rst = null;
    
    //Variablen/Eigenschaften
    private int benutzer_id;
    private int lernkarte_id;
    private boolean wiedervorlage;

    //Konstruktor:
    public Benutzer2LernKarte(int benutzer_id, int lernkarte_id, boolean wiedervorlage) {
        this.benutzer_id = benutzer_id;
        this.lernkarte_id = lernkarte_id;
        this.wiedervorlage = wiedervorlage;
    }

    //Getter:
    public int getBenutzer_id() {
        return benutzer_id;
    }

    public int getLernkarte_id() {
        return lernkarte_id;
    }

    public boolean isWiedervorlage() {
        return wiedervorlage;
    }
}