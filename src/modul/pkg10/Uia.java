package modul.pkg10;
import java.util.ArrayList;

/**
 * @author Marius G. Norli
 */
public class Uia {
    
    private ArrayList<User> allUsers;
    private ArrayList<Student> allStudents;
    private ArrayList<
    
    public Uia(){
        allUsers = new ArrayList<User>();
   }
    
    /**
    * Finner en bruker ut ifra fornavn og etternavn og kaller brukerobjektet sin printInfo metode
    * @param fornavn Fornavnet på brukeren vi ønsker å finne
    * @param etternavn 
    */
    public void findByName(String fornavn, String etternavn){
        for(User aUser : allUsers){
            if(aUser.getFornavn().equals(fornavn) && aUser.getEtternavn().equals(etternavn))
            aUser.printInfo();
            else{
                System.out.println("Fant ingen brukere med navn " + aUser.getFornavn() + aUser.getEtternavn());
            }
        }
    }
    /*
    *   Finner en bruker ut ifra oppgitt kompetanse
    *   @param position Den ønskede kompetansen det ønskes å søke etter
    */
    public void findByCompetence(String fagområde){
        for(User aUser : allUsers){
            if(FaglEmployee.getFagområde().equals(fagområde))
            aUser.printInfo();
            else{
                System.out.println("Fant ingen brukere med fagområde " + fagområde);
            }
        }
    }
    
    public void findBySubject(String subject, int credits){
        for(User aUser : allUsers){
            if(aUser.getSubject().equals(subject) && Student.getCredits() == credits)
            aUser.printInfo();
            else{
                System.out.println("Fant ingen studenter som går " + subject + " og har " + credits + " studiepoeng");
            }
        }
    }
    
    public void fyllListe(){
        Student student1 = new Student("John", "test", "Skogveien", "test@test.no", 99999992, "Vår 2017", 15, "IT");
        addToList(student1);
        FaglEmployee FaglEmployee1 = new FaglEmployee("Johan", "Gold", "Testveien 01", "test@test.no", 11111112, "Professor IT", 100, 5 ,"Økonomi");
        addToList(FaglEmployee1);
        
        //Student.addNewStudent("John", "test", "Skogveien", "test@test.no", 99999992, "Vår 2017", 15, "IT");
        //Student.addNewStudent("Petter", "test", "Skogveien", "test@test.no", 99999993, "Høst 2017", 99, "Økonomi");
        //Student.addNewStudent("Arne", "test", "Skogveien", "test@test.no", 99999994, "Vår 2017", 6, "Økonomi");
        //FaglEmployee.addFagEmployee("Petter", "Johnsen", "Testveien 01", "test@test.no", 11111111, "Professor IT", 70, 3 ,"IT");
        //FaglEmployee.addFagEmployee("Johan", "Gold", "Testveien 01", "test@test.no", 11111112, "Professor IT", 100, 5 ,"Økonomi");
    }
    
    public void addToList(User user){
        allUsers.add(user);
    }
}