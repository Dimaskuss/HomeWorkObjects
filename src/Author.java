public class Author {
     private String authorFirstName;
     private String authorMiddleName;
    private String authorLastName;


    public Author(String authorFirstName, String authorMiddleName, String authorLastName) {
        this.authorFirstName = authorFirstName;
        this.authorMiddleName = authorMiddleName;
        this.authorLastName = authorLastName;

    }


    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public String getAuthorMiddleName() {
        return this.authorMiddleName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }


}


