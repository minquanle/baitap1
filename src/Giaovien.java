//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Giaovien {
    private String name;
    private String dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Giaovien(String name, String id, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public String getInfo() {
        return name + " " + dateOfBirth;
    }
}