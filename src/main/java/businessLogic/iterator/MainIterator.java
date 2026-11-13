package businessLogic.iterator;

import businessLogic.BLFacade;
import businessLogic.ExtendedIterator;
import domain.Sale;
import factory.BLFacadeFactory;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class MainIterator {
    public static void main(String[]	args) throws MalformedURLException {
//	the	BL	is	local
        boolean c = true;
        BLFacade blFacade =	new BLFacadeFactory().createBLFacade(c);
        ExtendedIterator<Sale> it = blFacade.getSalesIterator("A");
        if (!it.hasNext()) {
            System.out.println("No sales found in the database; displaying sample sales.");
            List<Sale> sampleSales = new ArrayList<>();
            sampleSales.add(createSampleSale(1, "Sample sale A", 100.0f));
            sampleSales.add(createSampleSale(2, "Sample sale B", 200.0f));
            it = new ExtendedIteratorSales(sampleSales);
        }
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

    private static Sale createSampleSale(int saleNumber, String title, float price) {
        Sale sale = new Sale();
        sale.setSaleNumber(saleNumber);
        sale.setTitle(title);
        sale.setPrice(price);
        return sale;
    }
}
