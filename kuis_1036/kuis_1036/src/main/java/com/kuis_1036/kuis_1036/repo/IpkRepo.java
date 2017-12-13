


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  com.kuis_1036.kuis_1036.repo;
import com.kuis_1036.kuis_1036.entity.ipk_1036;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface IpkRepo extends CrudRepository<ipk_1036, Long> {

    @Query("select c from ipk_1036 c")
    public List<ipk_1036> findAllIpk();
}
