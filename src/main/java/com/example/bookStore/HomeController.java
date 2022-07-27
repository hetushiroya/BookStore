package com.example.bookStore;

import com.example.bookStore.model.Inquiry;
import com.example.bookStore.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/blog")
    public String blog(Model model){
        model.addAttribute("blogs", blogService.getBlogs());
        return "blog";
    }

    @PostMapping("/blog")
    public String searchBlog(Model model, @ModelAttribute Inquiry inquiry){

       String blogName = inquiry.getSearchString();
       System.out.println(blogName);
        model.addAttribute("searchString", blogService.searchBlogs(blogName));
        return "blog";
    }


    @GetMapping("/categories")
    public String categories(){
        return "categories";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    }
