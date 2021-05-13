import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

//Camryn Langdon

public class CEModel {
    private static JsonElement jse;
    private static String ACCESS_TOKEN = "4700f76443a75a13d5d0325f";


    public String time;
    public String amount;
    public String USD, AED, AFN, ALL, AMD, ANG, AOA, ARS, AUD, AWG, AZN, BAM, BBD, BDT, BGN, BHD, BIF, BMD, BND, BOB,
    BRL, BSD, BTN, BWP, BYN, BZD, CAD, CDF, CHF, CLP, CNY, COP, CRC, CUC, CUP, CVE, CZK, DJF, DKK, DOP, DZD, ETB, EGP,
    ERN, EUR, FJD, FKP, FOK, GBP, GEL, GGP, GHS, GMD, GIP, GNF, GTQ, GYD, HKD, HNL, HRK, HTG, HUF, IDR, ILS, IMP, INR,
    IQD, IRR, ISK, JMD, JOD, JPY, KES, KGS, KHR, KID, KMF, KRW, KWD, KYD, KZT, LAK, LBP, LKR, LRD, LSL, LYD, MAD, MDL,
    MGA, MKD, MMK, MNT, MOP, MRU, MUR, MVR, MWK, MXN, MYR, MZN, NAD, NGN, NIO, NOK, NPR, NZD, OMR, PAB, PEN, PGK, PHP,
    PKR, PLN, PYG, QAR, RUB, RON, RSD, RWF, SAR, SBD, SCR, SDG, SEK, SGD, SHP, SLL, SOS, SRD, SSP, STN, SYP, SZL, THB,
    TJS, TMT, TND, TOP, TRY, TTD, TVD, TWD, TZS, UAH, UGX, UYU, UZS, VES, VND, VUV, WST, XAF, XCD, XDR, XOF, XPF, YER,
    ZMW, ZAR;




    public Boolean fetchCurrency()
    {


        try
        {

            //http://https://v6.exchangerate-api.com/v6/4700f76443a75a13d5d0325f/latest/USD
            //String encodedURL = URLEncoder.encode(zipcode, "utf-8");
            URL weather = new URL(" https://v6.exchangerate-api.com/v6/" + ACCESS_TOKEN + "/latest/USD");
            InputStream is = weather.openStream();// throws an IOException
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            jse = new JsonParser().parse(br);

            //fetch and calculate data
            this.time = dateConversion(String.valueOf(jse.getAsJsonObject().get("time_last_update_unix")));
            this.USD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("USD"));
            this.AED = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("AED"));
            this.AFN = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("AFN"));
            this.ALL = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("ALL"));
            this.AMD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("AMD"));
            this.ANG = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("ANG"));
            this.AOA = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("AOA"));
            this.ARS = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("ARS"));
            this.AUD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("AUD"));
            this.AWG = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("AWG"));
            this.AZN = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("AZN"));
            this.BAM = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BAM"));
            this.BBD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BBD"));
            this.BDT = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BDT"));
            this.BGN = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BGN"));
            this.BHD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BHD"));
            this.BIF = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BIF"));
            this.BMD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BMD"));
            this.BND = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BND"));
            this.BOB = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BOB"));
            this.BRL = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BRL"));
            this.BSD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BSD"));
            this.BTN = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BTN"));
            this.BWP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BWP"));
            this.BYN = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BYN"));
            this.BZD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("BZD"));
            this.CAD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("CAD"));
            this.CDF = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("CDF"));
            this.CHF = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("CHF"));
            this.CLP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("CLP"));
            this.CNY = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("CNY"));
            this.COP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("COP"));
            this.CRC = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("CRC"));
            this.CUC = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("CUC"));
            this.CUP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("CUP"));
            this.CVE = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("CVE"));
            this.CZK = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("CZK"));
            this.DJF = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("DJF"));
            this.DKK = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("DKK"));
            this.DOP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("DOP"));
            this.DZD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("DZD"));
            this.EGP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("EGP"));
            this.ERN = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("ERN"));
            this.ETB = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("ETB"));
            this.EUR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("EUR"));
            this.FJD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("FJD"));
            this.FKP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("FKP"));
            this.FOK = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("FOK"));
            this.GBP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("GBP"));
            this.GEL = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("GEL"));
            this.GGP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("GGP"));
            this.GHS = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("GHS"));
            this.GIP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("GIP"));
            this.GMD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("GMD"));
            this.GNF = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("GNF"));
            this.GTQ = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("GTQ"));
            this.GYD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("GYD"));
            this.HKD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("HKD"));
            this.HNL = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("HNL"));
            this.HRK = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("HRK"));
            this.HTG = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("HTG"));
            this.HUF = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("HUF"));
            this.IDR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("IDR"));
            this.ILS = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("ILS"));
            this.IMP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("IMP"));
            this.INR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("INR"));
            this.IQD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("IQD"));
            this.IRR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("IRR"));
            this.ISK = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("ISK"));
            this.JMD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("JMD"));
            this.JOD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("JOD"));
            this.JPY = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("JPY"));
            this.KES = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("KES"));
            this.KGS = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("KGS"));
            this.KHR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("KHR"));
            this.KID = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("KID"));
            this.KMF = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("KMF"));
            this.KRW = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("KRW"));
            this.KWD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("KWD"));
            this.KYD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("KYD"));
            this.KZT = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("KZT"));
            this.LAK = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("LAK"));
            this.LBP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("LBP"));
            this.LKR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("LKR"));
            this.LRD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("LRD"));
            this.LSL = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("LSL"));
            this.LYD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("LYD"));
            this.MAD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MAD"));
            this.MDL = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MDL"));
            this.MGA = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MGA"));
            this.MKD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MKD"));
            this.MMK = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MMK"));
            this.MNT = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MNT"));
            this.MOP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MOP"));
            this.MRU = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MRU"));
            this.MUR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MUR"));
            this.MVR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MVR"));
            this.MWK = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MWK"));
            this.MXN = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MXN"));
            this.MYR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MYR"));
            this.MZN = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("MZN"));
            this.NAD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("NAD"));
            this.NGN = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("NGN"));
            this.NIO = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("NIO"));
            this.NOK = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("NOK"));
            this.NPR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("NPR"));
            this.NZD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("NZD"));
            this.OMR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("OMR"));
            this.PAB = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("PAB"));
            this.PEN = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("PEN"));
            this.PGK = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("PGK"));
            this.PHP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("PHP"));
            this.PKR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("PKR"));
            this.PLN = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("PLN"));
            this.PYG = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("PYG"));
            this.QAR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("QAR"));
            this.RON = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("RON"));
            this.RSD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("RSD"));
            this.RUB = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("RUB"));
            this.RWF = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("RWF"));
            this.SAR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SAR"));
            this.SBD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SBD"));
            this.SCR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SCR"));
            this.SDG = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SDG"));
            this.SEK = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SEK"));
            this.SGD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SGD"));
            this.SHP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SHP"));
            this.SLL = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SLL"));
            this.SOS = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SOS"));
            this.SRD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SRD"));
            this.SSP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SSP"));
            this.STN = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("STN"));
            this.SYP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SYP"));
            this.SZL = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("SZL"));
            this.THB = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("THB"));
            this.TJS = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("TJS"));
            this.TMT = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("TMT"));
            this.TND = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("TND"));
            this.TOP = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("TOP"));
            this.TRY = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("TRY"));
            this.TTD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("TTD"));
            this.TVD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("TVD"));
            this.TWD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("TWD"));
            this.TZS = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("TZS"));
            this.UAH = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("UAH"));
            this.UGX = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("UGX"));
            this.UYU = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("UYU"));
            this.UZS = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("UZS"));
            this.VES = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("VES"));
            this.VND = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("VND"));
            this.VUV = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("VUV"));
            this.WST = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("WST"));
            this.XAF = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("XAF"));
            this.XCD = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("XCD"));
            this.XDR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("XDR"));
            this.XOF = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("XOF"));
            this.XPF = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("XPF"));
            this.YER = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("YER"));
            this.ZAR = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("ZAR"));
            this.ZMW = calculate(jse.getAsJsonObject().get("conversion_rates").getAsJsonObject().get("ZMW"));



            is.close();
            br.close();
        }
        catch (java.io.UnsupportedEncodingException uee)
        {
            return false;
        }
        catch (java.io.FileNotFoundException uee)
        {
            return false;
        }
        catch (java.net.MalformedURLException mue)
        {
            return false;
        }
        catch (IOException ioe)
        {
            return false;
        }
        catch (NumberFormatException ioe)
        {
            return false;
        }


    return true;

    }

    private String calculate(JsonElement jsonElement) {
        return String.format("%.2f",Double.valueOf(String.valueOf(jsonElement)) * Double.valueOf(this.amount));
    }

    public boolean isValid(String userAmount){
        //check if user input is a number before fetching API
        if (userAmount.matches("[0-9.]+")){
            //set amount from user input if valid
            this.amount = userAmount;
            if(fetchCurrency() == true){
                return true;
            }
            return false;
        }
            return false;
        }

    private static String dateConversion(String seconds){
        long unixSeconds = Long.valueOf(String.valueOf(seconds));
        Date date = new Date(unixSeconds*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(date);
        return String.valueOf(formattedDate);
    }



    public static void main(String[] args) {
        CEModel test = new CEModel();

        if (test.isValid("4.02.2")){
            test.fetchCurrency();
            System.out.println("Time since last update UTC: " + test.time);
            System.out.println("USD: " + test.USD);
            System.out.println("CAD: " + test.CAD);
            System.out.println("THB: " + test.THB);
            System.out.println("MRU: " + test.MRU);
            System.out.println("QAR: " + test.QAR);
            System.out.println("WST: " + test.WST);
            System.out.println("ZAR: " + test.ZAR);
        } else {
            System.out.println("Enter a valid amount!");
        }


    }

}
