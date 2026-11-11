package businessLogic.iterator;

import businessLogic.ExtendedIterator;
import domain.Sale;

import java.util.List;

public class ExtendedIteratorSales implements ExtendedIterator<Sale> {
    private List<Sale> sales;
    private int currentIndex;

    public ExtendedIteratorSales(List<Sale> sales) {
        this.sales = sales;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < sales.size();
    }

    @Override
    public Sale next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more elements");
        }
        return sales.get(currentIndex++);
    }

    @Override
    public Sale previous() {
        if (!hasPrevious()) {
            throw new IndexOutOfBoundsException("No previous elements");
        }
        return sales.get(--currentIndex);
    }

    @Override
    public boolean hasPrevious() {
        return currentIndex > 0;
    }

    @Override
    public void goFirst() {
        currentIndex = 0;
    }

    @Override
    public void goLast() {
        currentIndex = sales.size() - 1;
    }
}
