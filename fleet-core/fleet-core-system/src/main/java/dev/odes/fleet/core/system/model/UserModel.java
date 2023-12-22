package dev.odes.fleet.core.system.model;

import dev.odes.fleet.common.model.AbstractModel;
import dev.odes.fleet.core.system.entity.User;
import dev.odes.fleet.core.system.enumeration.UserTypeEnum;

public class UserModel extends AbstractModel<User> {
    private String id;
    private String username;
    private String password;
    private String code;
    private String name;
    private String email;
    private String phone;
    private UserTypeEnum userType;
    private Boolean isSuperAdmin;
    private String note;

    public UserModel() {
    }

//    public UserModel(User user) {
//        this.fromEntity(user);
//    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserTypeEnum getUserType() {
        return userType;
    }

    public void setUserType(UserTypeEnum userType) {
        this.userType = userType;
    }

    public Boolean getIsSuperAdmin() {
        return isSuperAdmin;
    }

    public void setIsSuperAdmin(Boolean superAdmin) {
        isSuperAdmin = superAdmin;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public void fromEntity(User user) {

    }

    @Override
    public User toEntity() {
        return null;
    }
}
