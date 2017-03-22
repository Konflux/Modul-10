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
public class FaglEmployee extends Employee {
   
    private static String fagområde;
   
    public FaglEmployee(String fornavn, String etternavn, String address, String email, int phoneNumber, String position, int stillingsprosent, int lønnstrinn, String fagområde){
       super(fornavn, etternavn, address, email, phoneNumber, position, stillingsprosent, lønnstrinn);
       this.fagområde = fagområde;
   }

    public static String getFagområde() {
        return fagområde;
    }

    public static void addFagEmployee(String fornavn, String etternavn, String address, String email, int phoneNumber, String position, int stillingsprosent, int lønnstrinn, String fagområde) {
       FaglEmployee employee1 = new FaglEmployee(fornavn, etternavn, address, email, phoneNumber, position, stillingsprosent, lønnstrinn, fagområde);
       Uia.addToList(employee1);
    }
}
