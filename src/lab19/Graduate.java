package lab19;

public class Graduate extends College{
	private String collegeOrigin;

	public Graduate(String a) {
		collegeOrigin = a;
	}

	public String getCollegeOrigin() {
		return collegeOrigin;
	}

	public void setCollegeOrigin(String collegeOrigin) {
		this.collegeOrigin = collegeOrigin;
	}
	
	public String from(){
		String s="";
		
		if(collegeOrigin == super.getCollegeToApply()){
			return "from inside";
		}else
			return "From outside";
	}
}
