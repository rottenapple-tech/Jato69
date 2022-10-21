package eccezioni;

public class Gatto {
<<<<<<< HEAD
	String eta;
	String etaUmana;
	public Gatto(String eta, String etaUmana) {
		super();
		this.eta = eta;
		this.etaUmana = etaUmana;
	}
=======

	String eta;
	String etaUmana;

	public Gatto(String eta, String etaUmana) {
		this.eta = eta;
		this.etaUmana = etaUmana;
	}

>>>>>>> fc39a57a445dc9984a0880455b8118a1c4221333
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gatto [eta=");
		builder.append(eta);
		builder.append(", etaUmana=");
		builder.append(etaUmana);
		builder.append("]");
		return builder.toString();
	}
<<<<<<< HEAD
=======

	
	
>>>>>>> fc39a57a445dc9984a0880455b8118a1c4221333
	
	
}
