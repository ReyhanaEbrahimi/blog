package ir.reyhane.blog.modules.posts.repository;


import ir.reyhane.blog.modules.posts.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
