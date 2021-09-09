package models;

public class DataRegistro {

    private String userName;
    private String password;

    public DataRegistro() {

        userName = "john1722";
        password = "prueba1";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
