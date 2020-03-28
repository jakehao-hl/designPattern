package design.pattern.factory.abstractFactory;

import design.pattern.factory.product.MiPC;
import design.pattern.factory.product.MiPhone;
import design.pattern.factory.product.PC;
import design.pattern.factory.product.Phone;

public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
    @Override
    public PC makePC() {
        return new MiPC();
    }
}
