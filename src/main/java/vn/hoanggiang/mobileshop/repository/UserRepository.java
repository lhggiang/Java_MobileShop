package vn.hoanggiang.mobileshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.hoanggiang.mobileshop.domain.Order;
import vn.hoanggiang.mobileshop.domain.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    List<User> findOneByEmail(String email);
    Optional<User> findByEmail(String email);
}
