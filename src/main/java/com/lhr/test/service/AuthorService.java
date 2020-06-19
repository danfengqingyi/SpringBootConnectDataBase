/**
 * 
 */
package com.lhr.test.service;

import java.util.List;

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
 * time : Jun 18, 2020 6:28:42 PM
 */
public interface AuthorService {
    Long insert(Author author);
    
    int add(Author author);

    int update(Author author);

    int delete(Long id);

    Author findAuthor(Long id);

    List<Author> findAuthorList();
    
    List<Author> queryByNickName(String nickName);

}
