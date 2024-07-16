package kr.ac.cu.dgict.bknd_class_05.Service;

import kr.ac.cu.dgict.bknd_class_05.DTO.BlogPost;

public interface BlogPostService {
    BlogPost addBlogPost(BlogPost blogPost);

    BlogPost findById(Long postid);

    BlogPost save(BlogPost entity);


}
