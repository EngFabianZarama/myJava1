package lab19;

public abstract class College {
	private String name;
	private String collegeToApply;
	
	public College(){}
	
	public College(String a, String b){
		name = a;
		collegeToApply = b;
	}

	public String getCollegeToApply() {
		return collegeToApply;
	}

	public void setCollegeToApply(String collegeToApply) {
		this.collegeToApply = collegeToApply;
	}
	
	
}
