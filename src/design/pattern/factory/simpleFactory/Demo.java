package design.pattern.factory.simpleFactory;

import design.pattern.factory.product.IPhone;
import design.pattern.factory.product.Phone;

public class Demo {
    public static void main(String[] arg) {
        PhoneFactory factory = new PhoneFactory();
        Phone miPhone = factory.makePhone("MiPhone");            // make xiaomi phone!
        IPhone iPhone = (IPhone)factory.makePhone("iPhone");    // make iphone!
    }
}
