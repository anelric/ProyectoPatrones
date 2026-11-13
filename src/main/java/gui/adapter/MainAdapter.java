package gui.adapter;

import businessLogic.BLFacade;
import configuration.ConfigXML;
import domain.Seller;
import factory.BLFacadeFactory;

import java.net.MalformedURLException;

public class MainAdapter {
    public static void main(String[] args) throws MalformedURLException {
//	the	BL	is	local
    	boolean c = true;
        BLFacade blFacade =	new BLFacadeFactory().createBLFacade(c);
        Seller s = (Seller) blFacade.buscarPorUser("Aitor Fernandez");
        SellerTable	st=new	SellerTable(s);
        st.setVisible(true);
    }
}
