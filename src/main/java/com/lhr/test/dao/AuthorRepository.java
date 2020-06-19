/*
 * Copyright 2010 sdp.com, Inc. All rights reserved.
 * sdp.com PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * creator : lhr
 * create time : 2019年6月27日 上午12:02:00
 */
package com.lhr.test.dao;

import com.lhr.test.domain.Author;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**********************************************************************************************************************
 * @功能说明：TODO
 * @典型用法： 
 * @特殊用法：
 * @创建者：  luhaoran
 * @创建时间：2019-06-27
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
 * time : 2019年6月27日 上午12:02:00
 */

public interface AuthorRepository extends CommonRepository<Author>{
    public Optional<Author> findById(Long userId);

    @Query("select au from com.lhr.test.domain.Author au where nick_name=:nickName")
    public List<Author> queryByNickName(@Param("nickName") String nickName);

}
