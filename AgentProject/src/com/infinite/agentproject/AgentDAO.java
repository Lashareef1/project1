package com.infinite.agentproject;

import java.util.ArrayList;
import java.util.List;

 

public class AgentDAO {
	static List<Agent>agentList;
	
	static {
		agentList = new ArrayList<Agent>();
	}
	public List<Agent> showAgentDao() {
		return agentList;
		
	}
	public String addAgentDao(Agent agent) {
		agentList.add(agent);
		return "Agent Record Inserted...";
	}

}
