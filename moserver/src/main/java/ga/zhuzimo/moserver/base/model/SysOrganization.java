package ga.zhuzimo.moserver.base.model;

import java.io.Serializable;
import java.util.List;

public class SysOrganization extends BaseModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String organizationId;

    private String pid;

    private String pName;

    private String name;

    private String alias;

    private String organizationType;

    private String contactTel;

    private String businessHours;

    private String workingHours;

    private String address;

    private String addressDetail;

    private String organizationPic;

    private String description;

    private String createTime;

    private String createUser;

    private String updateTime;

    private String updateUser;

    private Long orders;

    private List<SysOrganization> children ;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public List<SysOrganization> getChildren() {
        return children;
    }

    public void setChildren(List<SysOrganization> children) {
        this.children = children;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType == null ? null : organizationType.trim();
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel == null ? null : contactTel.trim();
    }

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours == null ? null : businessHours.trim();
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours == null ? null : workingHours.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public String getOrganizationPic() {
        return organizationPic;
    }

    public void setOrganizationPic(String organizationPic) {
        this.organizationPic = organizationPic == null ? null : organizationPic.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public Long getOrders() {
        return orders;
    }

    public void setOrders(Long orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", organizationId=").append(organizationId);
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", alias=").append(alias);
        sb.append(", organizationType=").append(organizationType);
        sb.append(", contactTel=").append(contactTel);
        sb.append(", businessHours=").append(businessHours);
        sb.append(", workingHours=").append(workingHours);
        sb.append(", address=").append(address);
        sb.append(", addressDetail=").append(addressDetail);
        sb.append(", organizationPic=").append(organizationPic);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", orders=").append(orders);
        sb.append("]");
        return sb.toString();
    }
}