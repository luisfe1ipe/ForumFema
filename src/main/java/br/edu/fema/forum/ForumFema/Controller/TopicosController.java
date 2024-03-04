package br.edu.fema.forum.ForumFema.Controller;

import br.edu.fema.forum.ForumFema.model.Curso;
import br.edu.fema.forum.ForumFema.model.DTO.TopicosDTO;
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
    public List<TopicosDTO> lista(){
        List<Topico> topicos = topicosRepository.findAll();
        return TopicosDTO.converter(topicos);
    }

}
