package oo.test;

public class PhoneMember extends Member{
    String phone;
    boolean verified = false;
    
    //示範--第1種解決方法
    public PhoneMember(String name){
    	super(name);
    }
    
    //建立空的建構子(PhoneMember&Member都要加)-第2種解決方法
    public PhoneMember(){
    	super();
    }
    
    
    public String getPhone(){
    	return phone;
    }
    public void setPhone(String phone){
    	this.phone = phone;
    }
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
    
}
