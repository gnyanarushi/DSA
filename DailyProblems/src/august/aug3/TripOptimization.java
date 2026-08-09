package august.aug3;

public class TripOptimization {
    public static void main(String[] args) {
        int holidays =  2 ;

        City[] cities = new City[5];
        City london = new City("London" ,  1, 7 );
        City newyork = new City("Newyork" ,  1, 6);
        City paris = new City("paris" ,  2, 9 );
        City berlin = new City("berlin" ,  4, 9 );
        City hyderabad = new City("hyderabad" ,  1, 8 );

        cities[0] = london;
        cities[1] = newyork;
        cities[2] = paris;
        cities[3] = berlin;
        cities[4] = hyderabad;

        int ans = tripOptimization(cities , holidays ) ;

        System.out.println("Maximum output : " + ans);
    }

    public  static  int tripOptimization(City[] cities , int holidays){
        int[][] dp = new int[cities.length + 1][holidays + 1];

        for(int i = 1 ; i < cities.length + 1  ; i++){
            for(int j = 1 ; j < holidays + 1 ;j++){
                if(j >= cities[i-1].duration){
                    dp[i][j] = Math.max(dp[i-1][j] , cities[i].gifts + dp[i-1][j-cities[i-1].duration]);
                }
                else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[dp.length -1 ][holidays];
    }
}


class City{
    String name;
    int duration;
    int gifts;
    public City(String name , int duration ,int gifts){
        this.name  = name;
        this.duration = duration;
        this.gifts = gifts;
    }
}
