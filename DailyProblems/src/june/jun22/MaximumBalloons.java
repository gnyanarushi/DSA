package june.jun22;

import java.util.*;

public class MaximumBalloons {
    public static void main(String[] args) {

        String s = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";



        MaximumBalloons maximumBalloons = new MaximumBalloons();
        int ans = maximumBalloons.maxNumberOfBalloons(s);
        System.out.println(ans);

    }

    public int maxNumberOfBalloons(String s) {

        String org = "balloon";
        HashMap<Character , Integer> ballons = new HashMap<>();
        for(int i = 0 ; i < org.length(); i++){
            ballons.put(org.charAt(i) , 0 );
        }

        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(ballons.containsKey(c)){
                ballons.put(c , ballons.get(c)+1);
            }
        }

        System.out.println(ballons);

        int minvalue = min(ballons);

        while(minvalue >= 0 ){
            if(minvalue * 2 <= ballons.get('l') && minvalue*2 <= ballons.get('o')){
                return minvalue;
            }
            minvalue--;
        }

        return 0 ;

    }


    public  int min(HashMap<Character , Integer> map){
        int min = Integer.MAX_VALUE;
        for(int i : map.values()){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

}