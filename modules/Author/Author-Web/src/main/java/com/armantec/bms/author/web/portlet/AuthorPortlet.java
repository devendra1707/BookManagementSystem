package com.armantec.bms.author.web.portlet;

import com.armantec.bms.author.model.Author;
import com.armantec.bms.author.service.AuthorLocalService;
import com.armantec.bms.author.web.constants.AuthorPortletKeys;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Devendra
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.bms",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Author",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view1.jsp",
		"javax.portlet.name=" + AuthorPortletKeys.AUTHOR,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AuthorPortlet extends MVCPortlet {
	private Log log = LogFactoryUtil.getLog(this.getClass().getName());
	
	@Reference
	CounterLocalService counterLocalService;
	
	@Reference
	AuthorLocalService authorLocalService;
	
	@ProcessAction(name="addAuthor")
	public void addAuthor(ActionRequest actionRequest,ActionResponse actionResponse) {
        long authorId = counterLocalService.increment(Author.class.getName());
        String id = ParamUtil.getString(actionRequest, "id");
        String name = ParamUtil.getString(actionRequest, "name");
        String authorBook = ParamUtil.getString(actionRequest, "authorBook");
        
    
        Author author = authorLocalService.createAuthor(authorId);
        author.setAuthorId(authorId);
        author.setId(id);
        author.setName(name);
        author.setAuthorBook(authorBook);
        
        authorLocalService.addAuthor(author);
    }
 
    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
        List<Author> authorList = authorLocalService.getAuthors(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
        renderRequest.setAttribute("authorList", authorList);        
        super.render(renderRequest, renderResponse);
    }
    /*
    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
        List<Author> AuthorList = appointmentLocalService.getAppointments(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
        renderRequest.setAttribute("appointmentList", appointmentList);        
        super.render(renderRequest, renderResponse);
    }
    */
    @ProcessAction(name = "updateAuthor")
    public void updateAuthor(ActionRequest actionRequest,  ActionResponse actionResponse) {
        long authorId = ParamUtil.getLong(actionRequest,"authorId", GetterUtil.DEFAULT_LONG);
        String id = ParamUtil.getString(actionRequest, "id", GetterUtil.DEFAULT_STRING);
        String name = ParamUtil.getString(actionRequest, "name", GetterUtil.DEFAULT_STRING);
        String authorBook = ParamUtil.getString(actionRequest, "authorBook", GetterUtil.DEFAULT_STRING);
        
        Author author = null;
        try {
        	author = authorLocalService.getAuthor(authorId);
        } catch (Exception e) {
            log.error(e.getCause(), e);
        }
 
        if(Validator.isNotNull(author)) {
        	author.setId(id);
        	author.setName(name);
        	author.setAuthorBook(authorBook);
        	authorLocalService.updateAuthor(author);
        }
    }
 
    @ProcessAction(name = "deleteAuthor")
    public void deleteAuthor(ActionRequest actionRequest, ActionResponse actionResponse){
        long authorId = ParamUtil.getLong(actionRequest, "authorId", GetterUtil.DEFAULT_LONG);
        try {
            authorLocalService.deleteAuthor(authorId);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }
}