package model;
//Esta clase ya no puede ser instanciada, solo para darle algún comportamiento

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El número telefónico debe ser de 8 dígitos máximo");
        }else if (phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
    }

    @Override //No es propio de la clase user
    public String toString() {
        return "model.User: " + name + "\nEmail: " + email +
                "\nAddress: " + address + ".\nPhone: " + phoneNumber;
    }

    public abstract void showDataUser();//Info sobre los usuarios


}
