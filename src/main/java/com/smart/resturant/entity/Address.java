package com.smart.resturant.entity;

import java.io.Serializable;
import java.util.Objects;

public class Address extends BaseEntity implements Serializable {
    private Integer aid;
    private Integer uid;
    private String name;
    private String province_name;
    private String province_code;
    private String city_name;
    private String city_code;
    private String area_name;
    private String area_code;
    private String zip;
    private String address;
    private String phone;
    private String tel;
    private String tag;
    private Integer is_default;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

    public String getProvince_code() {
        return province_code;
    }

    public void setProvince_code(String province_code) {
        this.province_code = province_code;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getArea_code() {
        return area_code;
    }

    public void setArea_code(String area_code) {
        this.area_code = area_code;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getIs_default() {
        return is_default;
    }

    public void setIs_default(Integer is_default) {
        this.is_default = is_default;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Address address1 = (Address) o;
        return Objects.equals(aid, address1.aid) && Objects.equals(uid, address1.uid) && Objects.equals(name, address1.name) && Objects.equals(province_name, address1.province_name) && Objects.equals(province_code, address1.province_code) && Objects.equals(city_name, address1.city_name) && Objects.equals(city_code, address1.city_code) && Objects.equals(area_name, address1.area_name) && Objects.equals(area_code, address1.area_code) && Objects.equals(zip, address1.zip) && Objects.equals(address, address1.address) && Objects.equals(phone, address1.phone) && Objects.equals(tel, address1.tel) && Objects.equals(tag, address1.tag) && Objects.equals(is_default, address1.is_default);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), aid, uid, name, province_name, province_code, city_name, city_code, area_name, area_code, zip, address, phone, tel, tag, is_default);
    }

    @Override
    public String toString() {
        return "Address{" +
                "aid=" + aid +
                ", uid=" + uid +
                ", name='" + name + '\'' +
                ", province_name='" + province_name + '\'' +
                ", province_code='" + province_code + '\'' +
                ", city_name='" + city_name + '\'' +
                ", city_code='" + city_code + '\'' +
                ", area_name='" + area_name + '\'' +
                ", area_code='" + area_code + '\'' +
                ", zip='" + zip + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", tel='" + tel + '\'' +
                ", tag='" + tag + '\'' +
                ", is_default=" + is_default +
                '}';
    }
}
