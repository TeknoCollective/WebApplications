package hello.model;

public class Student {
    private String firstname;
    private String lastname;
    private String address;
    
    public Student(){}
    
    public Student(String firstname, String lastname, String address){
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
