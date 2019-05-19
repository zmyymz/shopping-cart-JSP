package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.tomcat.jni.Proc;
//import java.sql.*;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.sun.org.apache.regexp.internal.recompile;

import entity.Product;
import jdk.internal.org.objectweb.asm.commons.StaticInitMerger;

//操作产品的实现类
public class ProductDaoImp {
	/* 作用,按照条件查询产品 */
	public ArrayList findAll() {

		ArrayList list = new ArrayList();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 1.打开数据库连接
			conn = BaseDao.getConnection();

			// 2.创建执行sql语句对象
			stmt = conn.createStatement();

			// 3.发送sql语句到mysql
			String sql = "select * from product";
			rs = stmt.executeQuery(sql);
			// rs结果集--->遍历--->封装product--->放入ArrayList
			
			while (rs.next())// 循环一次只代表一行
			{
				Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setImg(rs.getString("img"));
				p.setDesc(rs.getString("desc"));
				p.setNum(rs.getInt("num"));
				p.setPrice(rs.getDouble("price"));
				System.out.println(p.getName());
				list.add(p);
			}
			// 4.
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(conn, (com.mysql.jdbc.Statement) stmt, rs);
		}
		return list;
	}
	
	public Product findById(int id) {

		//ArrayList list = new ArrayList();
		Product p = new Product();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 1.打开数据库连接
			conn = BaseDao.getConnection();

			// 2.创建执行sql语句对象
			stmt = conn.createStatement();

			// 3.发送sql语句到mysql
			String sql = "select * from product where id =" + id;
			rs = stmt.executeQuery(sql);
			// rs结果集--->遍历--->封装product--->放入ArrayList
			
			while (rs.next())// 循环一次只代表一行
			{
				//Product p = new Product();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setImg(rs.getString("img"));
				p.setDesc(rs.getString("desc"));
				p.setNum(rs.getInt("num"));
				p.setPrice(rs.getDouble("price"));
				//System.out.println(p.getName());
				//list.add(p);
			}
			// 4.
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			BaseDao.closeAll(conn, (com.mysql.jdbc.Statement) stmt, rs);
		}
		return p;
	}
//	public static void main(String[] args)throws Throwable{
//		new ProductDaoImp().findAll();
//	}

}
