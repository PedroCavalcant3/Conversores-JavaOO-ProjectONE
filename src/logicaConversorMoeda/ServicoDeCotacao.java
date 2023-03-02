package logicaConversorMoeda;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

public class ServicoDeCotacao {
	
	static String webService = "https://economia.awesomeapi.com.br/json/";
    static int codigoSucesso = 200;
    
	 public static CotacaoDeMoedas buscaMoedaPela(String sigla) throws Exception {
	        String urlParaChamada = webService + sigla;

	        try {
	            URL url = new URL(urlParaChamada);
	            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

	            if (conexao.getResponseCode() != codigoSucesso)
	                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
	            InputStream is = conexao.getInputStream();

	            BufferedReader resposta = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	            String jsonEmString = Util.converteJsonEmString(resposta);
	            String singleString = jsonEmString.replaceAll("[\\[\\]]","");
	            
	            Gson gson = new Gson();
	            CotacaoDeMoedas cotacaodemoedas = gson.fromJson(singleString, CotacaoDeMoedas.class);
	            return cotacaodemoedas;
	        } catch (Exception e) {
	            throw new Exception("ERRO: " + e);
	        }
	    }
	

}
