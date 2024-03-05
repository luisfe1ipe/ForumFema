package br.edu.fema.forum.ForumFema.repository;

import br.edu.fema.forum.ForumFema.model.StatusTopico;
import br.edu.fema.forum.ForumFema.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicosRepository extends JpaRepository<Topico,Long> {
    List<Topico> findByCursoNome(String nomeCurso);

    List<Topico> findByStatus(StatusTopico status);

}
