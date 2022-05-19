package br.espm.cambio;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MoedaService {
    
    @Autowired
    private MoedaRepository moedaRepository;

    public List<Moeda> listAll() {
    return StreamSupport
            .stream(moedaRepository.findAll().spliterator(),false)
            .collect(Collectors.toList())
            .stream().map(MoedaModel::to)
            .collect(Collectors.toList());

    }

    public Moeda create(Moeda vo) {
        vo.setId(UUID.randomUUID());
      return moedaRepository.save(new MoedaModel(vo)).to();
    }
}
