package restAssuredMavenGI.restAssuredMavenAI;

import java.util.List;

public class ListUsersPOJO {
	
		
	private String page;
	private String per_page;
	private String total;
	private String total_pages;
	private List<DataPOJO> data;
	private SupportPOJO support;
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPer_page() {
		return per_page;
	}
	public void setPer_page(String per_page) {
		this.per_page = per_page;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(String total_pages) {
		this.total_pages = total_pages;
	}
	public List<DataPOJO> getData() {
		return data;
	}
	public void setData(List<DataPOJO> data) {
		this.data = data;
	}
	public SupportPOJO getSupport() {
		return support;
	}
	public void setSupport(SupportPOJO support) {
		this.support = support;
	}
	@Override
	public String toString() {
		return "ListUsersPOJO [page=" + page + ", per_page=" + per_page + ", total=" + total + ", total_pages="
				+ total_pages + ", data=" + data + ", support=" + support + "]";
	}
	
	
	
	
	
	
	

}
