package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.Model.Repository;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n03.Model.Domain.Fruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FrutaRepository extends MongoRepository<Fruta, Long> {
}
