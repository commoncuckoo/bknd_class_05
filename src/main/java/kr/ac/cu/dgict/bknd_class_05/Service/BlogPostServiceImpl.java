package kr.ac.cu.dgict.bknd_class_05.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.cu.dgict.bknd_class_05.DTO.BlogPost;
import kr.ac.cu.dgict.bknd_class_05.VO.BlogPostRepository;

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
    public BlogPost findById(Long postid) {
        BlogPost found = repository.findById(postid).orElse(null);
        return found;
    }

    @Override
    public BlogPost save(BlogPost entity) {
        return repository.save(entity);
    }

}
