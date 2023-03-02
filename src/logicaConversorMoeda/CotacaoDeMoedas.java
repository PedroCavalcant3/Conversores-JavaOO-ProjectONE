package logicaConversorMoeda;

public class CotacaoDeMoedas {

	private String name;
	private double bid;

	public String getName() {
		return name;
	}

	public double getBid() {
		return bid;
	}

	@Override
	public String toString() {
		return "CotacaoDeMoedas{" + "name=" + name + ", bid=" + bid + '}';
	}

}
