package services;

import entity.Categories;

public interface CategoryService {

    Categories add(Categories categories);
    void delete(String name);
    Categories update(Categories categories);
}
