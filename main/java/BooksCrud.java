package src.main.java;
import java.io.*;
import java.sql.*;
import java.util.*;

public class BooksCrud {
    public static void insertData(Connection con,BooksBean b) throws SQLException{
        PreparedStatement ps = con.prepareStatement("insert into books(bookid,bookname,bookreleasedate,bookauthor) values(?,?,?,?)");
        ps.setInt(1,b.bookid);
        ps.setString(2,b.bookname);
        ps.setString(3,b.bookreleasedate);
        ps.setInt(4, b.bookauthor);
        ps.executeUpdate();
    }
    
    public static void searchBookByName(Connection con,String bookNameToSearch)throws SQLException{
        PreparedStatement ps = con.prepareStatement("select b.bookid,b.bookname,b.bookreleasedate,b.bookauthor,a.authorname from books b join author a on b.bookauthor = a.authorid where b.bookname LIKE ?;");
        ps.setString(1,bookNameToSearch);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println("------------------------");
            System.out.println("Book ID: "+rs.getString("bookid"));
            System.out.println("Book Name: "+rs.getString("bookname"));
            System.out.println("Book Release Date: "+rs.getString("bookreleasedate"));
            System.out.println("Book Author ID: "+rs.getInt("bookauthor"));
            System.out.println("Book Author Name: "+rs.getString("authorname"));
            System.out.println("------------------------");
        }
    }

    public static void showBooks(Connection con) throws SQLException{
        PreparedStatement ps = con.prepareStatement("select * from books");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println("------------------------");
            System.out.println("Book ID: "+rs.getString("bookid"));
            System.out.println("Book Name: "+rs.getString("bookname"));
            System.out.println("Book Release Date: "+rs.getString("bookreleasedate"));
            System.out.println("Book Author ID: "+rs.getInt("bookauthor"));
            System.out.println("------------------------");
        }
    }

    public static void showAuthors(Connection con) throws SQLException{
        PreparedStatement ps = con.prepareStatement("select * from author");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println("------------------------");
            System.out.println("Author ID: "+rs.getInt("authorid"));
            System.out.println("Author Name: "+rs.getString("authorname"));
            System.out.println("------------------------");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiselabday6","root","root");
            boolean isTrue = true;
            while(isTrue){
        System.out.println("1-> Insert Data");
        System.out.println("2-> Search By Book Name");
        System.out.println("3-> Show Available Books");
        System.out.println("4 -> Show Authors");
        System.out.println("5-> Exit");
        int choice = sc.nextInt();
        if(choice==1){
        System.out.println("Enter Book ID");
        int bookID = sc.nextInt();
        System.out.println("Enter Book Name");
        String bookName = sc.next();
        System.out.println("Enter Book Release Date");
        String bookReleaseDate = sc.next();
        System.out.println("Enter Author ID");
        int bookAuthor = sc.nextInt();
        BooksBean b = new BooksBean(bookID,bookName,bookReleaseDate,bookAuthor);
            insertData(con,b);
        }
        else if(choice==2){
            System.out.println("Enter the BookName to Search");
            String bookNameToSearch = sc.next();
            searchBookByName(con,bookNameToSearch);
        }else if(choice==3){
            showBooks(con);
        }else if(choice==4){
            showAuthors(con);
        }else if(choice==5){
            isTrue = false;
        }
    }
    }catch(ClassNotFoundException c){
        System.out.println(c);
    }catch(SQLException s){
        System.out.println(s);
    }
    }
}
