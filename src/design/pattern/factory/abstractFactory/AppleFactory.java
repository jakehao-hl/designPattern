package design.pattern.factory.abstractFactory;

import design.pattern.factory.product.IPhone;
import design.pattern.factory.product.MAC;
import design.pattern.factory.product.PC;
import design.pattern.factory.product.Phone;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }
    @Override
    public PC makePC() {
        return new MAC();
    }
}
