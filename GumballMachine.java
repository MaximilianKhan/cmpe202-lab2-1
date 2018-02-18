// import com.sun.java.util.jar.pack.Instruction.Switch;

public class GumballMachine
{

    private int num_gumballs;
    private int machine_balance;
    private GumballMachineModel model;

    public GumballMachine( int size , GumballMachineModel model )
    {
        // initialize instance variables
        this.num_gumballs    = size ;
        this.machine_balance = 0 ;
        this.model           = model ;
    }

    public void insertCoin(Coin coin)
    {
        switch (this.model) {
            case TYPE25:
                if (coin == Coin.QUARTER) 
                {
                    this.machine_balance +=25;
                    System.out.println("Inserted quarter.");
                }
                else 
                {
                    System.out.println("Error, cannot insert coin.");
                }
                break;

            case TYPE50:
                if (coin == Coin.QUARTER) 
                {
                    this.machine_balance +=25;
                    System.out.println("Inserted quarter.");
                }
                else 
                {
                    System.out.println("Error, cannot insert coin.");
            }
                break;

            case TYPE_ALL:
                switch (coin) {
                    case PENNY:
                        this.machine_balance += 1;
                        System.out.println("Inserted penny.");
                        break;
    
                    case NICKEL:
                        this.machine_balance += 5;
                        System.out.println("Inserted nickel.");
                        break;
    
                    case DIME:
                        this.machine_balance += 10;
                        System.out.println("Inserted dime.");
                        break;
    
                    case QUARTER:
                        this.machine_balance +=25;
                        System.out.println("Inserted quarter.");
                        break;
    
                    default:
                        System.out.println("Error, cannot insert coin.");
                        break;
                }
                break;

            default:
                System.out.println( "Error." ) ;
                break;
        }

    }
    
    public void turnCrank()
    {
    	if ( this.machine_balance > 0 )
    	{

            if (this.num_gumballs > 0) 
            {

                switch (this.model) {
                    case TYPE25:
                        if ( this.machine_balance == 25 )
                        {
                            this.machine_balance = 0 ;
                            this.num_gumballs-- ;
                            System.out.println( "Thanks you for your money!  Gumball Ejected!" ) ;
                        }
                        else 
                        {
                            System.out.println( "Cannot turn crank. Insufficient funds. Balance: " + this.machine_balance + " cents" ) ;
                        }
                        break;
    
                    case TYPE50:
                        if ( this.machine_balance == 50 )
                        {
                            this.machine_balance = 0 ;
                            this.num_gumballs-- ;
                            System.out.println( "Thanks you for your money!  Gumball Ejected!" ) ;
                        }
                        else 
                        {
                            System.out.println( "Cannot turn crank. Insufficient funds. Balance: " + this.machine_balance + " cents" ) ;
                        }
                        break;
    
                    case TYPE_ALL:
                        if ( this.machine_balance >= 50 )
                        {
                            this.machine_balance -= 50 ;
                            this.num_gumballs-- ;
                            System.out.println( "Thanks you for your money!  Gumball Ejected!" ) ;
                        }
                        else 
                        {
                            System.out.println( "Cannot turn crank. Insufficient funds. Balance: " + this.machine_balance + " cents" ) ;
                        }
                        break;
    
                    default:
                        System.out.println("Error, cannot turn crank.");
                        break;
                }

            } 
            else 
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }

    	}
    	else 
    	{
            switch ( this.model ) {
                case TYPE25:
                    System.out.println( "Please insert quarter." ) ;
                    break;

                case TYPE50:
                    System.out.println( "Please insert quarters." ) ;
                    break;
                case TYPE_ALL:
                    System.out.println( "Please insert coins." ) ;
                    break;
                default:
                    System.out.println( "Error." ) ;
                    break;
            }

    		
    	}        
    }

    public String toString() 
    {
        return "Gumballs: " + this.num_gumballs + "\tBalance: " + this.machine_balance + " cents";
    }

}
