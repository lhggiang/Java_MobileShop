package vn.hoanggiang.mobileshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.hoanggiang.mobileshop.domain.Cart;
import vn.hoanggiang.mobileshop.domain.CartDetail;
import vn.hoanggiang.mobileshop.domain.Product;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {
    CartDetail findByCartAndProduct(Cart cart, Product product);
}
