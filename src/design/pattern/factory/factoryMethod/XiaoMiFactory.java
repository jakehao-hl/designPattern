package design.pattern.factory.factoryMethod;

import design.pattern.factory.product.MiPhone;
import design.pattern.factory.product.Phone;

public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return (Phone) new MiPhone();
    }
}
