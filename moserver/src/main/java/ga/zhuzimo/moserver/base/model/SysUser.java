package ga.zhuzimo.moserver.base.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SysUser extends BaseModel implements Serializable {
    private String userId;

    private String userName;

    private String password;

    private String salt;

    private String realname;

    private String avatar;

    private String phone;

    private String email;

    private Byte sex;

    private Byte locked;

    private String createTime;

    private String createUser;

    private String updateTime;

    private String updateUser;

    private List<SysRole> roleList = new ArrayList<>();

    //权限列表
    private List<SysPermission> permissionList = new ArrayList<>();

    //权限封装为树
    private List<SysPermission> permissionTreeList = new ArrayList<>();

    //组织树
    private List<SysOrganization> organizationList = new ArrayList<>();

    //卡片权限列表
    private List<SysCardPermission> cardPermissionList = new ArrayList<>();

    private String organizationId;

    private String organizationName;

    public List<SysCardPermission> getCardPermissionList() {
        return cardPermissionList;
    }

    public void setCardPermissionList(List<SysCardPermission> cardPermissionList) {
        this.cardPermissionList = cardPermissionList;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    public List<SysPermission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<SysPermission> permissionList) {
        this.permissionList = permissionList;
    }

    public List<SysPermission> getPermissionTreeList() {
        return permissionTreeList;
    }

    public void setPermissionTreeList(List<SysPermission> permissionTreeList) {
        this.permissionTreeList = permissionTreeList;
    }

    public List<SysOrganization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(List<SysOrganization> organizationList) {
        this.organizationList = organizationList;
    }
}