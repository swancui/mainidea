package com.store.entity;

public class Product {
	private String pid;			//��Ʒid
	private String pname;		//��Ʒ����
	private Double market_price;//�г���
	
	private Double shop_price;	//�̳Ǽ�
	private String pimage;		//��ƷͼƬ
	private String pdate;			//�ϼ�����

	private Integer is_hot; 	//�Ƿ����� 1������  0��������
	private String pdesc;		//��Ʒ����
	private Integer pflag;  	//�Ƿ��¼� 1���¼�  0��δ�¼�
	
	private String cid;			//��Ʒ����id
	private Category category;	//��Ʒ����
	
	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public String getPdate() {
		return pdate;
	}
	
	
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	
	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getMarket_price() {
		return market_price;
	}

	public void setMarket_price(Double market_price) {
		this.market_price = market_price;
	}

	public Double getShop_price() {
		return shop_price;
	}

	public void setShop_price(Double shop_price) {
		this.shop_price = shop_price;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	public Integer getIs_hot() {
		return is_hot;
	}

	public void setIs_hot(Integer is_hot) {
		this.is_hot = is_hot;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	public Integer getPflag() {
		return pflag;
	}

	public void setPflag(Integer pflag) {
		this.pflag = pflag;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product(String pid, String pname, Double market_price, Double shop_price, String pimage, String pdate,
			Integer is_hot, String pdesc, Integer pflag, String cid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.market_price = market_price;
		this.shop_price = shop_price;
		this.pimage = pimage;
		this.pdate = pdate;
		this.is_hot = is_hot;
		this.pdesc = pdesc;
		this.pflag = pflag;
		this.cid = cid;
		
	}

	
	public Product(String pid, String pname, Double market_price, Double shop_price, String pimage, String pdate,
			Integer is_hot, String pdesc, Integer pflag, String cid, Category category) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.market_price = market_price;
		this.shop_price = shop_price;
		this.pimage = pimage;
		this.pdate = pdate;
		this.is_hot = is_hot;
		this.pdesc = pdesc;
		this.pflag = pflag;
		this.cid = cid;
		this.category = category;
	}

	public Product() {
		super();
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", market_price=" + market_price + ", shop_price="
				+ shop_price + ", pimage=" + pimage + ", pdate=" + pdate + ", is_hot=" + is_hot + ", pdesc=" + pdesc
				+ ", pflag=" + pflag + ", cid=" + cid + "]";
	}
	
	

}
