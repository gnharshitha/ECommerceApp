public class User {
    @Id(stratergy=genarate.Integer)
    private int id;  
    @Column(unique = true, nullable = false)
    private String name;
    private String email;
    private String userType;
    private String password;
    // Constructor
    public User(int id, String name, String email) { 
        this.id = id;
        this.name = name;
        this.email = email;
        this.userType=userType;
        this.password=password;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
        public String getuserType() {
        return userType;
    }
       public String getpassword() {
        return password;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setuserType(String userType) {
        this.userType = userType;
    }

    public void setpassword(String userType) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", userType='" + userType + '\''+
                ", password='" + password + '\''
                '}';
    }
}