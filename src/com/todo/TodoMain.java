package com.todo;

import com.todo.dao.TodoList;
import com.todo.menu.Menu;
import com.todo.service.TodoUtil;

public class TodoMain {
	
	public static void start() {

		TodoList l = new TodoList();

		Menu.displaymenu();
		Menu.prompt(l);
	}
}
