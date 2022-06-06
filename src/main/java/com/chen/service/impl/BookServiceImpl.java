package com.chen.service.impl;

import com.chen.controller.Code;
import com.chen.dao.BookDao;
import com.chen.domain.Book;
import com.chen.exception.BusinessException;
import com.chen.exception.SystemException;
import com.chen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        return bookDao.save(book) >0;
    }

    public boolean update(Book book) {
        return bookDao.update(book) >0;
    }

    public boolean delete(Integer id) {
        return bookDao.delete(id) >0;
    }

    public Book getById(Integer id) {
        if (id==1){
            throw new BusinessException(Code.BUSINESS_ERR, "业务异常！");
        }

//        try {
//            int i=1/0;
//        }catch (Exception e){
//            throw new SystemException(Code.SYSTEM_TIME_ERR, "请求超时！");
//        }
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
