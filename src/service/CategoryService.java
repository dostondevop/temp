package service;

import model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CategoryService {
    List<Category> categories = new ArrayList<Category>();

    public Category add(Category category) {
        if (categories.contains(category)) {
            return null;
        }

        categories.add(category);
        return category;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public boolean sellingProduct(Category category, UUID ownerID) {
        for (Category c : categories) {
            if (c.getId().equals(category.getId())) {
                c.setOwnerID(ownerID);
                return true;
            }
        }
        return false;
    }

    public List<Category> getCategoryByOwnerId(UUID ownerID) {
        List<Category> oneUserItems = new ArrayList<>();
        for (Category category : categories) {
            if (category.getOwnerID().equals(ownerID)) {
                oneUserItems.add(category);
            }
        }
        return oneUserItems;
    }

    public boolean removeCategory(Category category) {
        categories.removeIf(c -> c.getParentID().equals(category.getId()));
        return categories.remove(category);
    }

    public List<Category> getCategoryToPrint() {
        List<Category> parentCategories = new ArrayList<>();
        for (Category category : categories) {
            if (category.getParentID() == null) {
                parentCategories.add(category);
            }
        }
        return parentCategories;
    }

    public List<Category> getCategoryToPrint(UUID parentID) {
        List<Category> childCategories = new ArrayList<>();
        for (Category category : categories) {
            if (category.getParentID().equals(parentID)) {
                childCategories.add(category);
            }
        }
        return childCategories;
    }
}
