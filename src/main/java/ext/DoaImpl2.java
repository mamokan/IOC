package ext;

import doa.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DoaImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("version Capteurs");
        double temp= 6000;
        return temp;
    }
}
