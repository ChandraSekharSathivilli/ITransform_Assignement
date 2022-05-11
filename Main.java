import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library libararyobj= new Library();
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i==0) {
		System.out.println("1.Add Member");
		System.out.println("2.View All Member");
		System.out.println("3.Search Member by address");
		System.out.println("4.Exit");
		System.out.println("Enter your choice :");
		int n=Integer.parseInt(sc.nextLine());
		if(n==1) {
			Member memberobj=new Member();
			System.out.println("Enter the id: ");
			memberobj.setMemberId(Integer.parseInt(sc.nextLine()));
			System.out.println("Enter your name:");
			memberobj.setMemberName(sc.nextLine());
			System.out.println("Enter the address:");
			memberobj.setAddress(sc.nextLine());
			libararyobj.addMember(memberobj);
		}
		if(n==2) {
			List<Member> obj=libararyobj.viewAllMembers();
			for(Member o:obj) {
				System.out.println("Id: "+o.getMemberId());
				System.out.println("Name: "+o.getMemberName());
				System.out.println("Address: "+o.getAddress());
			}
		}
		if(n==3) {
			System.out.println("Enter the address");
			List<Member> obj1=libararyobj.viewMemberByAdress(sc.nextLine());
			for(Member o:obj1) {
				System.out.println("Id: "+o.getMemberId());
				System.out.println("Name: "+o.getMemberName());
				System.out.println("Address: "+o.getAddress());	
			}
		}
		if(n==4) {
			System.exit(0);
		}
		

	}
	}
}
