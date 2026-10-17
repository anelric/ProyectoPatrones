package dataAccess;

import java.util.Date;

public class EditSaleParameter {
	private String text;
	private int numStatus;
	private float price;
	private Date trim;
	private boolean hab;

	public EditSaleParameter(String text, int numStatus, float price, Date trim, boolean hab) {
		this.text = text;
		this.numStatus = numStatus;
		this.price = price;
		this.trim = trim;
		this.hab = hab;
	}

	public String getText() {
		return text;
	}

	public int getNumStatus() {
		return numStatus;
	}

	public float getPrice() {
		return price;
	}

	public Date getTrim() {
		return trim;
	}

	public boolean isHab() {
		return hab;
	}
}