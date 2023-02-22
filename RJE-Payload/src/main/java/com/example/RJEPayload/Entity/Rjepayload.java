package com.example.RJEPayload.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "rje_payload")
public class Rjepayload {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="rje_payld_id",length = 19)
	private int rjePayldId;

	@NotNull
	@Column(name = "msg_mast_id")
	private int msgMastId;

	@NotNull
	@Column(name = "creation_date")
	private Date creationDate;

	@NotNull
	@Column(name = "rje_blk1",length = 50)
	private String rjeBlk1;

	@NotNull
	@Column(name = "rje_blk2",length =150)
	private String rjeBlk2;

	@Column(name = "rje_blk3",length = 150)
	private String rjeBlk3;

	
	@Column(name = "rje_blk4",columnDefinition="CLOB NOT NULL")
	@Lob
	private String rjeBlk4;

	@Column(name = "rje_blk5",length = 150)
	private String rjeBlk5;

	public int getRjePayldId() {
		return rjePayldId;
	}

	public void setRjePayldId(int rjePayldId) {
		this.rjePayldId = rjePayldId;
	}

	public int getMsgMastId() {
		return msgMastId;
	}

	public void setMsgMastId(int msgMastId) {
		this.msgMastId = msgMastId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getRjeBlk1() {
		return rjeBlk1;
	}

	public void setRjeBlk1(String rjeBlk1) {
		this.rjeBlk1 = rjeBlk1;
	}

	public String getRjeBlk2() {
		return rjeBlk2;
	}

	public void setRjeBlk2(String rjeBlk2) {
		this.rjeBlk2 = rjeBlk2;
	}

	public String getRjeBlk3() {
		return rjeBlk3;
	}

	public void setRjeBlk3(String rjeBlk3) {
		this.rjeBlk3 = rjeBlk3;
	}

	public String getRjeBlk4() {
		return rjeBlk4;
	}

	public void setRjeBlk4(String rjeBlk4) {
		this.rjeBlk4 = rjeBlk4;
	}

	public String getRjeBlk5() {
		return rjeBlk5;
	}

	public void setRjeBlk5(String rjeBlk5) {
		this.rjeBlk5 = rjeBlk5;
	}

}
