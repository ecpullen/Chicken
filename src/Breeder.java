
public class Breeder {

	String name,address,email;
	boolean jr;
	double total;
	int bNum;
	EntryForm entryForm;
	
	public Breeder(String name, String address, String email){
		this.name = name;
		this.address = address;
		this.email = email;
	}
	
	public void setEntryForm(EntryForm entryForm){
		this.entryForm = entryForm;
	}
	
	public void setNum(int x){
		bNum = x;
	}
	
	public EntryForm getEntryForm(){
		return entryForm;
	}
	
	public void showEntry(){
		entryForm.setVisible(true);;
	}
}
