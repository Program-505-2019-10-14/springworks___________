package com.biz.rbooks.repository;

import org.apache.ibatis.jdbc.SQL;

public class BooksSQL {
	
	public String insert_sql() {
		
		return new SQL() {{
			
			INSERT_INTO("tbl_books");
			
			INTO_COLUMNS("B_CODE");
			INTO_COLUMNS("B_NAME");
			INTO_COLUMNS("B_COMP");
			INTO_COLUMNS("B_AUTHER");
			INTO_COLUMNS("B_TRANS");
			INTO_COLUMNS("B_PAGE");
			INTO_COLUMNS("B_YEAR");
			INTO_COLUMNS("B_IPRICE");
			
			INTO_VALUES("#{b_code, jdbcType=VARCHAR}");
			INTO_VALUES("#{b_name, jdbcType=VARCHAR}");
			INTO_VALUES("#{b_comp, jdbcType=VARCHAR}");
			INTO_VALUES("#{b_auther, jdbcType=VARCHAR}");
			INTO_VALUES("#{b_trans, jdbcType=VARCHAR}");
			INTO_VALUES("#{b_page, jdbcType=VARCHAR}");
			INTO_VALUES("#{b_year, jdbcType=VARCHAR}");
			INTO_VALUES("#{b_iprice, jdbcType=VARCHAR}");
			
		}}.toString();
		
	
	}
	
	
	public String update_sql() {
		
		return new SQL() {{
			
			UPDATE("tbl_books");
			
			WHERE("b_code = #{b_code, jdbcType = VARCHAR}");
			
			SET("b_name = #{b_name, jdbcType = VARCHAR}");
			SET("b_comp = #{b_comp, jdbcType = VARCHAR}");
			SET("b_auther = #{b_auther, jdbcType = VARCHAR}");
			SET("b_trans = #{b_trans, jdbcType = VARCHAR}");
			SET("b_page = #{b_page, jdbcType = VARCHAR}");
			SET("b_year = #{b_year, jdbcType = VARCHAR}");
			SET("b_iprice = #{b_iprice, jdbcType = VARCHAR}");

			
		}}.toString();
		
		
		
		
	}
	
	

}
