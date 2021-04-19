
interface Hussain extends Manea {//you can inherit interfaces to other interfaces
	//abstract method
	void HuName();
	//every variables in any interface it will be come automatically final
	String HuID = "439100218";
	public default void HuInfo(){
		System.out.println("the ID of Hussain is : "+HuID);
	}
}
