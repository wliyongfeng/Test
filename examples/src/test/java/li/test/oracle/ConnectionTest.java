package li.test.oracle;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConnectionTest {
    private final static String DB_URL = "jdbc:oracle:thin:@172.26.131.144:1521:clm";
//    private final static String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private final static String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
//    private final static String DB_USERNAME = "liyongfeng";
//    private final static String DB_PASSWORD = "Liyongfeng1985";
    private final static String DB_USERNAME = "lms";
    private final static String DB_PASSWORD = "lms";
    private Connection conn = null;

    @Before
    public void setUp() {
        try {
            /** 使用Class.forName()方法自动创建这个驱动程序的实例且自动调用DriverManager来注册它 */
            Class.forName(DB_DRIVER);
            /** 通过DriverManager的getConnection()方法获取数据库连接 */
            conn = DriverManager
                    .getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @After
    public void cleanUp() throws Exception{
        if (conn != null) {
            if (!conn.isClosed()) {
                conn.close();
            }
        }
    }

    @Test
    public void testConn() {

    }
}
