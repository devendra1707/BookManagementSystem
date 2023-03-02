package com.armantec.bms.book.web.portlet;

import com.armantec.bms.book.model.book;
import com.armantec.bms.book.service.bookLocalService;
import com.armantec.bms.book.web.constants.bookwebPortletKeys;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;

import java.awt.print.Book;
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
 * @author devendra
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.bms",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=bookweb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + bookwebPortletKeys.BOOKWEB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class bookwebPortlet extends MVCPortlet {
	
	private Log log = LogFactoryUtil.getLog(this.getClass().getName());
	
	@Reference
	CounterLocalService counterLocalService;
	
	@Reference
	bookLocalService bookLocalService;
	
	@ProcessAction(name="addBook")
	public void addBook(ActionRequest actionRequest,ActionResponse actionResponse) {
        long bookId = counterLocalService.increment(Book.class.getName());
        String name = ParamUtil.getString(actionRequest, "name");
        String author = ParamUtil.getString(actionRequest, "author");
        String date = ParamUtil.getString(actionRequest, "date");
        
    
        book book = bookLocalService.createbook(bookId);
        book.setBookId(bookId);
        book.setName(name);
        book.setAuthor(author);
        book.setDate(date);
        
        bookLocalService.addbook(book);
    }
 
    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
        List<book> bookList = bookLocalService.getbooks(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
        renderRequest.setAttribute("bookList", bookList);        
        super.render(renderRequest, renderResponse);
    }
    
    @ProcessAction(name = "updateBook")
    public void updateBook(ActionRequest actionRequest,  ActionResponse actionResponse) {
        long bookId = ParamUtil.getLong(actionRequest,"bookId", GetterUtil.DEFAULT_LONG);
        String name = ParamUtil.getString(actionRequest, "name", GetterUtil.DEFAULT_STRING);
        String author = ParamUtil.getString(actionRequest, "author", GetterUtil.DEFAULT_STRING);
        String date = ParamUtil.getString(actionRequest, "date", GetterUtil.DEFAULT_STRING);
        
        book book = null;
        try {
            book = bookLocalService.getbook(bookId);
        } catch (Exception e) {
            log.error(e.getCause(), e);
        }
 
        if(Validator.isNotNull(book)) {
        	book.setName(name);
        	book.setAuthor(author);
        	book.setDate(date);
        	bookLocalService.updatebook(book);
        }
    }
 
    @ProcessAction(name = "deleteBook")
    public void deleteBook(ActionRequest actionRequest, ActionResponse actionResponse){
        long bookId = ParamUtil.getLong(actionRequest, "bookId", GetterUtil.DEFAULT_LONG);
        try {
            bookLocalService.deletebook(bookId);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

}