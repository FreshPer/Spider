package dao.imp;

import dao.Seed_dao;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * Created by mac on 03/05/2017.
 */
public class Seed_dao_imp implements Seed_dao {

    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
}
