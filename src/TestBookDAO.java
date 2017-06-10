


import java.sql.SQLException;



public class TestBookDAO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		BookDAO dao = new BookDAO();

		Book book = new Book();

		book.setIsbn(103);
		book.setTitle("Java");
		book.setAuthor("gfsd");
		book.setPublishdate("14-mar-17");
		book.setContent("hiwehfybhceb");
		book.setPrice(450);	
		book.setStatus("draft");

		dao.add(book);
		// dao.modify(employee);

		// dao.remove(101);
		dao.listAll();

	}

}
