package shitil;

public class G_parameter {
	private int g_xtid;
	private String g_color;
	private int g_pagesize;
	private int g_defaultpagesize;
	private String g_defaultcolor;
	public G_parameter(int g_xtid, String g_color, int g_pagesize, int g_defaultpagesize, String g_defaultcolor) {
		super();
		this.g_xtid = g_xtid;
		this.g_color = g_color;
		this.g_pagesize = g_pagesize;
		this.g_defaultpagesize = g_defaultpagesize;
		this.g_defaultcolor = g_defaultcolor;
	}
	public int getG_xtid() {
		return g_xtid;
	}
	public void setG_xtid(int g_xtid) {
		this.g_xtid = g_xtid;
	}
	public String getG_color() {
		return g_color;
	}
	public void setG_color(String g_color) {
		this.g_color = g_color;
	}
	public int getG_pagesize() {
		return g_pagesize;
	}
	public void setG_pagesize(int g_pagesize) {
		this.g_pagesize = g_pagesize;
	}
	public int getG_defaultpagesize() {
		return g_defaultpagesize;
	}
	public void setG_defaultpagesize(int g_defaultpagesize) {
		this.g_defaultpagesize = g_defaultpagesize;
	}
	public String getG_defaultcolor() {
		return g_defaultcolor;
	}
	public void setG_defaultcolor(String g_defaultcolor) {
		this.g_defaultcolor = g_defaultcolor;
	}
	
}
