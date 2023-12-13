package cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01.S04T02N01GognomsNom.Controllers;

import cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01.S04T02N01GognomsNom.Model.Domain.Fruta;
import cat.itacademy.barcelonactiva.apellidos.nombre.s04.t02.n01.S04T02N01GognomsNom.Model.Services.FrutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruta")
public class FrutaController {
    @Autowired(required = false)
    private FrutaService frutaService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Fruta addFruta(@RequestBody Fruta fruta) {
        return frutaService.saveFruta(fruta);
    }

    @PutMapping("/update")
    public ResponseEntity<Fruta> updateFruta(@RequestBody Fruta fruta) {
        return new ResponseEntity<>(frutaService.updateFruta(fruta), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFruta(@PathVariable Long id) {
        if (frutaService.getOneFruta(id) != null) {
            frutaService.deleteFruta(id);
            return new ResponseEntity<>("Eliminado", HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>("No encontrado", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/getOne/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Fruta getOneFruta(@PathVariable Long id) {
        return frutaService.getOneFruta(id);
    }

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<Fruta> getAllFrutas() {
        return frutaService.getAllFrutas();
    }
}
