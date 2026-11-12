package gui.adapter;

import businessLogic.BLFacade;
import configuration.ConfigXML;
import domain.Seller;
import factory.BLFacadeFactory;

public class MainAdapter {
    public static void main(String[] args)	{
//	the	BL	is	local
    	ConfigXML c=ConfigXML.getInstance().setLocal();
        BLFacade blFacade =	new BLFacadeFactory().createBLFacade(c);
        Seller s= blFacade.isLogged("Aitor	Fernandez","aurrera");
        SellerTable	st=new	SellerTable(s);
        st.setVisible(true);
    }
}
