package doa;

import org.springframework.stereotype.Component;

@Component("dao")
public class DoaImpl implements IDao {

    public double getData() {
        System.out.println("Version base de données");
        double temp=Math.random()*40;
        return temp;
    }
}
