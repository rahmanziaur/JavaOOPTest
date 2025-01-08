

/**
 * Created by habib on 3/10/17.
 */
public class Student {
    private Integer id;
    private String name;
    private String role;
    private String session;

    public Student() {
    }

    public Student(Integer id, String name, String role, String session) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.session = session;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}
