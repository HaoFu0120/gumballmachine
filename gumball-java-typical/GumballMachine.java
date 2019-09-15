public class GumballMachine {

    private int num_gumballs;
    private boolean has_quarter;
    private int total;
    private int gumball_cost;
    private String gumball_type;

    public GumballMachine(int size, int cost, String type) {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.total = 0;
        this.gumball_cost = cost;
        this.gumball_type = type;
    }

    public void insertQuarter(int coin) {
        if (coin == 25 && this.gumball_cost == 25 && this.gumball_type.equals("quater")) {
            total += coin;
            this.has_quarter = true;
            System.out.println( "A quarter inserted." );
        } else if (coin == 25 && this.gumball_cost == 50 && this.gumball_type.equals("quater"))  {
            total += coin;
            System.out.println( "A quarter inserted." );
        } else if (this.gumball_cost == 50 && this.gumball_type.equals("any")){
            total += coin;
        } else {
            System.out.println("This machine only accepts quaters, coin ejecting.");
            System.out.println("Please insert a quarter.");
        }
    }
    
    public void turnCrank() {
    	if (this.gumball_type.equals("quater") && (this.total >= this.gumball_cost)) {
    		if (this.num_gumballs > 0) {
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else {
                System.out.println( "A quarter inserted." );
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}  else if (this.total >= this.gumball_cost && this.gumball_type.equals("any")) {
            if (this.num_gumballs > 0) {
                this.num_gumballs-- ;
                System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
            }
            else {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        } else if ((this.total < this.gumball_cost) && this.gumball_type.equals("any")){
    		System.out.println( "Not enough coins, please insert more!" ) ;
    	}
    }
}
