package design.pattern.factory.factoryMethod;

import design.pattern.factory.product.IPhone;
import design.pattern.factory.product.Phone;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return (Phone) new IPhone();
    }
}
