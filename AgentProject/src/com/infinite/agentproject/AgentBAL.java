package com.infinite.agentproject;

import java.util.List;

 
public class AgentBAL {

	
	static StringBuilder sb = new StringBuilder();
	static AgentDAO dao = new AgentDAO();
	public List<Agent>showAgentBal () {
		return dao.showAgentDao();
	}
	public String addAgentBal(Agent agent) throws AgentException{
		if (isValid(agent)==false) {
			throw new AgentException(sb.toString());
			
		}
		return dao.addAgentDao(agent);
	}
	public boolean isValid(Agent  agent){
	boolean valid=true;
	if(agent.getAgentId() <=0) {
		valid=false;
		sb.append("Agent no cannt br negative or zero...\r\n");
	}
	if(agent.getAgentId() < 6 ) {
		valid=false;
		sb.append("Agent Name contain min. 5 chars..\r\n");
		
	}
	if(agent.getFirstname().length() < 4) {
		valid=false;
		sb.append("Agent firstname contains min 3 chars..\r\n");
	}
	 if(agent.getLasteName().length() < 5) {
		valid=false;
		sb.append("Agent lastname  contains min 4 chars..\r\n");
	}
	 if (agent.getPremium()<5000 || agent.getPremium()>8000) {
		 valid=false;
		 sb.append("Agent basic must be between 5000 to 8000");
	 }
	 return valid;

}
}