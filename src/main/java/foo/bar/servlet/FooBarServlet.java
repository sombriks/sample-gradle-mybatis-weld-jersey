package foo.bar.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.cdi.Mapper;

import foo.bar.mapper.ClienteMapper;

/**
 * Servlet implementation class FooBarServlet
 */
@WebServlet("/foo")
public class FooBarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	@Mapper
	ClienteMapper userMapper;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().write("" + userMapper);
	}

}
