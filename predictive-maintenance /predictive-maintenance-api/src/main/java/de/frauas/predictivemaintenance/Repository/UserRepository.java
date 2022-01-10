package de.frauas.predictivemaintenance.Repository;

import de.frauas.predictivemaintenance.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query("select user from User user where user.username = :username")
    List<User> findByUsername(@Param("username") String username);

    boolean existsByUsername(String username);
}
