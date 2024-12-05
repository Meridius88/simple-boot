package ge.ibsu.demo.controler;

import ge.ibsu.demo.dto.TestInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController{
    @RequestMapping(value = "/hi", method = RequestMethod.GET, produces = {"application/json"})
    public String test(){
        return"Hello From Server";
    }

    @RequestMapping(value = "/post", method  = RequestMethod.POST, produces= {"application/json"})
    public TestInfo testPost(@RequestBody TestInfo t){
        t.setLastName(t.getLastName()+" from server");
        return t;
    }


}