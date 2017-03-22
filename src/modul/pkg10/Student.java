package modul.pkg10;

/**
 * @author Marius
 */
public class Student extends User {
    
    private String startupSemester;
    private int credits;
    private String subject;

    public Student(String fornavn, String etternavn, String address, String email, int phoneNumber, String startupSemester, int credits, String subject){
        super(fornavn, etternavn, address, email, phoneNumber);
        this.startupSemester = startupSemester;
        this.credits = credits;
        this.subject = subject;
    }
    
    /**
    *   Lar deg sette oppstartssemester på en bruker
    *   @param startupSemester Oppstartssemesteret til en student i formatet periode + år, eks Vår 2017 eller Høst 2019
    */
    public void setStartupSemester(String startupSemester) {
        if(startupSemester.length() > 9){
            System.out.println("The length of startup semester can not be longer than 9 characters!, are you using the correct format?");
        }
        else{
            this.startupSemester = startupSemester;
        }
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    /**
    *   Lar deg endre studentens studie
    *   @param subject Lar deg sette studentens studie, bruk standardiserte navn fra UiA 
    *   hvor alle bokstaver er i riktig størrelse.
    */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
    *   Gir deg oppstartssemesteret til en student
    *   @return Oppstartssemesteret til en student i form av periode + år, eks Vår 2017
    */
    public String getStartupSemester() {
        return startupSemester;
    }

    public int getCredits() {
        return credits;
    }

    public String getSubject() {
        return subject;
    }
    
    public void addNewStudent(String fornavn, String etternavn, String address, String email, int phoneNumber, String startupSemester, int credits, String subject){
        Student student1 = new Student(fornavn, etternavn, address, email, phoneNumber, startupSemester, credits, subject);
    }
}
