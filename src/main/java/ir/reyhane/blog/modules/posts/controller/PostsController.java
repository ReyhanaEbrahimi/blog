package ir.reyhane.blog.modules.posts.controller;


import ir.reyhane.blog.modules.posts.PostsService;
import ir.reyhane.blog.modules.posts.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/posts")
public class PostsController {

    private PostsService postsService;

    @Autowired
    public PostsController(PostsService postsService) {
        this.postsService = postsService;
    }

    @RequestMapping(value = "/rest",method = RequestMethod.GET)
    public String showRegisterPost() {
        return "posts/registerPosts";
    }
       @RequestMapping(value = "/rest",method = RequestMethod.POST)
    public String registerPostNew(@ModelAttribute Post post){
        postsService.registerPost(post);
       return  "posts/registerPosts";
    }
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Post> getPosts() {
        return postsService.findAllPosts();
    }
    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody  List<Post> restGetPosts() {
        return postsService.findAllPosts();
    }

    @RequestMapping(value = {"/",""}, method = RequestMethod.POST)
    public Post registerPost(@RequestBody Post posts) {
        return postsService.registerPost(posts);
    }


}
