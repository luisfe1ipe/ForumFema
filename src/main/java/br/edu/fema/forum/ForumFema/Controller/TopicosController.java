package br.edu.fema.forum.ForumFema.Controller;

import br.edu.fema.forum.ForumFema.model.Curso;
import br.edu.fema.forum.ForumFema.model.DTO.TopicosDTO;
import br.edu.fema.forum.ForumFema.model.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {
    @RequestMapping("/topicos")
    @ResponseBody
    public List<TopicosDTO> lista(){
        Topico topico = new Topico("Duvida fisica Quantica", "Duvida Buraco Negro", new Curso(
                "Fisica", "Programação"));
        Topico topico2 = new Topico("Duvida fisica Programatica", "Duvida Buraco Branco", new Curso(
                "Fisica Programatica", "Programação quantica"));

        return TopicosDTO.converter(Arrays.asList(topico, topico2));
    }

}
