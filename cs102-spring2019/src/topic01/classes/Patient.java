
package topic01.classes;


public class Patient {
    private String name;
    private Address address;
    private String ID;
    private String mobilePhone; 

    public Patient(String name, Address address, String ID, String mobilePhone) {
          setName(name);
          setAddress(address);
          setID(ID);
          setMobilePhone(mobilePhone);
    }
    
    public Patient(Patient patient){
        this(patient.getName(), patient.getAddress(), patient.getID(), patient.getMobilePhone());
    }
    
    public Patient(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        if(ID.length()== 6)
        this.ID = ID; 
        else throw new IllegalArgumentException("The ID should contain 6 charachters");
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        if((mobilePhone.length()==10)&&(mobilePhone.startsWith("05")))
        this.mobilePhone = mobilePhone;
        else throw new IllegalArgumentException("The mobile phone should conatin 10 charachters and begin with 05");
    }

    @Override
    public String toString() {
        return String.format("[%s]: %s, %s, {%s, %s, %s}", getID(), getName(), getMobilePhone(), getAddress().getStreet(),
                getAddress().getCity(), getAddress().getCountry());
    }
    
    
    
}
