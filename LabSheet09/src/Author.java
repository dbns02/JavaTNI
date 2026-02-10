public class Author {
    private String name;
    private String nationality;
    private int birthyear;

    Author(String name, String nationality, int birthyear) {
        this.name = name;
        this.nationality = nationality;
        this.birthyear = birthyear;
    }
    Author(String name, String nationality) {
        this(name,nationality,0);
    }
    Author(String name) {
        this(name,"",0);
    }
    Author() {
        this("","",0);
    }
    String getName() {
        return name;
    }
    String showAuthorInfo() {
        if (nationality.equals(""))/* == เป็นการเปรียบเทียบ หรือการใช้ที่คล้ายกันกับ equals คือ isEmpty() */ {
            return name;
        }
        if (birthyear == 0) {
            return name + " (" + nationality + ")";
        }
        return name + " (" + nationality + ", born " + birthyear + ")";
    }
}
