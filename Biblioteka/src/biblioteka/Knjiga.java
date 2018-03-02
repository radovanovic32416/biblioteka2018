package biblioteka;

import java.util.Arrays;

public class Knjiga {
	private String naslov;
	private String isbn;
	private String izdavac;
	private int izdanje;
	private Autor[] autori;

	public Autor[] getAutori() {
		return autori;
	}

	public void setAutori(Autor[] autori) {
		this.autori = autori;
	}

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public int getIzdanje() {
		return izdanje;
	}

	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}

	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", izdavac=" + izdavac + ", izdanje=" + izdanje
				+ ", autori=" + Arrays.toString(autori) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}

}
