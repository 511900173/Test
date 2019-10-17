package Project;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


/*
 * 简易计算器案例
 */
public class Counter {
	// 程序主类
	public static void main(String[] args) {
		// 创建窗体
		MyFrame frame = new MyFrame();
		
		// 设置窗体关闭  虚拟机也关闭
		frame.setDefaultCloseOperation(
						JFrame.EXIT_ON_CLOSE);
		// 设置窗口显示
		frame.setVisible(true);
	}
}

/*
 * 窗体类  
 *  需要继承（extends） JFrame 是其具有窗体类的功能
 */
class MyFrame extends JFrame {

	// 构造方法： 与类同名  没有返回值
	public MyFrame() {
		// 设置窗体标题
		setTitle("计算器");
		// 给窗体添加面板
		add(new MyPanel());
		// 按钮面板在窗口自适应
		pack();
	}
}

/*
 * 面板类   添加到窗体中
 *  继承JPanel 使其具有面板的相应功能
 */
class MyPanel extends JPanel {

	//显示计算器按钮的值和计算后的值
	JTextField display;
	JPanel panel1; //按钮面板1
	JPanel panel2; //按钮面板
	String nowButton; //当前按下的

	// 构造方法中实现按钮的添加
	public MyPanel(){
		// 设置文本显示框
		setLayout(new BorderLayout());
		// 把文本框添加到上面的显示框中 并设置默认内容显示为空
		display = new JTextField("");
		// 设置文本框的显示
		display.setEnabled(true);
		// 添加文本域的内容  此容器布局是按照(上)北,(下)南,(左)西,(右)东,中间
		add(display,BorderLayout.NORTH);


		// 监听操作按钮
		ActionListener command = new CommandAction();


		// panel1是中间16个按钮的布局，放到布局管理器的center里
		panel1 = new JPanel();
		// 设置按钮的布局为4*4
		panel1.setLayout(new GridLayout(4, 4));

		// 给布局管理器中添加按钮
		addButton1("7",command);
		addButton1("8",command);
		addButton1("9",command);
		addButton1("+",command);
		addButton1("4",command);
		addButton1("5",command);
		addButton1("6",command);
		addButton1("-",command);
		addButton1("1",command);
		addButton1("2",command);
		addButton1("3",command);
		addButton1("*",command);
		addButton1(".",command);
		addButton1("0",command);
		addButton1("=",command);
		addButton1("/",command);
		// 向布局管理器中添加面板1中的内容，并设置居中显示
		add(panel1, BorderLayout.CENTER);

		// panel2是下面2个按钮的布局，放到布局管理器的center里
		panel2 = new JPanel();
		// 设置按钮的布局为4*4
		panel2.setLayout(new GridLayout(1, 2));

		// 给布局管理器中添加按钮
		addButton2("Back Space",command);
		addButton2("C",command);
		// 向布局管理器中添加面板2中的内容，并设置居中显示
		add(panel2, BorderLayout.SOUTH);

	}
	// 注册事件监听器 添加按钮（panel1的）
	private void addButton1(String label,
			ActionListener listener) {
		// 创建按钮
		JButton button = new JButton(label);
		// 为按钮添加监听事件的动作
		button.addActionListener(listener);
		// 为面板1添加按钮
		panel1.add(button);
	}

	// 注册事件监听器 添加按钮（panel2的）
	private void addButton2(String label, 
			ActionListener listener) {
		// 创建按钮
		JButton button = new JButton(label);
		// 为按钮添加监听事件的动作
		button.addActionListener(listener);
		// 为面板2添加按钮
		panel2.add(button);

	}


	// 单击按钮执行命令的监听器
	class CommandAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 监听当前按下的按钮
			nowButton = e.getActionCommand();

			// 如果按下的是回退和=就不打印显示了
			if(nowButton!="Back Space" && nowButton != "=") {
				// 设置文本域就不显示当前按下的按钮
				display.setText(display.getText()+nowButton);
			}
			// 如果按下的是等号，就计算结果
			if(nowButton.equals("=")) {
				// 计算文本域显示的算式结果 并显示
				display.setText(jisuan1(display.getText()));
			}

			// 如果按下的是"Back Space" 就回退一个字符
			if(nowButton.equals("Back Space")) {
				// 当显示窗口本来就是空时  再次将显示窗口设置为空
				if(display.getText().length()==0){
					// 清空
					display.setText("");
				}else {
					//获取显示框的字符
					StringBuffer sb = new StringBuffer(
							display.getText());
					//回退一个字符后 再次显示
					display.setText(
							sb.substring(0,sb.length()-1));
				}
			}
			// 如果按下的是"C" 就清空
			if(nowButton.equals("C")) {
				// 清空
				display.setText("");
			}

		}
	}

	// 用来计算的方法
	private String jisuan1(String text) {
		// 获取显示框的内容
		StringBuffer sb = new StringBuffer(text);
		// 定义符号的数量
		int commandCount = 0;
		int j = 0; //计数器

		// 计算有多少个运算符，就有n+1个数字
		for (j= 0; j <sb.length(); j++) {
			// 如果按下的是 0-9或者 .
			if(sb.charAt(j)<= '9' && 
					sb.charAt(j)>='0' ||
					sb.charAt(j)=='.') {
				// 就继续循环统计
				continue;
			}else {
				// 否则  符号加1
				commandCount++;
			}
		}

		// 初始化符号数组
		char[] command = new char[commandCount];
		// 初始化数字数组（用字符串表示）
		String[] num = new String[commandCount+1];
		// 由于String类型的默认值是null  故在存数字之间先赋值
		for (int i = 0; i < num.length; i++) {
			num[i] = "";
		}

		// 将文本框的每一个内容做遍历，  789 +  123 
		//把每个数字存进数字数组中，每个符号存进符号数组中
		int k =0;
		for (j = 0; j < sb.length(); j++) {
			if(sb.charAt(j)<= '9' && 
					sb.charAt(j)>='0' ||
					sb.charAt(j)=='.') {
				
				// 将数字内容做拼接
				num[k] += sb.charAt(j);
				// 继续循环判断
				continue;
			}else {
				// 将获取到的符号放到符号数组中
				command[k] = sb.charAt(j);
				// 主要作用就是去判断第二个数
				k++;
			}
			
		}

		// 计算结果
		double result = 0; // 最终结果
		
		for(int i =0;i<commandCount;i++) {
			
			// 取数字数组中的前两个数，和第一个操作符，运算
			double num1 = Double.parseDouble(num[i]);
			
			double num2 = Double.parseDouble(num[i+1]);
			
			char cc = command[i];
			
			
			// 计算
			switch(cc) {
				 case '+':
					 result = num1+num2;
					 break;
				 case '-':
					 result = num1-num2;
					 break;
				 case '*':
					 result = num1*num2;
					 break;
				 case '/':
					 result = num1/num2;
					 break;
				 default:
					break;
			}
			// 由于 显示框要的是String类型  故需要将结果继续转为String类型
			num[i+1] = String.valueOf(result);
			
		}
		// 返回结果
		return String.valueOf(result);
	}
}


