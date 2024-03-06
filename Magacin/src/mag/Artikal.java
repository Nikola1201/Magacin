package mag;

import java.util.Objects;

public class Artikal {
	private int id;
	private String naziv;
	private String opis;
	private int kolicina;
	
	public int getId() {
		return id;
	}
	public void setId(int id) throws Exception {
		if(id<=0) {
			throw new Exception("Id ne sme biti 0 ili manji od 0");
		}
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) throws Exception {
		if(naziv==null || naziv.isEmpty()) {
			throw new Exception("Naziv ne sme biti null ili prazan string");
		}
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) throws Exception {
		if(opis==null || opis.isEmpty()) {
			throw new Exception("Opis ne sme biti null ili prazan string");
		}
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) throws Exception {
		if(kolicina<0) {
			throw new Exception("Kolicina ne sme biti manja od 0");
		}
		this.kolicina = kolicina;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, kolicina, naziv, opis);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return id == other.id && kolicina == other.kolicina && Objects.equals(naziv, other.naziv)
				&& Objects.equals(opis, other.opis);
	}
	@Override
	public String toString() {
		return "Artikal [id=" + id + ", naziv=" + naziv + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}
	
	
	
}
