package shitil;

public class Z_indent_details {
	private int z_did;
	private int z_iid;
	private int c_rid;
	private String c_category;
	private double z_unit_price;
	private int z_number;
	private double z_price;
	private int c_gid;
	public Z_indent_details(int z_did, int z_iid, int c_rid, String c_category, double z_unit_price, int z_number,
			double z_price, int c_gid) {
		super();
		this.z_did = z_did;
		this.z_iid = z_iid;
		this.c_rid = c_rid;
		this.c_category = c_category;
		this.z_unit_price = z_unit_price;
		this.z_number = z_number;
		this.z_price = z_price;
		this.c_gid = c_gid;
	}
	public int getZ_did() {
		return z_did;
	}
	public void setZ_did(int z_did) {
		this.z_did = z_did;
	}
	public int getZ_iid() {
		return z_iid;
	}
	public void setZ_iid(int z_iid) {
		this.z_iid = z_iid;
	}
	public int getC_rid() {
		return c_rid;
	}
	public void setC_rid(int c_rid) {
		this.c_rid = c_rid;
	}
	public String getC_category() {
		return c_category;
	}
	public void setC_category(String c_category) {
		this.c_category = c_category;
	}
	public double getZ_unit_price() {
		return z_unit_price;
	}
	public void setZ_unit_price(double z_unit_price) {
		this.z_unit_price = z_unit_price;
	}
	public int getZ_number() {
		return z_number;
	}
	public void setZ_number(int z_number) {
		this.z_number = z_number;
	}
	public double getZ_price() {
		return z_price;
	}
	public void setZ_price(double z_price) {
		this.z_price = z_price;
	}
	public int getC_gid() {
		return c_gid;
	}
	public void setC_gid(int c_gid) {
		this.c_gid = c_gid;
	}
	
}
