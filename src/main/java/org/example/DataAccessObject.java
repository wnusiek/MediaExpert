package org.example;


import java.util.List;
import java.util.Optional;

public interface DataAccessObject<TData> {
    // CRUD
    // Create
    // Read
    // Update
    // Delete

    Boolean create(TData newItem);

    Optional<TData> read(Integer id);
    List<TData> read();
    Boolean update(Integer id, TData updatedItem);
    Boolean delete(Integer id);
    Boolean delete(TData itemToDelete);
}

