package lab.php.rohmat.repo;

import lab.php.rohmat.entity.DataMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DataMahasiswaRepo extends JpaRepository<DataMahasiswa, String> {

}
