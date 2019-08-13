package ga.zhuzimo.moserver.base.model;

import java.io.Serializable;

public class SysNotification extends BaseModel implements Serializable {
    /**
     * 这是Mybatis Generator拓展插件生成的属性(请勿删除).
     * This field corresponds to the database table sys_notification
     *
     * @mbg.generated
     * @author hewei
     */
    public static final String DEL_FLAG = "1";

    private String notificationId;

    private String userId;

    private String title;

    private String readingState;

    private String createUser;

    private String createTime;

    private String updateUser;

    private String updateTime;

    private String delFlag;

    private String content;

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private static final long serialVersionUID = 1L;

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId == null ? null : notificationId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getReadingState() {
        return readingState;
    }

    public void setReadingState(String readingState) {
        this.readingState = readingState == null ? null : readingState.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", notificationId=").append(notificationId);
        sb.append(", userId=").append(userId);
        sb.append(", title=").append(title);
        sb.append(", readingState=").append(readingState);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}