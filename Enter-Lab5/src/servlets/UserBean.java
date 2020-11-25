package servlets;

public class UserBean {
	
	 private String id;
     private String password;
     private String name;
     private String department;
     public boolean valid;
	
	
     public String getName() {
        return name;
	}

     public void setName(String newName) {
    	 name = newName;
	}

	
     public String getDepartment() {
        return department;
			}

     public void setDepartment(String newDepartment) {
    	 department = newDepartment;
			}
			

     public String getPassword() {
        return password;
	}

     public void setPassword(String newPassword) {
        password = newPassword;
	}
	
			
     public String getId() {
        return id;
			}

     public void setId(String newId) {
    	 id = newId;
			}

				
     public boolean isValid() {
        return valid;
	}

     public void setValid(boolean newValid) {
        valid = newValid;
	}	

}
