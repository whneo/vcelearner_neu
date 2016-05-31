package vcelearner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Isabel
 */

public class Benutzer2LernKarte {

    // Verbindungsvariablen
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
        
    public static void insert(Benutzer2LernKarte B2LK) {        
        try {
            // VERBINDUNG AUFBBAUEN:
            Connection con = MySQLConnection.getConnection();
            // STATEMENT
            String Sql = "INSERT INTO Benutzer2LernKarte VALUES (?, ?, ?)";
            pst = con.prepareStatement(Sql);
            pst.setInt(1, B2LK.getBenutzer_id());
            pst.setInt(2, B2LK.getLernKarte_id());
            pst.setString(3, String.valueOf(B2LK.isWiedervorlage()));            
            pst.executeUpdate();            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (rst != null) {
                    rst.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }        
    }
    
    public static ArrayList<Benutzer2LernKarte> getAllByBenutzer(Benutzer user){
        ArrayList<Benutzer2LernKarte> users = new ArrayList<>();
        try {
            Connection con = MySQLConnection.getConnection();
            String sql = "SELECT * FROM Benutzer2LernKarte WHERE benutzer_id=?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, user.getId());
            rst = pst.executeQuery();
            while (rst.next()) {
                Benutzer2LernKarte B2LK = new Benutzer2LernKarte(
                                        rst.getInt("benutzer_id"),
                                        rst.getInt("lernkarte_id"),
                                        Boolean.parseBoolean(rst.getString("wiedervorlage"))
                );
                users.add(B2LK);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (rst != null) {
                    rst.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return users;
    }
        
    public static void delete(Benutzer user, LernKarte lK) {
        try {
            Connection con = MySQLConnection.getConnection();
            String Sql = "DELETE FROM Benutzer2LernKarte WHERE benutzer_id=? AND lernkarte_id=?";
            pst = con.prepareStatement(Sql);
            pst.setInt(1, user.getId());
            pst.setInt(2, lK.getId());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
                        
    //Getter:
    public int getBenutzer_id() {
        return benutzer_id;
    }

    public int getLernKarte_id() {
        return lernkarte_id;
    }

    public boolean isWiedervorlage() {
        return wiedervorlage;
    }

    @Override
    public String toString() {
        return "Benutzer2LernKarte{" + "benutzer_id=" + benutzer_id + ", lernkarte_id=" + lernkarte_id + ", wiedervorlage=" + wiedervorlage + '}';
    }    
}
