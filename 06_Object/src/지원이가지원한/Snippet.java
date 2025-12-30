package 지원이가지원한;

public class Snippet {
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User("하이루");
		User u3 = new User("안뇽",30,'m');
		System.out.println(u3.getAge());
		System.out.println(u3.getGender());
		System.out.println(u3.getUser());
	}
}

