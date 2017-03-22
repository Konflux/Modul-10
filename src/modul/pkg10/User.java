package modul.pkg10;

/**
 * @author Marius
 */
public class User {
    
    private String fornavn;
    private String etternavn;
    private String address;
    private String email;
    private int phoneNumber;
    
    public User(String fornavn, String etternavn, String address, String email, int phoneNumber){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public void printInfo(){
        System.out.println("User" + this.fornavn + this.etternavn + " lives at " + this.address + " and has the e-mail address " + this.email + " and the phone number " + this.phoneNumber);
        System.out.println();
    }
    
    public String getFornavn(){
        return this.fornavn;
    }
    
    public String getEtternavn(){
        return this.etternavn;
    }
}
