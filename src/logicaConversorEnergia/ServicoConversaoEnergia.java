package logicaConversorEnergia;

import javax.swing.JOptionPane;

public class ServicoConversaoEnergia {
	
	  public void WattHoraToJoule(double energia){
	        double whattHora = (energia * 3600.0);
	        whattHora = formatar(whattHora);
	        JOptionPane.showMessageDialog(null, energia +" WattHora convertidos retornam " + whattHora + " Joule ");
	    }
	    public void WattHoraToKilojoule(double energia){
	        double whattHora = energia * 3.6;
	        whattHora = formatar(whattHora);
	        JOptionPane.showMessageDialog(null, energia +" WattHora convertidos retornam " + whattHora + " Kilojoule ");
	    }
	    public void WattHoraToMegajoule(double energia){
	        double whattHora = energia * 0.0036;
	        whattHora = formatar(whattHora);
	        JOptionPane.showMessageDialog(null, energia +" WattHora convertidos retornam " + whattHora + " MegaJaule ");
	    }
	    public void WattHoraToCaloria(double energia){
	        double whattHora = energia * 0.8604206500956;
	        whattHora = formatar(whattHora);
	        JOptionPane.showMessageDialog(null, energia +" WattHora convertidos retornam " + whattHora + " Caloria ");
	    }
	    public void WattHoraToMetroNewton(double energia){
	        double whattHora = energia * 3600.0; 
	        whattHora = formatar(whattHora);
	        JOptionPane.showMessageDialog(null, energia +" WattHora convertidos retornam " + whattHora + " MetroNewton ");
	    }
	    public void WattHoraToLibradoPé(double energia){
	        double whattHora = energia * 2655.2197194318;
	        whattHora = formatar(whattHora);
	        JOptionPane.showMessageDialog(null, energia +" WattHora convertidos retornam " + whattHora + " LibraDoPé ");
	    }
	    public void WattHoraToQuilowattHora(double energia){
	    	double whattHora = energia * 0.001;
	    	whattHora = formatar(whattHora);
	    	JOptionPane.showMessageDialog(null, energia +" WattHora convertidos retornam " + whattHora + " QuiloWattHora ");
	    }
	    public void WattHoraToMegawattHora(double energia){
	    	double whattHora = energia * 0.0000010;
	    	whattHora = formatar(whattHora);
	    	JOptionPane.showMessageDialog(null, energia +" WattHora convertidos retornam " + whattHora + " MegaWattHora ");
	    }
	    public void WattHoraToMegaElétronVolt(double energia){
	    	double whattHora = energia * 2.25e+19;
	    	whattHora = formatar(whattHora);
	    	JOptionPane.showMessageDialog(null, energia +" WattHora convertidos retornam " + whattHora + " MegaElétronVolt ");
	    }
	    
	    public double formatar(double tipo) {
	    	return tipo = (double) Math.round(tipo * 100d) / 100;
	    }

}
