package com.infinite.agentproject;

public class Agent {
	private int agentId;
	private String firstname;
	private String lasteName;
	private PayMode paymode;
	private double premium;
	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", firstname=" + firstname + ", lasteName=" + lasteName + ", paymode="
				+ paymode + ", premium=" + premium + "]";
	}
	public Agent(int agentId, String firstname, String lasteName, PayMode paymode, double premium) {
		super();
		this.agentId = agentId;
		this.firstname = firstname;
		this.lasteName = lasteName;
		this.paymode = paymode;
		this.premium = premium;
	}
	public Agent() {
		// TODO Auto-generated constructor stub
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLasteName() {
		return lasteName;
	}
	public void setLasteName(String lasteName) {
		this.lasteName = lasteName;
	}
	public PayMode getPaymode() {
		return paymode;
	}
	public void setPaymode(PayMode paymode) {
		this.paymode = paymode;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	

}
