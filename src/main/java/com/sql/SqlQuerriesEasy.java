package com.sql;

public class SqlQuerriesEasy {
	/*sql queries
	 * 
	 * 
	 * 1. Second Highest Salary
	 * select distinct salary as SecondHighestSalary from Employee ORDER BY salary DESC limit 1 OFFSET 1;
	 * 
	 * select (select distinct 
	 *	salary from Employee 
    	 *	ORDER BY salary DESC 
    	 *	limit 1 OFFSET 1) as SecondHighestSalary;
	 * 
	 * 
	 * */

}
