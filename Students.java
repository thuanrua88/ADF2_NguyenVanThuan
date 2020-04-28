package ADF2_NguyenVanThuan;
public class Students {
    private String id, name, address;
    private int Phone;

    public Students(String id, String name, String address, int phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        Phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }
}
