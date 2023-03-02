package com.liferay.bms.student.web.portlet;

import com.liferay.bms.student.model.Student;
import com.liferay.bms.student.service.StudentLocalService;
import com.liferay.bms.student.web.constants.StudentPortletKeys;
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
		"javax.portlet.display-name=Student",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + StudentPortletKeys.STUDENT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class StudentPortlet extends MVCPortlet {
	
private Log log = LogFactoryUtil.getLog(this.getClass().getName());
	
	@Reference
	CounterLocalService counterLocalService;
	
	@Reference
	StudentLocalService studentLocalService;
	
	@ProcessAction(name="addStudent")
	public void addStudent(ActionRequest actionRequest,ActionResponse actionResponse) {
        long rollNo = counterLocalService.increment(Student.class.getName());
        String name = ParamUtil.getString(actionRequest, "name");
        String branch = ParamUtil.getString(actionRequest, "branch");
        String email = ParamUtil.getString(actionRequest, "email");
        String mobile = ParamUtil.getString(actionRequest, "mobile");
            
        Student student = studentLocalService.createStudent(rollNo);
        student.setRollNo(rollNo);
        student.setName(name);
        student.setBranch(branch);
        student.setEmail(email);
        student.setMobile(mobile);
        
        studentLocalService.addStudent(student);
    }
 
    @Override
    public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
        List<Student> studentList = studentLocalService.getStudents(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
        renderRequest.setAttribute("studentList", studentList);        
        super.render(renderRequest, renderResponse);
    }
    
    @ProcessAction(name = "updateStudent")
    public void updateStudent(ActionRequest actionRequest,  ActionResponse actionResponse) {
        long rollNo = ParamUtil.getLong(actionRequest,"rollNo", GetterUtil.DEFAULT_LONG);
        String name = ParamUtil.getString(actionRequest, "name", GetterUtil.DEFAULT_STRING);
        String branch = ParamUtil.getString(actionRequest, "branch", GetterUtil.DEFAULT_STRING);
        String email = ParamUtil.getString(actionRequest, "email", GetterUtil.DEFAULT_STRING);
        String mobile = ParamUtil.getString(actionRequest, "mobile", GetterUtil.DEFAULT_STRING);
        
        Student student = null;
        try {
            student = studentLocalService.getStudent(rollNo);
        } catch (Exception e) {
            log.error(e.getCause(), e);
        }
 
        if(Validator.isNotNull(student)) {
        	student.setName(name);
        	student.setBranch(branch);
        	student.setEmail(email);
        	student.setMobile(mobile);
        	studentLocalService.updateStudent(student);
        }
    }
 
    @ProcessAction(name = "deleteStudent")
    public void deleteStudent(ActionRequest actionRequest, ActionResponse actionResponse){
        long rollNo = ParamUtil.getLong(actionRequest, "rollNo", GetterUtil.DEFAULT_LONG);
        try {
        	studentLocalService.deleteStudent(rollNo);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

 
}