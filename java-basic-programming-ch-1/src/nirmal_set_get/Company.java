package nirmal_set_get;

public class Company {

	private String ComapnyName;
	private String CompanyCeo;
	private int Companyemployee;

	public Company(String comapnyName, String companyCeo, int companyemployee) {

		ComapnyName = comapnyName;
		CompanyCeo = companyCeo;
		Companyemployee = companyemployee;
		
		
	}

	public String getComapnyName() {
		return ComapnyName;
	}

	public void setComapnyName(String comapnyName) {
		ComapnyName = comapnyName;
	}

	public String getCompanyCeo() {
		return CompanyCeo;
	}

	public void setCompanyCeo(String companyCeo) {
		CompanyCeo = companyCeo;
	}

	public int getCompanyemployee() {
		return Companyemployee;
	}

	public void setCompanyemployee(int companyemployee) {
		Companyemployee = companyemployee;
	}

}
