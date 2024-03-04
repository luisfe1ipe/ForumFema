package br.edu.fema.forum.ForumFema.repository;

import br.edu.fema.forum.ForumFema.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicosRepository extends JpaRepository<Topico,Long> {
}
