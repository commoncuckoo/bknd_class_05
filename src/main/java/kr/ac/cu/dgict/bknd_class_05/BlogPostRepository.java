package kr.ac.cu.dgict.bknd_class_05;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  BlogPostRepository extends JpaRepository<BlogPost, Long>{
    
}
