package lv.homework4;

public class LightColorDetector {

    public String detect(int wavelength) {

        if ((wavelength >= 380) && (wavelength < 450)) {
            return "Violētā"
        }
        if ((wavelength >= 450) && (wavelength < 495)) {
            return "Zilā"
        }
        if ((wavelength >= 495) && (wavelength < 570)) {
            return "Zaļā"
        }
        if ((wavelength >= 570) && (wavelength < 590)) {
            return "Dzeltenā"
        }
        if ((wavelength >= 590) && (wavelength < 620)) {
            return "Oranža"
        }
        if ((wavelength >= 620) && (wavelength < 750)) {
            return "Sarkanā"
        }

        return "ārpus diapazona"


    }
}
