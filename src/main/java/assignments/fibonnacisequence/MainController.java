package assignments.fibonnacisequence;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/getnumber")

    public String fiboSequence(@RequestParam("number") int num) {

        String sequence="";
        String sumSequence="";
        int sum=0;
        int[] feb = new int[num];
        feb[0] = 0;
        feb[1] = 1;

        for(int i=2; i < num; i++){
            feb[i] = feb[i-1] + feb[i-2];
            sequence+=feb[i]+"  ";
            if(i%4==0) {
                for (int j = i; j >=0; --j) {
                    sum+= feb[j];
                }
                sumSequence += sum+" ";
                sequence+=sumSequence;
            }
        }
        //sequence+="<br/>"+sumSequence;
        return sequence;

    }
}
