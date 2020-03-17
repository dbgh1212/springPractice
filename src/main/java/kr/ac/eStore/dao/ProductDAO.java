package kr.ac.eStore.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.eStore.model.Product;

@Repository
public class ProductDAO {

	public JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Product> getAllProducts() {
		String query = "select * from product";
		List<Product> listArray = jdbcTemplate.query(query, new RowMapper() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product product = new Product();
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setStock(rs.getInt("stock"));
				System.out.println(product.getName());
				System.out.println(product.getPrice());
				System.out.println(product.getStock());
				return product;
			}
			
		});
		return listArray;
	}

}
