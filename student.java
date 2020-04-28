public class student {
    String name;
    int studentID;
    String address;
    String phone;
    public student(){ }
    public student(int studentID, String name, String address, String phone){
        this.studentID = studentID;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "student(" + studentID + ", " + name + ", " + address + ", " + phone + ")";
    }
}
