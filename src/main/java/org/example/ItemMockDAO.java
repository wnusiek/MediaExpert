package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemMockDAO implements DataAccessObject<Item> {
    private final List<Item> fakeDataBase;

    public ItemMockDAO() {
        this.fakeDataBase = new ArrayList<>();
    }

    @Override
    public Boolean create(Item newItem) {
        if (this.fakeDataBase.contains(newItem)) {
            return false;
        } else {
            this.fakeDataBase.add(newItem);
            return true;
        }
    }

    @Override
    public Optional read(Integer id) {
        return Optional.empty();
    }

    @Override
    public List read() {
        return null;
    }

    @Override
    public Boolean update(Integer id, Item updatedItem) {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        return null;
    }

    @Override
    public Boolean delete(Item itemToDelete) {
        return null;
    }

}
