package businessLogic.iterator;

import businessLogic.BLFacade;
import businessLogic.ExtendedIterator;
import configuration.ConfigXML;
import domain.Sale;
import factory.BLFacadeFactory;

public class MainIterator {
    public static void main(String[]	args)	{
//	the	BL	is	local
        boolean c = true;
        BLFacade blFacade =	new BLFacadeFactory().createBLFacade(c);
        ExtendedIterator<Sale> it =	blFacade.getSalesIterator();
        Sale s;
        System.out.println("_____________________");
        System.out.println("FROM	LAST	TO	FIRST");
        it.goLast();	//	Go	to	last	element
        while (it.hasPrevious())	{
            s =	it.previous();
            System.out.println(s);
        }
        System.out.println();
        System.out.println("_____________________");
        System.out.println("FROM	FIRST	TO	LAST");
        it.goFirst();	//	Go	to	first	element
        while (it.hasNext())	{
            s =	it.next();
            System.out.println(s);
        }
    }
}
