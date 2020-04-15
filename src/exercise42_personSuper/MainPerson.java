package exercise42_personSuper;

public class MainPerson {

	public static void main(String[] args) {
		Student s1 = new Student("Hafizhun Alim", "Jl. Bukudikrama, RT 06/04 No.20A",
				"Ilmu Komputer", 2017, 5000000);
		System.out.println(s1);
		
		System.out.println();
		
		Staff s2 = new Staff("Budi", "Bogor kota", "Universitas Negeri Jakarta", 3500000);
		System.out.println(s2);
	}

}
