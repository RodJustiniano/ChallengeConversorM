import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTipoMoneda {
    public Moneda buscarValorMoneda(String monedaLocal, String monedaDestino, Double cantidad) {
        String apiKey = "ace866f581ab488906eea1d2";


        URI enlace = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + monedaLocal + "/" + monedaDestino+"/"+cantidad);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(enlace)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

           System.out.println(response.body());
            return new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            System.out.println("Ocurrio un error");
        }
        return null;
    }

}
