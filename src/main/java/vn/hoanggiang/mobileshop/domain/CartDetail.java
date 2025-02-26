package vn.hoanggiang.mobileshop.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cart_detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDetail implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long quantity;

    private double price;

    // cart_id: long
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    // product_id: long
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
