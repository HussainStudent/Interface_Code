
public class OurGrop implements Hussain,Abdulaziz {//implemented the interface classes 
	public static void main(String[] args){
		OurGrop obj = new OurGrop();
		obj.HuName();
		obj.HuInfo();
		obj.AzName();
		obj.AzInfo();
		obj.MaName();
		
	}

	// every abstract method in every interface will have to be implemented and it's call Override method
	public void MaName() {
		System.out.println("the student's name is Manea");
		
	}

	public void AzName() {
		System.out.println("the student's name is Abdulaziz");
	}

	public void HuName() {
		System.out.println("the student's name is Hussain");
	}

}
