public class Sinhvien extends Giaovien {
    private String name;
    private String dateOfBirth;
    private String id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Sinhvien(String name, String dateOfBirth, String id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }

    public String getInfo() {
        return name + " " + dateOfBirth + " " + id;
    }
}
