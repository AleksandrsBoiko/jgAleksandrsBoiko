package lv.lesson12;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return getName().equals(product.getName()) &&
                getId().equals(product.getId()) &&
                getPrice().equals(product.getPrice()) &&
                getCategory() == product.getCategory();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getPrice(), getCategory());
    }

    private String name;
    private Long id;
    private BigDecimal price;
    private ProductCategory category;
    private BigDecimal discount;
    private String description;

    public Product(String name, Long id, BigDecimal price, ProductCategory category, BigDecimal discount, String description) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.category = category;
        this.discount = discount;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", category=" + category +
                ", discount=" + discount +
                ", description='" + description + '\'' +
                '}';
    }





    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }




}