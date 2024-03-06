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
	public void setId(int id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
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
