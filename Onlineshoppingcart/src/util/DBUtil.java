package util;

import java.sql.*;

public class DBUtil {
    public static void close(ResultSet rs, Statement st, Connection conn) {
        try { if (rs != null) rs.close(); } catch (Exception ignored) {}
        try { if (st != null) st.close(); } catch (Exception ignored) {}
        try { if (conn != null) conn.close(); } catch (Exception ignored) {}
    }
}
