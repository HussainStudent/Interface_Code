
interface Abdulaziz {
	//abstract method
	void AzName();
	//every variables in any interface it will be come automatically final
	String AzID = "439100169";
	//default method
	public default void AzInfo(){
		System.out.println("Abdulaziz ID is : "+AzID);
	}

}
