import java.util.ArrayList;

import java.util.List;

public class Library {
	List<Member> memberlist=new ArrayList<Member>();

	public List<Member> getMemberlist() {
		return memberlist;
	}

	public void setMemberlist(List<Member> memberlist) {
		this.memberlist = memberlist;
	}
	public void addMember(Member memberobj) {
		memberlist.add(memberobj);
		
	}
	public List<Member> viewAllMembers(){
		return memberlist;
		
	}
	public List<Member> viewMemberByAdress(String address ){
		List<Member> memberlist=new ArrayList<Member>();
		for(Member obj:memberlist) {
			if(obj.getAddress().equalsIgnoreCase(address)) {
				memberlist.add(obj);
			}
		}
		return memberlist;
		
		
	}

}
