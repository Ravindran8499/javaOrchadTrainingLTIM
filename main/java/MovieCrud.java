package src.main.java;
import java.sql.*;
import java.util.*;

public class MovieCrud
{
    public static void insertData(Connection con,MovieBean m) throws SQLException{
        PreparedStatement ps = con.prepareStatement("insert into movies(movieID,movieName,movieReleasedYear) values(?,?,?)");
        ps.setInt(1,m.movieid);
        ps.setString(2,m.moviename);
        ps.setString(3,m.moviereleasedyear);
        ps.executeUpdate();
    }
    
    public static void searchMovieByYear(Connection con,String movieYearToSort){
        try{
        PreparedStatement ps = con.prepareStatement("select * from MovieTicket where movieReleasedYear = ?");
        ps.setString(1,movieYearToSort);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println("------------------------");
            System.out.println(rs.getString("movieid"));
            System.out.println(rs.getString("moviename"));
            System.out.println(rs.getString("moviereleasedyear"));
            System.out.println("------------------------");
        }
        }catch(SQLException s){
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practiselabday5","root","root");
            boolean isTrue = true;
            while(isTrue){
        System.out.println("1-> Insert Data");
        System.out.println("2-> Search By Year");
        System.out.println("3-> Exit");
        int choice = sc.nextInt();
        if(choice==1){
        System.out.println("Enter Movie ID");
        int movieID = sc.nextInt();
        System.out.println("Enter Movie Name");
        String movieName = sc.next();
        System.out.println("Enter Movie Release Year");
        String moviereleaseYear = sc.next();
        MovieBean m = new MovieBean(movieID,movieName,moviereleaseYear);
            insertData(con,m);
        }
        else if(choice==2){
            System.out.println("Enter the Movie Year to Sort");
            String movieYearToSort = sc.next();
            searchMovieByYear(con,movieYearToSort);
        }else if(choice==3){
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

