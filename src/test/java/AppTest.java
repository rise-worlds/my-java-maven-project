
import com.zaxxer.hikari.HikariConfig;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class AppTest {

    @Test
    public void testMain() throws SQLException {
        {
            // 创建模拟的数据源和连接
            HikariConfig config = new HikariConfig();
            try (FileInputStream input = new FileInputStream("config/hikari.properties")) {
                Properties properties = new Properties();
                properties.load(input);
                config.setDataSourceProperties(properties);
            } catch (IOException e) {
                e.printStackTrace();
            }
            assertNotNull(config.getDataSourceProperties());
        }
        {
            HikariConfig config = new HikariConfig("config/hikari.properties");
            assertNotNull(config.getDataSourceProperties());
        }
    }

}