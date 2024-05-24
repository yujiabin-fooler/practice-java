package net.jiabin.design.pattern.practice.prototype.code2;

/**
 * @author Guan
 * 用户地址类
 */
public class Address {
    public String city;
    public String district;
    public String street;

    public Address(String city, String district, String street) {
        this.city = city;
        this.district = district;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}

