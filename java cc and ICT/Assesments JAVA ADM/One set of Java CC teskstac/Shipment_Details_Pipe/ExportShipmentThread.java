package java_lc_cc.Shipment_Details_Pipe;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExportShipmentThread extends Thread {

	// fill in your attributes

	List<Shipment> shipmentList = new ArrayList<>();
	StringBuilder shipmentDetails = new StringBuilder();

	public ExportShipmentThread(List<Shipment> shipmentList) {
		this.shipmentList = shipmentList;
	}

	public void run() {

		for (Shipment sh : shipmentList)
			shipmentDetails.append(sh+"\n");

	}

	public StringBuilder getShipmentDetails() {
		return shipmentDetails;
	}

}

