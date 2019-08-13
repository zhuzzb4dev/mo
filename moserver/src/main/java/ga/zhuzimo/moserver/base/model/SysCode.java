package ga.zhuzimo.moserver.base.model;

import java.io.Serializable;

public class SysCode extends BaseModel implements Serializable{
    private String codeId;

    private String codeType;

    private String code;

    private String value;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId == null ? null : codeId.trim();
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType == null ? null : codeType.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", codeId=").append(codeId);
        sb.append(", codeType=").append(codeType);
        sb.append(", code=").append(code);
        sb.append(", value=").append(value);
        sb.append(", description=").append(description);
        sb.append("]");
        return sb.toString();
    }
}