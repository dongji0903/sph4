package com.sphinx.korigin.study.study.web.quiz;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sphinx.korigin.study.study.domain.answer.Answer;
import com.sphinx.korigin.study.study.domain.question.Question;

@Controller
public class SetQuizController {

	/*
	 * TestSheetService ts = new TestSheetServiceImpl(); AnswerSheetService as = new
	 * AnswerSheetServiceImpl(); StudyCategoryDao cd = new
	 * StudyCategoryDaojdbcImpl(); CategoryService cs = new CategoryServiceImpl();
	 */

	@RequestMapping()
	public String setQuiz(Model m, @RequestParam("hiddenCategory") String catgoryId,
			@RequestParam("numOfQuestion") int totalCount) {
		
		List<Question> questionList = new ArrayList<Question>();
		List<Answer> answerList = new ArrayList<>();

		return null;

	}

	/*
	 * @Override public String execute(HttpServletRequest request,
	 * HttpServletResponse response) { HttpSession session = request.getSession();
	 * 
	 * String catgoryId = request.getParameter("hiddenCategory");
	 * 
	 * int totalCount = Integer .parseInt(request.getParameter("numOfQuestion"));
	 * 
	 * 
	 * List<Question> questionList = new ArrayList<Question>(); List<Answer>
	 * answerList = new ArrayList<>();
	 * 
	 * session.setAttribute("myAnswers", answerList); // ���ǿ� �� ��� ����Ʈ ��� ������ ī�װ���
	 * ������ �ҷ���. ���� �ʰ��� null questionList = ts.findQuestionsOfCategory( new
	 * ShoppingCategory(catgoryId, null, null), 20); System.out.println(catgoryId);
	 * session.setAttribute("questions", questionList); // ���� ����Ʈ ����
	 * request.setAttribute("question", questionList.get(0));
	 * session.setAttribute("totalNumOfQuestion", 20);
	 * session.setAttribute("questionNum", 0); // ���� ������ȣ:0(������ ����)
	 * request.setAttribute("hp", 100); request.setAttribute("bossHP", 5);
	 * 
	 * return getNextPage(); }
	 */
}
