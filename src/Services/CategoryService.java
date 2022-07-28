package Services;

import Entity.Categories;

public interface CategoryService {

    Categories add(Categories categories);
    void delete(String name);
    Categories update(Categories categories);
}
