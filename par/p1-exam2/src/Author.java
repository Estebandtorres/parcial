public class Author {
    private String name;
    private String nationality;
    private int birthYear;

    public Author(String name, String nationality, int birthYear) {
        this.name = name;
        this.nationality = nationality;
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }
    public String getNationality() {
        return this.nationality;
    }
    public int getBirthYear() {
        return this.birthYear;
    }

        
}
