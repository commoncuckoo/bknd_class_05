package kr.ac.cu.dgict.bknd_class_05;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    @Setter
    private String subject;
    
    @Column(columnDefinition="LONGTEXT", nullable=false)
    @Setter
    private String article;

    @Column(nullable=false, updatable=false)
    private String writer;

    @CreatedDate
    @Column(updatable=false)
    private LocalDateTime createAt;
    
    @LastModifiedDate
    private LocalDateTime updateAt;
}
