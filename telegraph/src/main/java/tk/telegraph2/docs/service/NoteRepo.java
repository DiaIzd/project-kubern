package tk.telegraph2.docs.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tk.telegraph2.docs.model.Note;

import java.util.List;


@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {

    Note findAllById(Long id);

    List<Note> findAllByCategoriesContains(String name);
}

