package com.library.common;

import com.library.enums.AccounStatusEnum;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ISAAC on 1/14/2015.
 */
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfbirth;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddrs;
    @Column(name = "SCREEN_NAME")
    private String screenName;
    @Column(name = "CELLPHONE")
    private String cellPhoneNo;
    @Column(name = "ADDRESS")
    private Address address;
    @Column(name = "ACCOUNT_STATUS")
    @Enumerated(EnumType.STRING)
    private AccounStatusEnum accounStatusEnum;
    @Column(name = "CREATE_DATE")
    private Date createDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfbirth() {
        return dateOfbirth;
    }

    public void setDateOfbirth(Date dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailAddrs() {
        return emailAddrs;
    }

    public void setEmailAddrs(String emailAddrs) {
        this.emailAddrs = emailAddrs;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCellPhoneNo() {
        return cellPhoneNo;
    }

    public void setCellPhoneNo(String cellPhoneNo) {
        this.cellPhoneNo = cellPhoneNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AccounStatusEnum getAccounStatusEnum() {
        return accounStatusEnum;
    }

    public void setAccounStatusEnum(AccounStatusEnum accounStatusEnum) {
        this.accounStatusEnum = accounStatusEnum;
    }

    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserInfo");
        stringBuilder.append("id=").append(id);
        stringBuilder.append("name=").append(name);
        stringBuilder.append("surname=").append(surname);
        stringBuilder.append("dateOfBirth=").append(dateOfbirth);
        stringBuilder.append("gender=").append(gender);
        stringBuilder.append("emailAddrss=").append(emailAddrs);
        stringBuilder.append("screenName=").append(screenName);
        stringBuilder.append("cellphone=").append(cellPhoneNo);
        stringBuilder.append("address=").append(address);
        stringBuilder.append("accountStatus=").append(accounStatusEnum);
        stringBuilder.append("createDate=").append(createDate);

        return stringBuilder.toString();
    }


}
