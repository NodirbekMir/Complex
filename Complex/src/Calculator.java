import java.util.logging.Logger;
public class Calculator {
    private static final Logger LOGGER=Logger.getLogger(Calculator.class.getName());

    public Complex add(Complex a, Complex b){
        LOGGER.info("Резултат");
        Complex result =a.add(b);
        LOGGER.info("result: "+result);
        return result;
    }
    public Complex multiply(Complex a, Complex b){
        LOGGER.info("Резултат");
        Complex result =a.multiply(b);
        LOGGER.info("result: "+result);
        return result;
    }
    public Complex divide(Complex a,Complex b){
        LOGGER.info("Резултат");
        Complex result =a.divide(b);
        LOGGER.info("result: "+result);
        return result;

    }
}
