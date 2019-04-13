
public class ClassePrincipal {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Helvécio",19,"M");
		Pessoa p2 = new Pessoa("Vanessa",19,"F");
		
		Livro l1 = new Livro("Spider-Man","Stan Lee",87,p1);
		Livro l2 = new Livro("Taokey","Bozo",167,p2);
		Livro l3 = new Livro("Java.com","JKF",358,p1);
		
		l1.abrir();
		l1.folhear(0);
		//l1.avancarPag();
		l1.voltarPag();
		l1.voltarPag();
		System.out.println(l1.detalhes());
		
		System.out.println("-----------------------");
		
		l2.abrir();
		l2.folhear(102);
		System.out.println(l2.detalhes());
	}
}
