package lv.homework10;

import javax.xml.bind.ValidationException;

public class UserValidationService {


    public UserValidationService(String name, String lastName, Integer age) throws ValidationException {

        if (age <=0 || age>=120) {
            throw new ValidationException("Age can be from 0 till 120");
        }

        if (name.length() < 3 || name.length() > 15 || lastName.length() < 3 || lastName.length() >15) {
            throw new ValidationException("Name and Last name can contain from 3 to 15 symbols");
        }

    }


}
