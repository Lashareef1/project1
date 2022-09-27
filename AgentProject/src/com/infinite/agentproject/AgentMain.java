package com.infinite.agentproject;

import java.util.List;
import java.util.Scanner;

 

public class AgentMain {
	
	static Scanner sc = new Scanner(System.in);
	static AgentBAL bal = new AgentBAL();
	public static void main(String[] args) {
		int choice;
		do {
		System.out.println("O P T I O N S");
		System.out.println("__________");
		System.out.println("1.Add Agent");
		System.out.println("2.Show Agent");
		System.out.println("6 Exit");
		System.out.println("Enter your choice  ");
		choice= sc.nextInt();
		switch(choice) {
		
		case 1 :
			try {
				addAgentMain();
			} catch (AgentException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			break;
		case 2:
			showAgentMain();
			break;
			
		}
		}while(choice!=6);
	}
	
	public static void showAgentMain() {
		List<Agent>agentList = bal.showAgentBal();
		for (Agent agent : agentList) {
			System.out.println(agent);
			
		}
	}
	
	public static void addAgentMain() throws AgentException {
		Agent agent = new Agent();
		System.out.println("Enter Agent No ");
		agent.setAgentId(sc.nextInt());
		System.out.println("Enter Agent Name  ");
		agent.setFirstname(sc.next());
		System.out.println("Enter payMode(YEARLY, HALFYEARLY, QUARTERLY)");
		String pay = sc.next();
		if (pay.toUpperCase().equals("YEARLY")) {
			agent.setPaymode(PayMode.YEARLY);
		}
		if(pay.toUpperCase().equals("HALFYEARLY")) {
			agent.setPaymode(PayMode.HALFYEARLY); 
		}
		if(pay.toUpperCase().equals("QUARTERLY")) {
			agent.setPaymode(PayMode.QUARTERLY); 
		}

		


		System.out.println("Enter Premium ");
		agent.setPremium(sc.nextDouble());
		System.out.println(bal.addAgentBal(agent));
		
	}


}
