package org.manh.com;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {

	@WebMethod
	@WebResult(partName="lookUpOutput")
	public String getShopInfo(@WebParam(partName="lookUpInput") String Property) {
		
		String response = "Invalid Property";
		if("shopName".equals(Property)) {
			response = "Test Mart";
		}else if("since".equals(Property)) {
			response = "since 2002";
		}
		return response;
		
	}
}
