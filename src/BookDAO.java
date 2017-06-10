


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BookDAO {

	private static Connection connnection = ConnectionUtil.getConnection();

	public void add(Book book) throws ClassNotFoundException, SQLException {
		String sql = "insert into BOOK(ISBN ,TITLE, AUTHOR,PUBLISHDATE ,CONTENT,PRICE ,STATUS) values(?,?,?,?,?,?,?)";
		PreparedStatement pst = connnection.prepareStatement(sql);
		pst.setInt(1, book.getIsbn());
		pst.setString(2, book.getTitle());
		pst.setString(3, book.getAuthor());
		pst.setString(4, book.getPublishdate());
		pst.setString(5, book.getContent());
		pst.setInt(6, book.getPrice());
		int rows = pst.executeUpdate();
		System.out.println("Number of Rows Inserted : " + rows);
	}

	/*public void modify(Em employee) throws ClassNotFoundException, SQLException {

		String sql = "update EMPLOYEE set NAME=? where ID=?";
		PreparedStatement pst = connnection.prepareStatement(sql);
		pst.setString(1, employee.getName());
		pst.setInt(2, employee.getId());
		int rows = pst.executeUpdate();
		System.out.println("Number of Rows Updated : " + rows);
	}

	public void remove(int id) throws ClassNotFoundException, SQLException {

		String sql = "delete from EMPLOYEE where ID=?";
		PreparedStatement pst = connnection.prepareStatement(sql);
		pst.setInt(1, id);
		int rows = pst.executeUpdate();
		System.out.println("Number of Rows Deleted : " + rows);
	}*/

	public void listAll() throws SQLException {
		String sql = "select * from EMPLOYEE";
		PreparedStatement pst = connnection.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();

		while (rs.next()) {
			Book book = new Book();
			book.setIsbn(rs.getInt("ISBN"));
			book.setTitle(rs.getString("TITLE"));
			book.setAuthor(rs.getString("AUTHOR"));
			book.setPublishdate(rs.getString("PUBLISHDATE"));
			book.setContent(rs.getString("CONTENT"));
			book.setPrice(rs.getInt("PRICE"));
			System.out.println(book);
		}

	}

}