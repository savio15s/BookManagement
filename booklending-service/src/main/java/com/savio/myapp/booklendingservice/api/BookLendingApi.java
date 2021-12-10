package com.savio.myapp.booklendingservice.api;




import java.util.List;

import com.savio.myapp.booklendingservice.model.Register;
import com.savio.myapp.booklendingservice.repo.RegisterRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookLendingApi {

    @Autowired
    private RegisterRepo regRepo;

    @PostMapping("/lendBook")
    public Register lendBook(@RequestBody final Register ro)
    {
        System.out.println(ro.getpId());
        return regRepo.save(ro);
        
    }
    @RequestMapping("/getLender/{bname}")
    public List<Register> getLender(@PathVariable("bname") final String bname)
    {
        return regRepo.findBybookName(bname);
    }
    


   
    

   
}
