package lab.php.rohmat.service;

import lab.php.rohmat.entity.DataMahasiswa;
import lab.php.rohmat.model.DataMahasiswaModel;
import lab.php.rohmat.repo.DataMahasiswaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class DataMahasiswaService {

    @Autowired
    private DataMahasiswaRepo repo;

    public List<DataMahasiswa> getAllData(){
        return repo.findAll();
    }

    public DataMahasiswa convertToEntity(DataMahasiswaModel model){
        DataMahasiswa result = new DataMahasiswa();
        result.setNim(model.getNim());
        result.setNama(model.getNama());
        result.setJurusan(model.getJurusan());
        result.setAlamat(model.getAlamat());
        return result;
    }

    public DataMahasiswa save(DataMahasiswa data){
        return repo.save(data);
    }

    public Optional<DataMahasiswa> findById(String nim){
        return repo.findById(nim);
    }

    public void removeById(String nim){
        repo.deleteById(nim);
    }
}
