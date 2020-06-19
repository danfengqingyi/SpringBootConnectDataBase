/**
 * 
 */
package com.lhr.test.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhr.test.dao.AuthorDao;
import com.lhr.test.dao.AuthorRepository;
import com.lhr.test.domain.Author;
import com.lhr.test.mapper.AuthorMapper;
import com.lhr.test.service.AuthorService;

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
 * time : Jun 18, 2020 6:29:01 PM
 */
@Service
public class AuthorServiceImpl implements AuthorService {
    
    @Autowired
    AuthorDao mAuthorDao;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private AuthorMapper mAuthorMapper;


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
        return mAuthorDao.add(author);
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
        return mAuthorDao.update(author);
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
        return mAuthorDao.delete(id);
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
        return mAuthorDao.findAuthor(id);
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
        return mAuthorDao.findAuthorList();
    }

    @Override
    public List<Author> queryByNickName(String nickName) {
        /**@功能说明：
         * @入参说明： 
         * @返回说明：
         * @异常说明：
         *
         * @修改时间：
         * @修改说明：
         * ......
         */
        return authorRepository.queryByNickName(nickName);
    }

    @Override
    public Long insert(Author author) {
        /**@功能说明：
         * @入参说明： 
         * @返回说明：
         * @异常说明：
         *
         * @修改时间：
         * @修改说明：
         * ......
         */
       return mAuthorMapper.insertAuthor(author);
    }

}
