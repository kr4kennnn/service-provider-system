package project101;

public abstract class Customer {

    private String citizenshipNr;
    private String name;
    private String tel;
    private String mail;

    public Customer(String citizenshipNr) {
        this.citizenshipNr = citizenshipNr;
    }

    //this constructor is built for the unit testing
    public Customer(String citizenshipNr, String name, String tel, String mail) {
        this.citizenshipNr = citizenshipNr;
        this.name = name;
        this.tel = tel;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "CITIZENSHIP NR: " + citizenshipNr + "\nCUSTOMER NAME: " + name;
    }

}
