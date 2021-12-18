package booksystem.Spring_Book.Repository;

import booksystem.Spring_Book.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT s FROM Book s WHERE s.id = ?1")
    Optional<Book> findBookById(Long id);
}
