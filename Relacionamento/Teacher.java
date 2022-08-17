package Relacionamento;

/**
 *
 * @author lisle
 */
public class Teacher {

    private String name;
    private String departament;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String obterInfo() {
        return "Professor(a): " + name;
    }
}
