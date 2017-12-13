


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  com.kuis_1036.kuis_1036.repo;

import com.kuis_1036.kuis_1036.entity.identitas_1036;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface IdentitasRepo extends CrudRepository<identitas_1036, String> {

    @Query("select c from identitas_1036 c")
    public List<identitas_1036> findAllIdentitas();
}
