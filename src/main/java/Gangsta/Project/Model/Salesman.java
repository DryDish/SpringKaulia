package gangsta.project.Model;

public class Salesman {

    private String salesman_id;
    private String first_name;
    private String last_name;
    private String cpr;

    public Salesman (String salesman_id, String first_name, String last_name, String cpr) {
        this.salesman_id = salesman_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.cpr = cpr;
    }

    public String getSalesman_id() {
        return salesman_id;
    }

    public void setSalesman_id(String salesman_id) {
        this.salesman_id = salesman_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }
}
