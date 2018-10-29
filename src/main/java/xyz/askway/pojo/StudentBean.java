package xyz.askway.pojo;

import java.io.Serializable;

/**
 * author:wlm
 * name:学生bean
 * function:
 * 2018/10/21 8:50
 */
public class StudentBean implements Serializable {
    private Integer sid;
    private String sname;
    private Integer ssex;
    private Integer sage;

    public StudentBean() {
    }

    public StudentBean(Integer sid, String sname, Integer ssex, Integer sage) {
        this.sid = sid;
        this.sname = sname;
        this.ssex = ssex;
        this.sage = sage;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSsex() {
        return ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sage='" + sage + '\'' +
                '}';
    }
}
