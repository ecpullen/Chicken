import java.util.ArrayList;


public class Data {
	String show;
	
	static ArrayList<Breeder> Breeders;
	
	static ArrayList<ArrayList<ArrayList<Chicken>>> LF,BTM,WF;
	
	static ArrayList<ArrayList<Chicken>> Ame,Asi,Med,AOSB,Eng,Cont;
	
	static ArrayList<ArrayList<Chicken>> SCCL,RCCL,AOCCL,FL,OE,MG;
	
	static ArrayList<ArrayList<Chicken>> HV,MD,LT,BTMD;
	
	public Data(String show){
		this.show = show;
		SCCL = new ArrayList<ArrayList<Chicken>>();
		RCCL = new ArrayList<ArrayList<Chicken>>();
		AOCCL = new ArrayList<ArrayList<Chicken>>();
		FL = new ArrayList<ArrayList<Chicken>>();
		BTMD = new ArrayList<ArrayList<Chicken>>();
		OE = new ArrayList<ArrayList<Chicken>>();
		MG = new ArrayList<ArrayList<Chicken>>();
		
		BTM = new ArrayList<ArrayList<ArrayList<Chicken>>>();
		BTM.add(SCCL);
		BTM.add(RCCL);
		BTM.add(AOCCL);
		BTM.add(FL);
		BTM.add(OE);
		BTM.add(MG);
		/*
		LF.add(Ame);
		LF.add(Asi);
		LF.add(Eng);
		LF.add(Med);
		LF.add(AOSB);
		LF.add(Cont);
		
		WF.add(HV);
		WF.add(MD);
		WF.add(LT);
		WF.add(BTMD);
		*/
	}
	
	public static Chicken add(Chicken c){
		String cla = c.classe;
		if(cla.equals("SCCL")){
			addSCCL(c);
		}
		else if(cla.equals("RCCL")){
			addRCCL(c);
		}
		else if(cla.equals("AOCCL")){
			addAOCCL(c);
		}
		else if(cla.equals("FL")){
			addFL(c);
		}
		else if(cla.equals("BTMD")){
			addBTMD(c);
		}
		else if(cla.equals("OE")){
			addOE(c);
		}
		else if(cla.equals("MG")){
			addMG(c);
		}
		return c;
		
	}

	private static void addMG(Chicken c) {
		boolean found = false;
		for(int x = 0; x < MG.size(); x ++){
			if(MG.get(x).get(0).variety.equals(c.variety)){
				MG.get(x).add(c);
				found = true;
			}
		}
		if(!found){
			ArrayList<Chicken> temp = new ArrayList<Chicken>();
			temp.add(c);
			MG.add(temp);
		}
	}

	private static void addOE(Chicken c) {
		boolean found = false;
		for(int x = 0; x < OE.size(); x ++){
			if(OE.get(x).get(0).variety.equals(c.variety)){
				OE.get(x).add(c);
				found = true;
			}
		}
		if(!found){
			ArrayList<Chicken> temp = new ArrayList<Chicken>();
			temp.add(c);
			OE.add(temp);
		}
	}

	private static void addBTMD(Chicken c) {
		boolean found = false;
		for(int x = 0; x < BTMD.size(); x ++){
			if(BTMD.get(x).get(0).breed.equals(c.breed)){
				BTMD.get(x).add(c);
				found = true;
			}
		}
		if(!found){
			ArrayList<Chicken> temp = new ArrayList<Chicken>();
			temp.add(c);
			BTMD.add(temp);
		}
	}

	private static void addFL(Chicken c) {
		boolean found = false;
		for(int x = 0; x < FL.size(); x ++){
			if(FL.get(x).get(0).breed.equals(c.breed)){
				FL.get(x).add(c);
				found = true;
			}
		}
		if(!found){
			ArrayList<Chicken> temp = new ArrayList<Chicken>();
			temp.add(c);
			FL.add(temp);
		}
	}

	private static void addAOCCL(Chicken c) {
		boolean found = false;
		for(int x = 0; x < AOCCL.size(); x ++){
			if(AOCCL.get(x).get(0).breed.equals(c.breed)){
				AOCCL.get(x).add(c);
				found = true;
			}
		}
		if(!found){
			ArrayList<Chicken> temp = new ArrayList<Chicken>();
			temp.add(c);
			AOCCL.add(temp);
		}
	}

	private static void addRCCL(Chicken c) {
		boolean found = false;
		for(int x = 0; x < RCCL.size(); x ++){
			if(RCCL.get(x).get(0).breed.equals(c.breed)){
				RCCL.get(x).add(c);
				found = true;
			}
		}
		if(!found){
			ArrayList<Chicken> temp = new ArrayList<Chicken>();
			temp.add(c);
			RCCL.add(temp);
		}
	}

	private static void addSCCL(Chicken c) {
		boolean found = false;
		for(int x = 0; x < SCCL.size(); x ++){
			if(SCCL.get(x).get(0).breed.equals(c.breed)){
				SCCL.get(x).add(c);
				found = true;
			}
		}
		if(!found){
			ArrayList<Chicken> temp = new ArrayList<Chicken>();
			temp.add(c);
			SCCL.add(temp);
		}
		System.out.print(SCCL);
	}
}
