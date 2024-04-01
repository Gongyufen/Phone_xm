package shitil;

import java.sql.Timestamp;

public class Z_record {
	private int z_rid;
	private int z_uid;
	private int c_did;
	private Timestamp z_rdate;
	public Z_record(int z_rid, int z_uid, int c_did, Timestamp z_rdate) {
		super();
		this.z_rid = z_rid;
		this.z_uid = z_uid;
		this.c_did = c_did;
		this.z_rdate = z_rdate;
	}
	public int getZ_rid() {
		return z_rid;
	}
	public void setZ_rid(int z_rid) {
		this.z_rid = z_rid;
	}
	public int getZ_uid() {
		return z_uid;
	}
	public void setZ_uid(int z_uid) {
		this.z_uid = z_uid;
	}
	public int getC_did() {
		return c_did;
	}
	public void setC_did(int c_did) {
		this.c_did = c_did;
	}
	public Timestamp getZ_rdate() {
		return z_rdate;
	}
	public void setZ_rdate(Timestamp z_rdate) {
		this.z_rdate = z_rdate;
	}
	 
}

