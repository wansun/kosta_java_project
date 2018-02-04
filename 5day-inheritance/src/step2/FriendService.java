package step2;

public class FriendService {
	public void printAllFriendInfo(Friend[] f) {
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i].getName()+" "+f[i].getAge()+" "+f[i].getAddress());
		}
	}

	public void printFriendByAddress(Friend[] f, String address) {
		for(int i=0;i<f.length;i++) {
			if(address.equals(f[i].getAddress())) {
			System.out.println(f[i].getName()+" "+f[i].getAge()+" "+f[i].getAddress());
		 }//if
	  }//for		
	}//method
}//class
