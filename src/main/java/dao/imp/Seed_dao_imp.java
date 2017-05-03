package dao.imp;

import dao.Seed_dao;
import entity.Seed;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * Created by mac on 03/05/2017.
 */
public class Seed_dao_imp implements Seed_dao {

    private SqlSessionTemplate sqlSessionTemplate;

    private static String getSeedByName = "Spider.getSeedByName";

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public Seed getSeed(Seed seed) {
        return this.sqlSessionTemplate.selectOne(getSeedByName, seed);
    }
}
