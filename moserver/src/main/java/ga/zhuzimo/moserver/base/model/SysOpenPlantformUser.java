package ga.zhuzimo.moserver.base.model;

import java.io.Serializable;

public class SysOpenPlantformUser extends BaseModel implements Serializable {
    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table sys_open_plantform_user
     *
     * @mbg.generated
     * @author hewei
     */
    public static final String DEL_FLAG = "1";

    private String userId;

    private String userToken;

    private String userSecret;

    private String comment;

    private String createTime;

    private String createUser;

    private String updateTime;

    private String updateUser;

    private String delFlag;
    private String refreshType;


    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken == null ? null : userToken.trim();
    }

    public String getUserSecret() {
        return userSecret;
    }

    public void setUserSecret(String userSecret) {
        this.userSecret = userSecret == null ? null : userSecret.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getRefreshType() {
        return refreshType;
    }

    public void setRefreshType(String refreshType) {
        this.refreshType = refreshType;
    }

    @Override
    public String toString() {
        return "SysOpenPlantformUser{" +
                "userId='" + userId + '\'' +
                ", userToken='" + userToken + '\'' +
                ", userSecret='" + userSecret + '\'' +
                ", comment='" + comment + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createUser='" + createUser + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", updateUser='" + updateUser + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", refreshType='" + refreshType + '\'' +
                '}';
    }
}