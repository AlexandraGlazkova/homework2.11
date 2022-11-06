package pro.sky.homework211.service;


import java.util.Set;

public interface ProductService {

    void add(Set<Integer> productIDs);

    Set<Integer> get();
}

