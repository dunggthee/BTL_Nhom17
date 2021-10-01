
package b;


public class thongtin {
    private String tuoi, name, address,email;
    private int phone;
    private boolean gender;

    public thongtin() {
    }

    public thongtin(String tuoi, String name, int phone, String address, String email, boolean gender) {
        this.tuoi = tuoi;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.gender = gender;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    
}
