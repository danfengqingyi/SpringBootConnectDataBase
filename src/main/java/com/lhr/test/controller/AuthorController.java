/**
 * 
 */
package com.lhr.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lhr.test.domain.Author;
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
 * time : Jun 18, 2020 6:20:55 PM
 */
@RestController
@RequestMapping("author")
public class AuthorController {
    
    @Autowired
    AuthorService mAuthorService;
    
    @RequestMapping("add")
    @ResponseBody
    public int add(@RequestBody Author author) {
        return mAuthorService.add(author);
        
    }
    @RequestMapping("insert")
    @ResponseBody
    public Long insert(@RequestBody Author author) {
        return mAuthorService.insert(author);
        
    }
    @RequestMapping("get")
    @ResponseBody
    public String get() {
        return "HelloWorld";
    }
    
    @RequestMapping("query/{nickName}")
    @ResponseBody
    public List<Author> query(@PathVariable String nickName) {
        return mAuthorService.queryByNickName(nickName);
    }

}
