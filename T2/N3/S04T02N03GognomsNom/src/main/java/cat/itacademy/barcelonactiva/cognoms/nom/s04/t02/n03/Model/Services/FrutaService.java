package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.Model.Services;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.Model.Domain.Fruta;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.Model.Repository.FrutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FrutaService {
    @Autowired
    private FrutaRepository frutaRepository;

    public List<Fruta> getAllFrutas() {
        return frutaRepository.findAll();
    }

    public Fruta saveFruta(Fruta fruta) {
        return frutaRepository.save(fruta);
    }

    public Fruta updateFruta(Fruta fruta) {
        Optional<Fruta> existingFruta = frutaRepository.findById(fruta.getId());
        if (existingFruta.isPresent()) {
            Fruta updatedFruta = existingFruta.get();
            updatedFruta.setNombre(fruta.getNombre());
            updatedFruta.setCantidadKilos(fruta.getCantidadKilos());
            return frutaRepository.save(updatedFruta);
        } else {
            throw new RuntimeException("Fruta no encontrada");
        }
    }

    public void deleteFruta(Long id) {
        frutaRepository.deleteById(id);
    }

    public Fruta getOneFruta(Long id) {
        return frutaRepository.findById(id).orElse(null);
    }
}
