package UPP;

import javax.swing.JOptionPane;


public class controller {
	static View jf=new View();
	static languageselection lang=new languageselection();
	static proceed proc=new proceed();
	static instruction inst=new instruction();
	static payment p=new payment();
	static fuel f=new fuel();
	static quantity qty=new quantity();
	static model mod=new model(){};
	static transaction tran=new transaction();
	static reciept r=new reciept();
	static completed comp=new completed();
	
	controller(){}
	
	public int getFuel() {
		return mod.fuelunitprice();	
		
	}
	
	public static void main(String[] args){
		
		lang.jp.setVisible(true);
		jf.add(lang.jp);
		lang.jp.repaint();
		
		//mod.setqty("3");
		//System.out.println(mod.getqty());
	}
	
	public void Next1(){

		lang.jp.setVisible(false);
		jf.add(proc.jp2);
	}
	
	public void pmt(){
		p.jp4.setVisible(false);
		if(p.abc==true){mod.setfueltype("Credit Card");}
		else if (p.abc==false){mod.setfueltype("Cash");}
		qty.jp5.setVisible(true);
		jf.add(qty.jp5);
	}
	public void instn(){
		proc.jp2.setVisible(false);
		inst.jp3.setVisible(true);
		jf.add(inst.jp3);
		
		
	}
	public void bck1(){
		inst.jp3.setVisible(false);
		proc.jp2.setVisible(true);
		jf.add(proc.jp2);
		proc.jp2.repaint();
	}
	
	public void Next2(){
		proc.jp2.setVisible(false);
		
		jf.add(f.jp4);
	}
	
	public void Next3(){
		f.jp4.setVisible(false);
		if(f.abc==true){mod.setfueltype("Petrol");}
		else if (f.abc==false){mod.setfueltype("Diesel");}
		mod.fuelunitprice();
		qty.tf3.setText(String.valueOf((mod.fuelunitprice())));
		p.jp4.setVisible(true);
		jf.add(p.jp4);
	}
	
	public void Next4(){
		
		qty.jp5.setVisible(false);
		
		jf.add(tran.jp6);
	}
	
	public void Nextreciept(){
		tran.jp6.setVisible(false);
		jf.add(r.jp6);
	}
	
	public void recieptnext(){
		
		JOptionPane.showMessageDialog(null, "Feulinng has been started \n Please wait untill Completion");
		r.jp6.setVisible(false);
		comp.jp4.setVisible(true);
		jf.add(comp.jp4);
		
	}
	
	public void back2(){
		p.jp4.setVisible(false);
		f.jp4.setVisible(true);
		jf.add(f.jp4);
		f.jp4.repaint();
	}
	
	public void back3(){
		qty.jp5.setVisible(false);
		p.jp4.setVisible(true);
		jf.add(p.jp4);
		p.jp4.repaint();
	}
}
