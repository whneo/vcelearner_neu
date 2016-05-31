/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vcelearner;

/**
 *
 * @author J.Bleich
 */
public class Benutzer {
    private int id;
    private String login, passwort, vorname, nachname;

    public Benutzer(String login, String passwort) {
        this.login = login;
        this.passwort = passwort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswort() {
        return passwort;
    }
    
    
}
