package shitil;

import java.sql.Timestamp;

public class G_inventory {
	private int g_inid;
	private int c_did;
	private int g_count;
	private Timestamp g_intime;
	public G_inventory(int g_inid, int c_did, int g_count, Timestamp g_intime) {
		super();
		this.g_inid = g_inid;
		this.c_did = c_did;
		this.g_count = g_count;
		this.g_intime = g_intime;
	}
	public int getG_inid() {
		return g_inid;
	}
	public void setG_inid(int g_inid) {
		this.g_inid = g_inid;
	}
	public int getC_did() {
		return c_did;
	}
	public void setC_did(int c_did) {
		this.c_did = c_did;
	}
	public int getG_count() {
		return g_count;
	}
	public void setG_count(int g_count) {
		this.g_count = g_count;
	}
	public Timestamp getG_intime() {
		return g_intime;
	}
	public void setG_intime(Timestamp g_intime) {
		this.g_intime = g_intime;
	}
	
}
