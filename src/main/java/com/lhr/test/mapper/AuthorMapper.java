/**
 * 
 */
package com.lhr.test.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.lhr.test.domain.Author;

/**********************************************************************************************************************
 * @功能说明：TODO
 * @典型用法： 
 * @特殊用法：
 * @创建者：  luhaoran
 * @创建时间：2020-06-19
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
 * time : Jun 19, 2020 12:15:40 AM
 */
@Mapper
public interface AuthorMapper{

    @Insert("insert into test(id,real_name,nick_name)values(#{id},#{realName},#{nickName})")
    public Long insertAuthor(Author author);
}
