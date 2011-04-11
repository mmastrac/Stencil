package net.stencilproject.template.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.stencilproject.template.Template;
import net.stencilproject.template.TemplateFactory;
import net.stencilproject.template.TemplateOptions;
import net.stencilproject.template.TemplateParserException;
import net.stencilproject.template.TemplateRootScope;
import net.stencilproject.template.TemplateSource;

import com.google.common.collect.Maps;

/**
 * Writes a template as a web response.
 */
public abstract class TemplateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected Template template;

	protected TemplateFactory templateFactory;

	public TemplateServlet() {
	}

	@Override
	public void init() throws ServletException {
		templateFactory = getTemplateFactory();
		try {
			TemplateSource templateSource = getTemplateSource();
			if (templateSource == null) {
				throw new ServletException("No template source returned in " + getClass().getSimpleName());
			}
			template = templateFactory.parse(templateSource, getRootScope());
		} catch (TemplateParserException e) {
			log("Error parsing template", e);
			throw new ServletException(e);
		} catch (IOException e) {
			log("Error reading template", e);
			throw new ServletException(e);
		}
	}

	protected TemplateRootScope getRootScope() {
		return null;
	}

	protected abstract TemplateSource getTemplateSource();

	protected TemplateFactory getTemplateFactory() {
		return new TemplateFactory(getTemplateOptions());
	}

	protected TemplateOptions getTemplateOptions() {
		return new TemplateOptions();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, Object> model = createModel(req, resp);
		doGet(model, req, resp);
		writeTemplate(model, req, resp);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, Object> model = createModel(req, resp);
		doDelete(model, req, resp);
		writeTemplate(model, req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, Object> model = createModel(req, resp);
		doPost(model, req, resp);
		writeTemplate(model, req, resp);
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, Object> model = createModel(req, resp);
		doPut(model, req, resp);
		writeTemplate(model, req, resp);
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Passes HEAD to GET by default
		super.doHead(req, resp);
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Default handling of OPTIONS
		super.doOptions(req, resp);
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Default handling of TRACE
		super.doTrace(req, resp);
	}

	/**
	 * Creates the base model for the request/response.
	 */
	protected Map<String, Object> createModel(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		return Maps.newHashMap();
	}

	protected void doGet(Map<String, Object> model, HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// Sends "method not implemented" by default
		super.doGet(req, resp);
	}

	protected void doDelete(Map<String, Object> model, HttpServletRequest req, HttpServletResponse resp) throws IOException,
			ServletException {
		// Sends "method not implemented" by default
		super.doDelete(req, resp);
	}

	protected void doPost(Map<String, Object> model, HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// Sends "method not implemented" by default
		super.doPost(req, resp);
	}

	protected void doPut(Map<String, Object> model, HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		// Sends "method not implemented" by default
		super.doPut(req, resp);
	}

	protected void writeTemplate(Map<String, Object> model, HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// Don't render for redirects
		if (resp.containsHeader("Location")) {
			return;
		}

		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");

		template.process(model, getWriter(req, resp));
	}

	protected PrintWriter getWriter(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		return resp.getWriter();
	}
}
