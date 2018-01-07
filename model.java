package UPP;

import java.util.*;

public class model {
	public String paymentmethod,fueltype;
	public int qunt,q,price,diesel=80,petrol=65;
	
	public void setpaymentmethod(String abc){ paymentmethod=abc;}
	public String getpaymentmethod(){return paymentmethod;}
	public void setfueltype(String xyz){fueltype=xyz;}
	public String getfueltype(){return fueltype;}
	public void setqty(int a){
		this.qunt = a;
		
		setprice();
	}
	public int getqty(){
		return this.qunt;}
	public void setprice(){price=getqty()*new controller().getFuel();}
	public int getprice(){return price;}
	public int getdieselprice(){
		return diesel;}
	public int getpetrolprice(){
		return petrol;}
	public int fuelunitprice(){if(getfueltype()==("Petrol")){return getpetrolprice();}
	else if (getfueltype()==("Diesel")){return getdieselprice();}
	else return 0;
	}
	

}
