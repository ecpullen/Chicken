
public class Chicken {

	String division,classe,breed,variety,sex;
	Breeder breeder;
	
	int coopNum;
	
	public Chicken(Breeder breeder,String division,String classe,String breed,String variety,String sex){
		this.breeder = breeder;
		this.division = division;
		this.classe = classe;
		this.breed = breed;
		this.variety = variety;
		this.sex = sex;
	}
	
	public void setNum(int x){
		coopNum = x;
	}
	
	public String toString(){
		return "" + division + " " + classe + " " + breed + " " + variety + " " + sex;
	}
}
