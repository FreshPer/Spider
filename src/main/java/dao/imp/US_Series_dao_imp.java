package dao.imp;

import dao.US_Series_dao;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * Created by mac on 03/05/2017.
 */
public class US_Series_dao_imp implements US_Series_dao{

    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
}
