package ir.reyhane.blog.modules.users.repository;

import ir.reyhane.blog.modules.users.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
    @Query(nativeQuery = true,value = "select * from USER  u where u.email = :email")
    User userEmail(@Param("email") String e);
}
