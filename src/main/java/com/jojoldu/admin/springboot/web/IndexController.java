package com.jojoldu.admin.springboot.web;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(Model model) {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
/*        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);*/

        return "posts-update";
    }
}