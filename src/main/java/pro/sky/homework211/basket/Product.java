package pro.sky.homework211.basket;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Product {
    private Set<Integer> productIDs;



    public Product() {
        this.productIDs = new HashSet<>();
    }


    @PostConstruct
    public void init() {
        System.out.println("Basket class is here!!!");
    }

    public void add(Set<Integer> productIDs) {
        for (Integer productID : productIDs) {
            this.productIDs.addAll(productIDs);
        }
    }

    public Set<Integer> getProductIDs() {
        return productIDs;
    }
}