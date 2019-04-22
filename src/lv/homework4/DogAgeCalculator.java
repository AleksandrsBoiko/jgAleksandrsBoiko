package lv.homework4;

//ievēŗo koda formatēšanas principus, lai kods ir vieglāk lasāms- ctrl + alt + z
public class DogAgeCalculator {

    public int humanAgeToDogAge(int humanAge) {

        if (humanAge > 15 && humanAge < 25)
        { return 2;} else
            if (humanAge > 24) {

                return (humanAge-24)/4+2;
            }
        return 1;
    }

    public int dogAgeToHumanAge(int dogAge) {
        if (dogAge > 2) {

            return (dogAge-2)*4+24;

        } else if (dogAge == 2) {

            return 24;
        }

        return 15;
    }
}
