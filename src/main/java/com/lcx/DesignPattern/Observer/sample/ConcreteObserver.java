package com.lcx.DesignPattern.Observer.sample;

public class ConcreteObserver extends Observer {

	private String name;
	private String observerState;
	private ConcreteSubject subject;
	
	public ConcreteObserver() {}
	
	public ConcreteObserver(String name, ConcreteSubject subject) {
		this.name = name;
		this.subject = subject;
	}
	@Override
	public void update() {
		observerState = subject.getSubjectState();
		System.out.println("观察者" + name + "的状态是" + observerState);
	}

}
