package foo.bar;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryProvider {

	@Produces
	@ApplicationScoped
	public SqlSessionFactory produceFactory() {
		SqlSessionFactory factory = new SqlSessionFactoryBuilder()
				.build(this.getClass().getResourceAsStream("mybatis-config.xml"));
		return factory;
	}

}
