package design.pattern.factory.simpleFactory;

import design.pattern.factory.product.IPhone;
import design.pattern.factory.product.MiPhone;
import design.pattern.factory.product.Phone;

public class PhoneFactory {
    public Phone makePhone(String phoneType) {
        if(phoneType.equalsIgnoreCase("MiPhone")){
            return new MiPhone();
        }
        else if(phoneType.equalsIgnoreCase("iPhone")) {
            return new IPhone();
        }
        return null;
    }
}
