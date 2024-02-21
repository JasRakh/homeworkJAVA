public class Student {

    private String firstName;
    private String lastName;
    private String id;

    Student(){}
    Student(String fn, String ln, String idInput){
        this.firstName = fn;
        this.lastName = ln;
        this.id = idInput;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%s-%s-%s", getFirstName(), getLastName(), getId());
    }
}