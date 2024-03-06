package mag;

import java.util.GregorianCalendar;
import java.util.Objects;

public class KucnaHemija extends Artikal {
	private GregorianCalendar datum;

	public GregorianCalendar getDatum() {
		return datum;
	}

	public void setDatum(GregorianCalendar datum) throws Exception {
		if(datum==null) {
			throw new Exception("Datum ne sme biti null");
		}
		this.datum = datum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(datum);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return Objects.equals(datum, other.datum);
	}

	
	@Override
	public String toString() {
		return "KucnaHemija [datum=" + datum + "]";
	}
	
}
