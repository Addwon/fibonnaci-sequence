package assignments.fibonnacisequence;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/getnumber")

    public String fiboSequence(@RequestParam("number") int num) {

        int sum=0;
        int count=2;
        int[] feb = new int[num];
        feb[0] = 0;
        feb[1] = 1;
        feb[2] = 1;
        feb[3] = 2;
        String sequence=feb[0]+" "+feb[1]+" "+feb[2]+" "+feb[3]+" ";


        for(int i=4; i < num; i++) {
            feb[i] = feb[i - 1] + feb[i - 2]+feb[i - 3]+feb[i - 4];
            sequence += feb[i] + " ";
        }


        return sequence;

    }
}
