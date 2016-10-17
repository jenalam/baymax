package model;

/**
 * Created by Jennifer on 10/16/2016.
 */
public abstract class HospitalStaff {
    private int eid;
    private String fname;
    private String lname;

    public HospitalStaff(int eid, String fname, String lname){
        this.eid = eid;
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getEid() {
        return eid;
    }

}
