package injection.metier;

import injection.dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData() * 2;
    }
}