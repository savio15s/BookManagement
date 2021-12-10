package com.savio.myapp.booklendingservice.repo;


import java.util.List;

import com.savio.myapp.booklendingservice.model.Register;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RegisterRepo extends JpaRepository<Register,Integer> {

    List<Register> findBybookName(String bname);

    
    
}
