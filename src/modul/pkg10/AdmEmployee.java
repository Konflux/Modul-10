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
public class AdmEmployee extends Employee {
    
    private String faculty;
    private boolean fellesadm;
    
    public AdmEmployee(String fornavn, String etternavn, String address, String email, int phoneNumber, String position, int stillingsprosent, int lønnstrinn, String faculty, boolean fellesadm) {
        super(fornavn, etternavn, address, email, phoneNumber, position, stillingsprosent, lønnstrinn);
        this.faculty = faculty;
        this.fellesadm = fellesadm;
    }

    public String getFaculty() {
        return faculty;
    }

    public boolean isFellesadm() {
        return fellesadm;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setFellesadm(boolean fellesadm) {
        this.fellesadm = fellesadm;
    }
}
