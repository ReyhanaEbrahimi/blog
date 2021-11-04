package ir.reyhane.blog.modules.posts.repository;


import ir.reyhane.blog.modules.posts.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostsRepository extends JpaRepository<Post, Long> {

}
