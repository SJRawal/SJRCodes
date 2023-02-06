package com.xworkz.polymorphism.dataCodes.constructor;

public class Biryani {
	public String rice;
    public String meat;
    public int spices;
    public boolean vegetablesNeeded;
    public boolean saucePrepared;
    public int herbs;
    public float aromatics;
    public String cookingMethod;
    public int size;
    public float prepTime;
    public String typeOfBiryani;
    public int origin;
    public String flavorProfile;
    public int popLevel;
    public String ingQuality;
    
    public Biryani(String r) {
    	rice = r;
    }
    public Biryani(String r,String m) {
    	rice = r;
    	meat = m;
    }
    public Biryani(String r,String m,int sp) {
    	rice = r;
    	meat = m;
    	spices = sp;
    }
    public Biryani(String r,String m,int sp,boolean vN) {
    	rice = r;
    	meat = m;
    	spices = sp;
    	vegetablesNeeded = vN;
    	
    }
    public Biryani (String r,String m,int sp,boolean vN,boolean sP) {
    	rice = r;
    	meat = m;
    	spices = sp;
    	vegetablesNeeded = vN;
    	saucePrepared = sP;
    }
    public Biryani(String r,String m,int sp,boolean vN,boolean sP,int h) {
    	rice = r;
    	meat = m;
    	spices = sp;
    	vegetablesNeeded = vN;
    	saucePrepared = sP;
    	herbs = h;
    }
    public Biryani(String r,String m,int sp,boolean vN,boolean sP,int h,float a) {
    	rice = r;
    	meat = m;
    	spices = sp;
    	vegetablesNeeded = vN;
    	saucePrepared = sP;
    	herbs = h;
    	aromatics = a;
    }
    public Biryani(String r,String m,int sp,boolean vN,boolean sP,int h,float a,String cM) {
    	rice = r;
    	meat = m;
    	spices = sp;
    	vegetablesNeeded = vN;
    	saucePrepared = sP;
    	herbs = h;
    	aromatics = a;
    	cookingMethod = cM;
    }
    public Biryani(String r,String m,int sp,boolean vN,boolean sP,int h,float a,String cM,int sS) {
    	rice = r;
    	meat = m;
    	spices = sp;
    	vegetablesNeeded = vN;
    	saucePrepared = sP;
    	herbs = h;
    	aromatics = a;
    	cookingMethod = cM;
    	size = sS;
    }
    public Biryani(String r,String m,int sp,boolean vN,boolean sP,int h,float a,String cM,int sS,float pT) {
    	rice = r;
    	meat = m;
    	spices = sp;
    	vegetablesNeeded = vN;
    	saucePrepared = sP;
    	herbs = h;
    	aromatics = a;
    	cookingMethod = cM;
    	size = sS;
    	prepTime = pT;
    }
    public Biryani(String r,String m,int sp,boolean vN,boolean sP,int h,float a,String cM,int sS,float pT,String tB) {
    	rice = r;
    	meat = m;
    	spices = sp;
    	vegetablesNeeded = vN;
    	saucePrepared = sP;
    	herbs = h;
    	aromatics = a;
    	cookingMethod = cM;
    	size = sS;
    	prepTime = pT;
    	typeOfBiryani=tB;
    }
    public Biryani(String r,String m,int sp,boolean vN,boolean sP,int h,float a,String cM,int sS,float pT,String tB,int i) {
    	rice = r;
    	meat = m;
    	spices = sp;
    	vegetablesNeeded = vN;
    	saucePrepared = sP;
    	herbs = h;
    	aromatics = a;
    	cookingMethod = cM;
    	size = sS;
    	prepTime = pT;
    	typeOfBiryani=tB;
        origin=i;
    }
    public Biryani(String r,String m,int sp,boolean vN,boolean sP,int h,float a,String cM,int sS,float pT,String tB,int i,String fP) {
    	rice = r;
    	meat = m;
    	spices = sp;
    	vegetablesNeeded = vN;
    	saucePrepared = sP;
    	herbs = h;
    	aromatics = a;
    	cookingMethod = cM;
    	size = sS;
    	prepTime = pT;
    	typeOfBiryani=tB;
        origin=i;
        flavorProfile=fP;
    }
    public Biryani(String r,String m,int sp,boolean vN,boolean sP,int h,float a,String cM,int sS,float pT,String tB,int i,String fP,int pL) {
    	rice = r;
    	meat = m;
    	spices = sp;
    	vegetablesNeeded = vN;
    	saucePrepared = sP;
    	herbs = h;
    	aromatics = a;
    	cookingMethod = cM;
    	size = sS;
    	prepTime = pT;
    	typeOfBiryani=tB;
        origin=i;
        flavorProfile=fP;
        popLevel=pL;
    }
    public Biryani(String r,String m,int sp,boolean vN,boolean sP,int h,float a,String cM,int sS,float pT,String tB,int i,String fP,int pL,String iQ) {
    	rice = r;
    	meat = m;
    	spices = sp;
    	vegetablesNeeded = vN;
    	saucePrepared = sP;
    	herbs = h;
    	aromatics = a;
    	cookingMethod = cM;
    	size = sS;
    	prepTime = pT;
    	typeOfBiryani=tB;
        origin=i;
        flavorProfile=fP;
        popLevel=pL;
        ingQuality=iQ;
    }
    
    public void display() {
    	System.out.println("Biryani rice "+rice);
    	System.out.println("Biryani meat "+meat);
    	System.out.println("Biryani spices "+spices);
    	System.out.println("Biryani vegetables Needed "+vegetablesNeeded);
    	System.out.println("Biryani saucePrepared "+saucePrepared);
    	System.out.println("Biryani herbs "+herbs);
    	System.out.println("Biryani aromatics "+aromatics);
    	System.out.println("Biryani cooking Method "+cookingMethod);
    	System.out.println("Biryani size "+size+" people");
    	System.out.println("Biryani prepTime "+prepTime+" hrs");
    	System.out.println("Biryani type of Biryani "+typeOfBiryani);
    	System.out.println("Biryani origin(1-Indian,2-Pakistani,3-Middle Eastern "+origin);
    	System.out.println("Biryani flavor profile "+flavorProfile);
    	System.out.println("Biryani popLevel(1-low and 5-High) "+popLevel);
    	System.out.println("Biryani Ingredients Quality "+ingQuality);
    }
}
