package dao.imp;

import dao.Link_dao;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * Created by mac on 03/05/2017.
 */
public class Link_dao_imp implements Link_dao {

    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
}
