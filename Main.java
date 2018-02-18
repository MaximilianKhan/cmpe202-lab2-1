
public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5, GumballMachineModel.TYPE25);

		System.out.println(gumballMachine);

		gumballMachine.insertCoin( Coin.QUARTER );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine + "\n");

		gumballMachine.insertCoin( Coin.QUARTER );
		gumballMachine.turnCrank();
		gumballMachine.insertCoin( Coin.QUARTER );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine + "\n");
	}
}
