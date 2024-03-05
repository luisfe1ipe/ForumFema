package br.edu.fema.forum.ForumFema.Controller;

import br.edu.fema.forum.ForumFema.model.Curso;
import br.edu.fema.forum.ForumFema.model.DTO.TopicosDTO;
import br.edu.fema.forum.ForumFema.model.StatusTopico;
import br.edu.fema.forum.ForumFema.model.Topico;
import br.edu.fema.forum.ForumFema.repository.TopicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicosRepository topicosRepository;

    @RequestMapping("/topicos")
    public List<TopicosDTO> lista(String nomeCurso) {
        if (nomeCurso == null) {
            List<Topico> topicos = topicosRepository.findAll();
            return TopicosDTO.converter(topicos);
        } else {
            List<Topico> topicos = topicosRepository.findByCursoNome(nomeCurso);
            return TopicosDTO.converter(topicos);
        }

    }

    @RequestMapping("/statusTopicos")
    public List<TopicosDTO> listas(StatusTopico status) {
        if (status == null) {
            List<Topico> topicos = topicosRepository.findAll();
            return TopicosDTO.converter(topicos);
        } else {
            List<Topico> topicos = topicosRepository.findByStatus(status);
            return TopicosDTO.converter(topicos);
        }


    }
}
