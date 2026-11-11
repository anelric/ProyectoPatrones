package gui.adapter;
import domain.Sale;
import domain.Seller;

import javax.swing.table.AbstractTableModel;

public class SellerAdapter extends AbstractTableModel {
    private Seller seller;

    public SellerAdapter(Seller seller) {
        this.seller = seller;
    }

    @Override
    public int getRowCount() {
        return seller.getSales().size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sale sale = seller.getSales().get(rowIndex);
        switch (columnIndex) {
            case 0:
                return sale.getTitle();
            case 1:
                return sale.getDescription();
            case 2:
                return sale.getPrice();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "title";
            case 1:
                return "description";
            case 2:
                return "price";
            default:
                return super.getColumnName(column);
        }
    }
}
