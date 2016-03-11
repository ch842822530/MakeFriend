package cn.itcast.maven;

public class MakeFriend {

	public String MakeFriend(String name){
		
		HelloFriend friend = new HelloFriend();
		friend.sayHelloToFriend("wangwu");	
		String str = "Hey,"+friend.getMyName()+" make a friend please.";
		System.out.println(str);
		return str;
	}
}
