import java.io.IOException;

public class ExchangeRates  {
    public Double conversionMoney(String isoCode, Double moneyAmount) throws  IOException, InterruptedException {
        APICall apiCall = new APICall();

            switch (isoCode) {
                case "USDCOP" -> {
                    var exchangeMoney = apiCall.APICallMoney("USD").conversion_rates();
                    Double copRate = exchangeMoney.get("COP");
                    return copRate * moneyAmount;
                } case "COPUSD" -> {
                    var exchangeMoney = apiCall.APICallMoney("COP").conversion_rates();
                    Double usdRate = exchangeMoney.get("USD");
                    return usdRate * moneyAmount;
                } case "BRLUSD" -> {
                    var exchangeMoney = apiCall.APICallMoney("BRL").conversion_rates();
                    Double brlRate = exchangeMoney.get("USD");
                    return brlRate * moneyAmount;
                } case "USDBRL" -> {
                    var exchangeMoney = apiCall.APICallMoney("USD").conversion_rates();
                    Double brlRate = exchangeMoney.get("BRL");
                    return brlRate * moneyAmount;
                } case "USDARS" -> {
                    var exchangeMoney = apiCall.APICallMoney("USD").conversion_rates();
                    Double brlRate = exchangeMoney.get("ARS");
                    return brlRate * moneyAmount;
                } case "ARSUSD" -> {
                    var exchangeMoney = apiCall.APICallMoney("ARS").conversion_rates();
                    Double brlRate = exchangeMoney.get("USD");
                    return brlRate * moneyAmount;
                }
            }
        return moneyAmount;
    }
}
