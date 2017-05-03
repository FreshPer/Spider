package service.imp;

import dao.Seed_dao;
import entity.Seed;
import service.Seed_ser;

/**
 * Created by mac on 03/05/2017.
 */
public class Seed_ser_imp  implements Seed_ser{

    private Seed_dao seed_dao;

    public Seed getSeed(Seed seed) {
        return seed_dao.getSeed(seed);
    }
}
