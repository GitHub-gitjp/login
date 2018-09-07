package cn.itcast.domain;

public class User {
	private int uid;
	private String uname;
	private int uage;
	private String uaccount;
	private String upassword;
	private int to_work;
	private int off_work;
	private int is_out;
	private int is_leave;
	private int is_anager;

	@Override
	public String toString() {
		return "User [uname=" + uname + ", uage=" + uage + ", uaccount=" + uaccount + ", upassword=" + upassword
				+ ", to_work=" + to_work + ", off_work=" + off_work + ", is_out=" + is_out + ", is_leave=" + is_leave
				+ ", is_anager=" + is_anager + "]";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getUage() {
		return uage;
	}

	public void setUage(int uage) {
		this.uage = uage;
	}

	public String getUaccount() {
		return uaccount;
	}

	public void setUaccount(String uaccount) {
		this.uaccount = uaccount;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public int getTo_work() {
		return to_work;
	}

	public void setTo_work(int to_work) {
		this.to_work = to_work;
	}

	public int getOff_work() {
		return off_work;
	}

	public void setOff_work(int off_work) {
		this.off_work = off_work;
	}

	public int getIs_out() {
		return is_out;
	}

	public void setIs_out(int is_out) {
		this.is_out = is_out;
	}

	public int getIs_leave() {
		return is_leave;
	}

	public void setIs_leave(int is_leave) {
		this.is_leave = is_leave;
	}

	public int getIs_anager() {
		return is_anager;
	}

	public void setIs_anager(int is_anager) {
		this.is_anager = is_anager;
	}

	public User() {
		super();
	}

}
