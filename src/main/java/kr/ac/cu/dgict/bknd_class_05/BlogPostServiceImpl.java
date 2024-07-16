package kr.ac.cu.dgict.bknd_class_05;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogPostServiceImpl implements BlogPostService{

    @Autowired
    private BlogPostRepository repository;

    @Override
    public BlogPost addBlogPost(BlogPost blogPost) {
        BlogPost added = repository.save(blogPost);
        return added;
    }

    @Override
    public Optional<BlogPost> findById(Long postid) {
        return repository.findById(postid);
    }

    
    
}
