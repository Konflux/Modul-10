package modul.pkg10;

/**
 *
 * @author Marius
 */
public class Employee extends User {
    
    private String position;
    private int stillingsprosent;
    private int lønnstrinn;
    
    public Employee(String fornavn, String etternavn, String address, String email, int phoneNumber, String position, int stillingsprosent, int lønnstrinn){
        super(fornavn, etternavn, address, email, phoneNumber);
        this.position = position;
        this.stillingsprosent = stillingsprosent;
        this.lønnstrinn = lønnstrinn;
    }
}