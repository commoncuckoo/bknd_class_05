package kr.ac.cu.dgict.bknd_class_05.VO;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.ac.cu.dgict.bknd_class_05.DTO.BlogPost;

public interface  BlogPostRepository extends JpaRepository<BlogPost, Long>{
    
}
