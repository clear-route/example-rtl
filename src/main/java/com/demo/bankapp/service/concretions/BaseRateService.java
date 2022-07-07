package com.demo.bankapp.service.concretions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class BaseRateService {

    // static JSONObject getRates(String filePath)
    // {

    // JSONParser jsonParser = new JSONParser();

    // try (FileReader reader = new FileReader(filePath))
    // {
    // //Read JSON file
    // Object obj = jsonParser.parse(reader);

    // JSONObject rateList = (JSONObject) obj;
    // return rateList;

    // } catch (FileNotFoundException e) {
    // e.printStackTrace();
    // } catch (IOException e) {
    // e.printStackTrace();
    // } catch (ParseException e) {
    // e.printStackTrace();
    // }
    // throw new RuntimeException("Unable to get rates");

    // }

    static JSONObject getRates() 
    {

        JSONParser parser = new JSONParser(); JSONObject json;
        try {
            json = (JSONObject) parser.parse(getRatesFeed());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("Could not parse string");
        }
        return  json;
            
    }

    private static String getRatesFeed() {
        String str = ""
                + "{"
                + "    \"success\": true,"
                + "    \"timestamp\": 1657114596,"
                + "    \"base\": \"TRY\","
                + "    \"date\": \"2022-07-06\","
                + "    \"rates\": {"
                + "        \"AED\": 0.213108,"
                + "        \"AFN\": 5.091323,"
                + "        \"ALL\": 6.731703,"
                + "        \"AMD\": 23.683434,"
                + "        \"ANG\": 0.104587,"
                + "        \"AOA\": 24.805781,"
                + "        \"ARS\": 7.31872,"
                + "        \"AUD\": 0.085029,"
                + "        \"AWG\": 0.10429,"
                + "        \"AZN\": 0.098784,"
                + "        \"BAM\": 0.111322,"
                + "        \"BBD\": 0.117172,"
                + "        \"BDT\": 5.422979,"
                + "        \"BGN\": 0.111305,"
                + "        \"BHD\": 0.021877,"
                + "        \"BIF\": 119.447738,"
                + "        \"BMD\": 0.058019,"
                + "        \"BND\": 0.081518,"
                + "        \"BOB\": 0.398962,"
                + "        \"BRL\": 0.313883,"
                + "        \"BSD\": 0.058034,"
                + "        \"BTC\": 2.887249e-06,"
                + "        \"BTN\": 4.603507,"
                + "        \"BWP\": 0.730868,"
                + "        \"BYN\": 0.147953,"
                + "        \"BYR\": 1137.181354,"
                + "        \"BZD\": 0.116972,"
                + "        \"CAD\": 0.075536,"
                + "        \"CDF\": 116.184,"
                + "        \"CHF\": 0.056309,"
                + "        \"CLF\": 0.002012,"
                + "        \"CLP\": 55.571094,"
                + "        \"CNY\": 0.389108,"
                + "        \"COP\": 249.367625,"
                + "        \"CRC\": 39.873969,"
                + "        \"CUC\": 0.058019,"
                + "        \"CUP\": 1.537516,"
                + "        \"CVE\": 6.276073,"
                + "        \"CZK\": 1.409815,"
                + "        \"DJF\": 10.331203,"
                + "        \"DKK\": 0.423332,"
                + "        \"DOP\": 3.177794,"
                + "        \"DZD\": 8.522627,"
                + "        \"EGP\": 1.096446,"
                + "        \"ERN\": 0.870292,"
                + "        \"ETB\": 3.027348,"
                + "        \"EUR\": 0.056898,"
                + "        \"FJD\": 0.128481,"
                + "        \"FKP\": 0.04764,"
                + "        \"GBP\": 0.04871,"
                + "        \"GEL\": 0.170591,"
                + "        \"GGP\": 0.04764,"
                + "        \"GHS\": 0.466569,"
                + "        \"GIP\": 0.04764,"
                + "        \"GMD\": 3.138277,"
                + "        \"GNF\": 504.026778,"
                + "        \"GTQ\": 0.449886,"
                + "        \"GYD\": 12.144613,"
                + "        \"HKD\": 0.455287,"
                + "        \"HNL\": 1.426652,"
                + "        \"HRK\": 0.427969,"
                + "        \"HTG\": 6.717929,"
                + "        \"HUF\": 23.541687,"
                + "        \"IDR\": 870.692187,"
                + "        \"ILS\": 0.203947,"
                + "        \"IMP\": 0.04764,"
                + "        \"INR\": 4.586673,"
                + "        \"IQD\": 84.695828,"
                + "        \"IRR\": 2457.124008,"
                + "        \"ISK\": 7.868597,"
                + "        \"JEP\": 0.04764,"
                + "        \"JMD\": 8.726113,"
                + "        \"JOD\": 0.041134,"
                + "        \"JPY\": 7.836137,"
                + "        \"KES\": 6.849189,"
                + "        \"KGS\": 4.612736,"
                + "        \"KHR\": 236.477596,"
                + "        \"KMF\": 26.957293,"
                + "        \"KPW\": 52.217502,"
                + "        \"KRW\": 75.626015,"
                + "        \"KWD\": 0.017835,"
                + "        \"KYD\": 0.048358,"
                + "        \"KZT\": 27.034386,"
                + "        \"LAK\": 871.655041,"
                + "        \"LBP\": 87.74493,"
                + "        \"LKR\": 20.716398,"
                + "        \"LRD\": 8.848233,"
                + "        \"LSL\": 0.919028,"
                + "        \"LTL\": 0.171316,"
                + "        \"LVL\": 0.035095,"
                + "        \"LYD\": 0.280674,"
                + "        \"MAD\": 0.58991,"
                + "        \"MDL\": 1.108417,"
                + "        \"MGA\": 237.346166,"
                + "        \"MKD\": 3.49511,"
                + "        \"MMK\": 107.444105,"
                + "        \"MNT\": 181.257866,"
                + "        \"MOP\": 0.469039,"
                + "        \"MRO\": 20.712936,"
                + "        \"MUR\": 2.645866,"
                + "        \"MVR\": 0.890608,"
                + "        \"MWK\": 59.36557,"
                + "        \"MXN\": 1.196554,"
                + "        \"MYR\": 0.256707,"
                + "        \"MZN\": 3.703389,"
                + "        \"NAD\": 0.919004,"
                + "        \"NGN\": 24.687389,"
                + "        \"NIO\": 2.080698,"
                + "        \"NOK\": 0.584565,"
                + "        \"NPR\": 7.365599,"
                + "        \"NZD\": 0.093768,"
                + "        \"OMR\": 0.022307,"
                + "        \"PAB\": 0.058028,"
                + "        \"PEN\": 0.224035,"
                + "        \"PGK\": 0.207108,"
                + "        \"PHP\": 3.236064,"
                + "        \"PKR\": 12.055906,"
                + "        \"PLN\": 0.272216,"
                + "        \"PYG\": 397.914379,"
                + "        \"QAR\": 0.211247,"
                + "        \"RON\": 0.281354,"
                + "        \"RSD\": 6.679491,"
                + "        \"RUB\": 3.697284,"
                + "        \"RWF\": 59.364431,"
                + "        \"SAR\": 0.217781,"
                + "        \"SBD\": 0.473437,"
                + "        \"SCR\": 0.753265,"
                + "        \"SDG\": 26.485968,"
                + "        \"SEK\": 0.610891,"
                + "        \"SGD\": 0.081433,"
                + "        \"SHP\": 0.079916,"
                + "        \"SLL\": 764.11623,"
                + "        \"SOS\": 33.912173,"
                + "        \"SRD\": 1.294791,"
                + "        \"STD\": 1200.885615,"
                + "        \"SVC\": 0.507766,"
                + "        \"SYP\": 145.775647,"
                + "        \"SZL\": 0.97158,"
                + "        \"THB\": 2.092471,"
                + "        \"TJS\": 0.604971,"
                + "        \"TMT\": 0.203648,"
                + "        \"TND\": 0.177743,"
                + "        \"TOP\": 0.136798,"
                + "        \"TRY\": 17.51625,"
                + "        \"TTD\": 0.393702,"
                + "        \"TWD\": 1.727489,"
                + "        \"TZS\": 135.327888,"
                + "        \"UAH\": 1.714447,"
                + "        \"UGX\": 218.195505,"
                + "        \"USD\": 0.058019,"
                + "        \"UYU\": 2.319185,"
                + "        \"UZS\": 631.832369,"
                + "        \"VEF\": 12406313351.765268,"
                + "        \"VND\": 1356.378862,"
                + "        \"VUV\": 6.742489,"
                + "        \"WST\": 0.153445,"
                + "        \"XAF\": 37.335821,"
                + "        \"XAG\": 0.003025,"
                + "        \"XAU\": 3.2873797e-05,"
                + "        \"XCD\": 0.156801,"
                + "        \"XDR\": 0.043855,"
                + "        \"XOF\": 37.335821,"
                + "        \"XPF\": 6.564886,"
                + "        \"YER\": 14.519371,"
                + "        \"ZAR\": 0.969695,"
                + "        \"ZMK\": 522.244799,"
                + "        \"ZMW\": 0.945905,"
                + "        \"ZWL\": 18.682241"
                + "    }"
                + "}"
                + "";
        return str;

    }
}
