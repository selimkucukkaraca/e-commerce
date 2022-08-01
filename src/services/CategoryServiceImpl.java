package services;

import entity.Categories;

public class CategoryServiceImpl implements CategoryService{




    @Override
    public Categories add(Categories categories) {
        Categories categories1 = new Categories();

        categories1.setId(categories.getId());
        categories1.setName(categories.getName());


        System.out.println(categories1.getId() + " id'li kategori eklendi");
        return categories;
    }

    @Override
    public void delete(String name) {
        System.out.println((name + " isimli kategori silindi,"));
    }

    @Override
    public Categories update(Categories categories) {
        Categories updateCategories = new Categories();

        updateCategories.setId(categories.getId());
        updateCategories.setName(categories.getName());

        System.out.println(updateCategories.getId() + " id'li kategori guncellendi");
        return updateCategories;
    }
}
