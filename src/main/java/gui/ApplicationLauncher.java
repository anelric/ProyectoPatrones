package gui;

import java.awt.Color;
import java.net.URL;
import java.util.Locale;

import javax.swing.UIManager;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import configuration.ConfigXML;
import dataAccess.DataAccess;
import factory.BLFacadeFactory;
import businessLogic.BLFacade;
import businessLogic.BLFacadeImplementation;

public class ApplicationLauncher { 
	
	
	
	public static void main(String[] args) {

		ConfigXML c=ConfigXML.getInstance();		
		Locale.setDefault(new Locale(c.getLocale()));
		
		MainGUI a=new MainGUI(new BLFacadeFactory());
		a.setVisible(true);


		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");

			MainGUI.setBussinessLogic(c);
			//ErreklamatuGUI g=new ErreklamatuGUI();
			//g.setVisible(true);
			
		}catch (Exception e) {
			a.getTextoErrores().setText("Error: "+e.toString());
			a.getTextoErrores().setForeground(Color.RED);	
			
			System.out.println("Error in ApplicationLauncher: "+e.toString());
		}


	}

}
