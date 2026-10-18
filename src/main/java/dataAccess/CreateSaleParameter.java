package dataAccess;

import java.io.File;
import java.util.Date;

public class CreateSaleParameter {
	private float price;
	private Date pubDate;
	private String usuario;
	private File file;
	private int tVenta;

	public CreateSaleParameter( float price, Date pubDate, String usuario, File file, int tVenta) {
		this.price = price;
		this.pubDate = pubDate;
		this.usuario = usuario;
		this.file = file;
		this.tVenta = tVenta;
	}

	public float getPrice() {
		return price;
	}

	public Date getPubDate() {
		return pubDate;
	}

	public String getUsuario() {
		return usuario;
	}

	public File getFile() {
		return file;
	}

	public int getTVenta() {
		return tVenta;
	}
}