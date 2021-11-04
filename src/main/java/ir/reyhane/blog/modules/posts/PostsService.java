package ir.reyhane.blog.modules.posts;


import ir.reyhane.blog.modules.posts.models.Post;
import ir.reyhane.blog.modules.posts.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    private PostsRepository postsRepository;

    @Autowired
    public PostsService(PostsRepository postsRepository) {
        this.postsRepository = postsRepository;
    }

    public Post registerPost(Post posts) {
        return this.postsRepository.save(posts);
    }

    public List<Post> findAllPosts() {
        return this.postsRepository.findAll();
    }


}
