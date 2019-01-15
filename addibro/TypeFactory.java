package addibro;

/**
 * FactoryMethod
 */
public interface TypeFactory {
    Type createType();
}

class BitchTypeFactory implements TypeFactory {
    @Override
    public Type createType() {
        return new BitchType();
    }
}

class BlyatTypeFactory implements TypeFactory {
    @Override
    public Type createType() {
        return new BlyatType();
    }
}