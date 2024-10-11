import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APICall  {
     public ExchangeMoney APICallMoney(String isoMoney) throws IOException, InterruptedException {
         String isoMoneyApi = "";
         switch (isoMoney) {
             case "COP" -> {
                 isoMoneyApi = "https://v6.exchangerate-api.com/v6/e6771d4a31ef9b810fdf3b3a/latest/COP";
             } case "USD" -> {
                 isoMoneyApi = "https://v6.exchangerate-api.com/v6/e6771d4a31ef9b810fdf3b3a/latest/USD";
             } case "BRL" -> {
                 isoMoneyApi = "https://v6.exchangerate-api.com/v6/e6771d4a31ef9b810fdf3b3a/latest/BRL";
             } case "ARS" -> {
                 isoMoneyApi = "https://v6.exchangerate-api.com/v6/e6771d4a31ef9b810fdf3b3a/latest/ARS";
             }
         }
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(isoMoneyApi))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        return new Gson().fromJson(response.body(), ExchangeMoney.class);
    }
}
