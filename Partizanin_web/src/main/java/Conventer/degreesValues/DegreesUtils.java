package Conventer.degreesValues;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 28.08.2014
 * Time:  13:29
 * To change this template use File|Setting|File Templates.
 */
public class DegreesUtils {

    private String Celsiy = "";
    private String Celvin = "";
    private String Reomur = "";
    private String Rankin = "";
    private String Farengeit = "";

    public String getCelsiy() {
        return Celsiy;
    }

    public String getCelvin() {
        return Celvin;
    }

    public String getReomur() {
        return Reomur;
    }

    public String getRankin() {
        return Rankin;
    }

    public String getFarengeit() {
        return Farengeit;
    }

    public void Celsiy(String celsiyValue) {

        double celsiy = Double.valueOf(celsiyValue);
        double celvin = celsiy + 273.15;
        double rankin = (celvin * 9) / 5;
        double reomur = (celsiy * 4) / 5;
        double farengeit = ((celsiy * 5) / 9) + 32;


        celsiy = new BigDecimal(celsiy).setScale(3, RoundingMode.UP).doubleValue();
        celvin = new BigDecimal(celvin).setScale(3, RoundingMode.UP).doubleValue();
        farengeit = new BigDecimal(farengeit).setScale(3, RoundingMode.UP).doubleValue();
        rankin = new BigDecimal(rankin).setScale(3, RoundingMode.UP).doubleValue();
        reomur = new BigDecimal(reomur).setScale(3, RoundingMode.UP).doubleValue();


        Celsiy = String.valueOf(celsiy);
        Celvin = String.valueOf(celvin);
        Rankin = String.valueOf(rankin);
        Reomur = String.valueOf(reomur);
        Farengeit = String.valueOf(farengeit);

    }

    public void Celvin(String celvinValue) {

        double celvin = Double.valueOf(celvinValue);
        double celsiy = celvin - 273.15;
        double rankin = (celvin * 9) / 5;
        double reomur = (celsiy * 4) / 5;
        double farengeit = ((celsiy * 5) / 9) + 32;

        celsiy = new BigDecimal(celsiy).setScale(3, RoundingMode.UP).doubleValue();
        celvin = new BigDecimal(celvin).setScale(3, RoundingMode.UP).doubleValue();
        farengeit = new BigDecimal(farengeit).setScale(3, RoundingMode.UP).doubleValue();
        rankin = new BigDecimal(rankin).setScale(3, RoundingMode.UP).doubleValue();
        reomur = new BigDecimal(reomur).setScale(3, RoundingMode.UP).doubleValue();


        Celsiy = String.valueOf(celsiy);
        Celvin = String.valueOf(celvin);
        Rankin = String.valueOf(rankin);
        Reomur = String.valueOf(reomur);
        Farengeit = String.valueOf(farengeit);

    }

    public void Farengeit(String farengeitValue) {

        double farengeit = Double.valueOf(farengeitValue);
        double celsiy = ((farengeit - 32.0) * 5) / 9;
        double celvin = celsiy + 273.15;
        double rankin = (celvin * 9) / 5;
        double reomur = (celsiy * 4) / 5;

        Celsiy = String.valueOf(celsiy);
        Celvin = String.valueOf(celvin);
        Rankin = String.valueOf(rankin);
        Reomur = String.valueOf(reomur);
        Farengeit = String.valueOf(farengeit);

    }

    public void Reomur(String reomurValue) {

        double reomur = Double.valueOf(reomurValue);
        double celsiy = (reomur * 5) / 4;
        double celvin = celsiy + 273.15;
        double rankin = (celvin * 9) / 5;
        double farengeit = ((celsiy * 5) / 9) + 32;

        Celsiy = String.valueOf(celsiy);
        Celvin = String.valueOf(celvin);
        Rankin = String.valueOf(rankin);
        Reomur = String.valueOf(reomur);
        Farengeit = String.valueOf(farengeit);

    }

    public void Rankin(String rankinValue) {

        double rankin = Double.valueOf(rankinValue);
        double celsiy = ((rankin - 491.67) * 5) / 9;
        double celvin = celsiy + 273.15;
        double reomur = (celsiy * 4) / 5;
        double farengeit = ((celsiy * 5) / 9) + 32;

        celsiy = new BigDecimal(celsiy).setScale(2, RoundingMode.UNNECESSARY).doubleValue();
        celvin = new BigDecimal(celvin).setScale(2, RoundingMode.UNNECESSARY).doubleValue();
        farengeit = new BigDecimal(farengeit).setScale(2, RoundingMode.UNNECESSARY).doubleValue();
        rankin = new BigDecimal(rankin).setScale(2, RoundingMode.UNNECESSARY).doubleValue();
        reomur = new BigDecimal(reomur).setScale(2, RoundingMode.UNNECESSARY).doubleValue();

        Celsiy = String.valueOf(celsiy);
        Celvin = String.valueOf(celvin);
        Rankin = String.valueOf(rankin);
        Reomur = String.valueOf(reomur);
        Farengeit = String.valueOf(farengeit);

    }
}
