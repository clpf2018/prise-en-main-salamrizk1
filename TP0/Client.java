/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp0;

/**
 *
 * @author Salam
 */
public class Client {
    private String _id;
    private String _prenom;
    private String _nom;
    private String _telephone;
    private String _rue;
    private String _ville;
    private String _etat;
    private String _code;
    private String _pays;
    private String _mail;
    
    public void setId (String i){
        this._id =i ;
    }
    
    public String getId (){
        return _id;
    }
    
    public void setPrenom (String p){
        this._prenom =p ;
    }
    
    public String getPrenom (){
        return _prenom;
    }
    
    public void setNom (String n){
        this._nom = n ;
    }
    
    public String getNom(){
        return _nom;
    }
    
    public void setTelephone (String t){
        this._telephone = t ;
    }
    
    public String getTelephone (){
        return _telephone;
    }
    
    public void setRue (String r){
        this._rue = r ;
    }
    
    public String getRue (){
        return _rue;
    }
    
    public void setVille (String v){
        this._ville = v ;
    }

    public String getVille (){
        return _ville;
    }
    
    public void setEtat (String e){
        this._etat = e;
    }
    
    public String getEtat (){
        return _etat;
    }
    
    public void setCode (String c){
        this._code = c ;
    }
    
    public String getCode (){
        return _code;
    }
    
    public void setPays (String p){
        this._pays =p ;
    }
    
    public String getPays (){
        return _pays;
    }
    
    public void setMail (String m){
        this._mail =m ;
    }
    
    public String getMail (){
        return _mail;
    }
}
