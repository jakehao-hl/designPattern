package design.pattern.factory.abstractFactory;

import design.pattern.factory.product.PC;
import design.pattern.factory.product.Phone;

public interface AbstractFactory {
    Phone makePhone();
    PC makePC();
}
