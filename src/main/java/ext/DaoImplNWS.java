package ext;

import doa.IDao;

public class DaoImplNWS  implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web services");
        return 90;
    }
}
