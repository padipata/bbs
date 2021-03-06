/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package bbs.struts.form;

import org.apache.struts.action.ActionForm;

import bbs.entity.*;

public class TipForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	
	private Board board = null;
	private Topic topic = null;
	private Reply reply = null;
	private Integer page = 1;
	private Integer pageCount = 1;
	private int replyId;
	private int topicId;
	
	public TipForm() {
		super();
		if(this.board == null) this.board = new Board(); //�����ʼ��
		if(this.topic == null) this.topic = new Topic();
		if(this.reply == null) this.reply = new Reply();
	}
	
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public Reply getReply() {
		return reply;
	}
	public void setReply(Reply reply) {
		this.reply = reply;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	
	
	
	
}