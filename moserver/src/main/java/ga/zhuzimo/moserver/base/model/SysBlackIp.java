package ga.zhuzimo.moserver.base.model;

import java.io.Serializable;

/**
 * @ClassName: SysBlackIp
 * @Auther: lzt
 * @Date: 2019/6/17 18:54
 * @Description: TODO
 * @Version: 1.0
 */
public class SysBlackIp implements Serializable {

    private static final long serialVersionUID = 1L;

    private String prefix;

    private int start;

    private int end;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
