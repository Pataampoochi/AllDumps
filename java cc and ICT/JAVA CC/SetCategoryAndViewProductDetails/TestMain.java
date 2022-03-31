package java_lc_cc.SetCategoryAndViewProductDetails;

public class TestMain {

	public static void main(String[] args){

		Product p=new Product();
		p.setProdId(100);
		p.setProdName("TV");
		p.setUnitPrice(8000);
		p.setProductCategory();
		System.out.println(p.getCategory());
		Shop s=new Shop();
		Product p1=s.viewProduct(111);
		System.out.println(p1.getProdId()+p1.getProdName()+p1.getUnitPrice());

	}
}
