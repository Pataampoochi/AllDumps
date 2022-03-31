package java_lc_cc.Shipping_Cost;

import java.util.Iterator;
import java.util.List;

class ShippingCostThread extends Thread{

	private List<Cargo> cargoList;
	public List<Double> priceList;


	public ShippingCostThread(List<Cargo> cargoList,List<Double> priceList){

		this.cargoList=cargoList;
		this.priceList=priceList;
	}
	public void run() {

		Iterator<Cargo> itr=cargoList.iterator();
		try{
			while(itr.hasNext()){
				Cargo List1=itr.next();
				if(List1.getStorageType().equals(Cargo.DRY_STORAGE)){
					Double Price=  (List1.getWeight()*0.9);
					priceList.add(Price);


				}
				else if (List1.getStorageType().equals(Cargo.COLD_STORAGE)){
					Double Price=  (List1.getWeight()*1.85);
					priceList.add(Price);

				}

			}
		}
		catch (java.lang.NullPointerException exception)
		{

			System.out.println(exception);
		}


	}

	public List<Cargo> getCargoList() {
		return cargoList;
	}

	public void setCargoList(List<Cargo> cargoList) {
		this.cargoList = cargoList;
	}


	public List<Double> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<Double> priceList) {
		this.priceList = priceList;
	}

}