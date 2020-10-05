package Pr_10.task1;


public class ConcreteFactory implements ComplexAbstractFactory {

    @Override
    public Complex createComplex() {
        return new Complex();
    }


    @Override
    public Complex CreateComplex(int real, int image) {
        Complex result = new Complex();
        result.real = real;
        result.image = image;
        
        return result;
    }
}
