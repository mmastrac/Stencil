package net.stencilproject.template.servlet;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.stencilproject.template.Template;
import net.stencilproject.template.TemplateFile;
import net.stencilproject.template.TemplateMode;
import net.stencilproject.template.TemplateOptions;
import net.stencilproject.template.TemplateParserException;
import net.stencilproject.template.TemplateRootScope;

import com.google.common.collect.Maps;

/**
 * Writes a template as a web response.
 */
public abstract class TemplateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected Template template;
	protected TemplateOptions templateOptions;

	public TemplateServlet() {
	}

	@Override
	public void init() throws ServletException {
		templateOptions = getTemplateOptions();

		// If the options specify to eagerly load the template, load it now
		// before it has been requested.
		if (templateOptions.isEagerLoading()) {
			getTemplate();
		}
	}

	/**
	 * Gets the current template, reloading if
	 * {@link TemplateOptions#isDevelopmentMode()} is set.
	 */
	protected Template getTemplate() throws ServletException {
		if (template != null && !templateOptions.isDevelopmentMode()) {
			return template;
		}

		template = loadTemplate();
		return template;
	}

	/**
	 * Loads the {@link Template} from the {@link TemplateFile}.
	 */
	protected Template loadTemplate() throws ServletException {
		try {
			TemplateFile templateFile = getTemplateFile();
			if (templateFile == null) {
				throw new ServletException("No template file returned in " + getClass().getSimpleName());
			}
			return templateFile.readTemplate(getTemplateMode(), getRootScope(), getTemplateOptions());
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

	protected TemplateMode getTemplateMode() {
		return TemplateMode.HTML;
	}

	protected abstract TemplateFile getTemplateFile();

	protected TemplateOptions getTemplateOptions() {
		return new TemplateOptions();
	}

	protected String getContentType() {
		return "text/html";
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

	protected void writeTemplate(Map<String, Object> model, HttpServletRequest req, HttpServletResponse resp) throws IOException,
			ServletException {
		// Don't render for redirects
		if (resp.containsHeader("Location") || resp.isCommitted()) {
			return;
		}

		resp.setContentType(getContentType());
		resp.setCharacterEncoding("utf-8");

		getTemplate().process(model, getWriter(req, resp));
	}

	protected Writer getWriter(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		return resp.getWriter();
	}
}
