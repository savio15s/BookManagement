package com.savio.myapp.bookinventoryservice.intercomm;

import java.util.ArrayList;
import java.util.List;

import com.savio.myapp.bookinventoryservice.model.Register;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.hystrix.FallbackFactory;

@FeignClient(name = "booklending-service", fallbackFactory = BookClient.FeignClientFallbackFactory.class)
public interface BookClient {
	@RequestMapping(method = RequestMethod.GET, value = "/getLender/{bname}")
	List<Register> getLender(@PathVariable("bname") String bname);



	@Component
	public class FeignClientFallbackFactory implements FallbackFactory<BookClient> {

		    @Override
		    public BookClient create(Throwable cause) {
		    	System.out.println("~!~!~!~!!~!~!~! FALLBACK Executed ~~~~~~~~~~~~~");
		    	return new BookClient() {

				    @Override
				    public List<Register> getLender(String bname) {
					    List<Register> bReg = new ArrayList<Register>();
					    Register bre = new Register();
					    bre.setpId(900);
					    bre.setBookName("default");
                        bReg.add(bre);
					    return bReg;
				    }
			    };
		    }
	    }

    }