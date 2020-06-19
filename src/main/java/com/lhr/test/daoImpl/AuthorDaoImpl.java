/**
 * 
 */
package com.lhr.test.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lhr.test.dao.AuthorDao;
import com.lhr.test.domain.Author;

/**********************************************************************************************************************
 * @功能说明：TODO
 * @典型用法： 
 * @特殊用法：
 * @创建者：  luhaoran
 * @创建时间：2020-06-18
 *
 * @修改人：
 * @修改时间：
 * @修改原因：
 * @修改内容：
 * ......
 **********************************************************************************************************************/
/**
 * 
 * @author lhr
 * time : Jun 18, 2020 6:10:49 PM
 */
@Repository
public class AuthorDaoImpl implements AuthorDao {
    
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public int add(Author author) {
        /**@功能说明：
         * @入参说明： 
         * @返回说明：
         * @异常说明：
         *
         * @修改时间：
         * @修改说明：
         * ......
         */
        String sql = "insert into test(id,real_name,nick_name) " +
                "values(:id,:realName,:nickName)";
        
        Map<String, Object> param = new HashMap<>();
        param.put("id",author.getId());
        param.put("realName", author.getRealName());
        param.put("nickName", author.getNickName());
        
        return (int) jdbcTemplate.update(sql, param);
    }

    @Override
    public int update(Author author) {
        /**@功能说明：
         * @入参说明： 
         * @返回说明：
         * @异常说明：
         *
         * @修改时间：
         * @修改说明：
         * ......
         */
        return 0;
    }

    @Override
    public int delete(Long id) {
        /**@功能说明：
         * @入参说明： 
         * @返回说明：
         * @异常说明：
         *
         * @修改时间：
         * @修改说明：
         * ......
         */
        return 0;
    }

    @Override
    public Author findAuthor(Long id) {
        /**@功能说明：
         * @入参说明： 
         * @返回说明：
         * @异常说明：
         *
         * @修改时间：
         * @修改说明：
         * ......
         */
        return null;
    }

    @Override
    public List<Author> findAuthorList() {
        /**@功能说明：
         * @入参说明： 
         * @返回说明：
         * @异常说明：
         *
         * @修改时间：
         * @修改说明：
         * ......
         */
        return null;
    }

}
