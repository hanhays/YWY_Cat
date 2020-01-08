package t.depart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DepartDAO {
	private final String DRIVER="oracle.jdbc.driver.OracleDriver";
	private final String URL="jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER="ca";
	private final String PASSWORD="ca";
	
	public DepartDAO() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/** List Start **/
	public ArrayList<DepartDTO> departList() throws Exception {
		ArrayList<DepartDTO> list = new ArrayList<DepartDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select * from depart";
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int did = rs.getInt("did");
				String dname = rs.getString("dname");
				DepartDTO ddto = new DepartDTO(did, dname);
				list.add(ddto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}
	
	/** List End **/

	/** Read Start **/
	public String  getDname(int target) {
		String str="";
		String sql = "select dname from depart where did=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,target);
			rs=pstmt.executeQuery();
			str=rs.next()?rs.getString("dname"):"망함";
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return str;
	}
	/** Read End **/
	
	/** Create Start **/
	
	/** Create End**/
	
	/** Update Start **/
	public void Departupdate(String dname,int target) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update depart set dname ?, where did = ?";
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dname);
			pstmt.setInt(2, target);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	/** Update End **/
	
	/** Delete Start **/
	
	/** Delete End **/
	
}