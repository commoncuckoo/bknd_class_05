package kr.ac.cu.dgict.bknd_class_05;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostService service;


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("bgimage", "home-bg.jpg");
        model.addAttribute("heading", "블로그");
        model.addAttribute("subheading", "블로그만들쟈");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("bgimage", "home-bg.jpg");
        model.addAttribute("heading", "블로그 정보");
        model.addAttribute("subheading", "블로그 정보 보여줌");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("bgimage", "home-bg.jpg");
        model.addAttribute("heading", "연락처");
        model.addAttribute("subheading", "연락처 정보 보여줌");
        return "contact";
    }

    @GetMapping("/post/{postid}")
    public String post(Model model, @PathVariable("postid") Long postid){
        Optional<BlogPost> article = service.findById(postid);
        model.addAttribute("author", article);
        model.addAttribute("subject", article.getsubject());
        model.addAttribute("subheading",article.getarticle());
        model.addAttribute("subheading",postid.toString());
        return "post";
    }

    // @PostMapping("/addPost")
    // public String addPost(Model model, @RequestBody BlogPost entity){
    //     BlogPost saved = bpreporitory.save(entity);
    //     return "post";
    // }

    @PostMapping("/addPost")
    @ResponseBody
    public Long addPost(Model model, @RequestBody BlogPost entity){
        BlogPost saved = bpreporitory.save(entity);
        return saved.getId();
    }

}
