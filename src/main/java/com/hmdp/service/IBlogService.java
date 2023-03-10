package com.hmdp.service;

import com.hmdp.model.dto.Result;
import com.hmdp.model.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author codejuzi
 * 
 */
public interface IBlogService extends IService<Blog> {

    Result queryHotBlog(Integer current);

    Result queryBlogById(String id);

    Result likeBlog(Long id);

    Result queryBlogLikes(String id);

    Result saveBlog(Blog blog);

    Result queryBlogOfFollow(Long max, Integer offset);
}
