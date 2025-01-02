package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sql {

	public static void main(String[] args) {

		// 変数の準備
		Connection con = null;
		Statement stmt = null;

		try {
			// JDBCドライバのロード
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("ドライバのロードに失敗しました");
		}

		try {
			// データベース接続
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/to_do_app", "root", "Merenn1ninaru");
			con.setAutoCommit(false);

			// SQL実行準備
			stmt = con.createStatement();
			//データベース登録
			insertDate(con, stmt);

			//データベース更新
			updateDate(con, stmt);

			//データベース削除
			deleteDate(con, stmt);

			con.commit();
		} catch (SQLException e) {
			System.out.println("データベースへのアクセスでエラーが発生しました。");
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("データベースへのアクセスでエラーが発生しました。");
				}
			}
		}
	}

	private static void insertDate(Connection conection, Statement stmt) throws SQLException {
		int inscnt = 0;
		// 実行結果取得
		inscnt = stmt.executeUpdate(
				"INSERT INTO todolistapp VALUES('0001','Test0',false,'2025-01-01','2025-01-01','2025-01-01')");
		System.out.println(inscnt + "行挿入されました");
		inscnt = stmt.executeUpdate(
				"INSERT INTO todolistapp VALUES('0002','Test1',false,'2025-01-02','2025-01-01','2025-01-01')");
		System.out.println(inscnt + "行挿入されました");
	}

	private static void updateDate(Connection conection, Statement stmt) throws SQLException {
		int inscnt = 0;
		// 実行結果取得
		inscnt = stmt.executeUpdate(
				"UPDATE todolistapp SET is_completed = true where id = '1'");
		System.out.println(inscnt + "行更新されました");
		inscnt = stmt.executeUpdate(
				"UPDATE todolistapp SET due_date = '2025-01-03' where id = '2'");
		System.out.println(inscnt + "行更新されました");
	}

	private static void deleteDate(Connection conection, Statement stmt) throws SQLException {
		int inscnt = 0;
		// 実行結果取得
		inscnt = stmt.executeUpdate(
				"DELETE FROM todolistapp WHERE id = '1'");
		System.out.println(inscnt + "行削除されました");
		inscnt = stmt.executeUpdate(
				"DELETE FROM todolistapp WHERE id = '2'");
		System.out.println(inscnt + "行削除されました");
	}
}