package kr.ac.cu.dgict.bknd_class_05;

import java.util.Optional;

public interface BlogPostService {
    BlogPost addBlogPost(BlogPost blogPost);

    Optional<BlogPost> findById(Long postid);


}
