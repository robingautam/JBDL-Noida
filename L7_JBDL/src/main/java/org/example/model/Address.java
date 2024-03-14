package org.example.model;

public class Address {
    String address1;
    String address2;
    String pincode;

    Address(){}

    public Address(String address1, String address2, String pincode) {
        this.address1 = address1;
        this.address2 = address2;
        this.pincode = pincode;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
