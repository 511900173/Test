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
 * ���׼���������
 */
public class Counter {
	// ��������
	public static void main(String[] args) {
		// ��������
		MyFrame frame = new MyFrame();
		
		// ���ô���ر�  �����Ҳ�ر�
		frame.setDefaultCloseOperation(
						JFrame.EXIT_ON_CLOSE);
		// ���ô�����ʾ
		frame.setVisible(true);
	}
}

/*
 * ������  
 *  ��Ҫ�̳У�extends�� JFrame ������д�����Ĺ���
 */
class MyFrame extends JFrame {

	// ���췽���� ����ͬ��  û�з���ֵ
	public MyFrame() {
		// ���ô������
		setTitle("������");
		// ������������
		add(new MyPanel());
		// ��ť����ڴ�������Ӧ
		pack();
	}
}

/*
 * �����   ��ӵ�������
 *  �̳�JPanel ʹ�����������Ӧ����
 */
class MyPanel extends JPanel {

	//��ʾ��������ť��ֵ�ͼ�����ֵ
	JTextField display;
	JPanel panel1; //��ť���1
	JPanel panel2; //��ť���
	String nowButton; //��ǰ���µ�

	// ���췽����ʵ�ְ�ť�����
	public MyPanel(){
		// �����ı���ʾ��
		setLayout(new BorderLayout());
		// ���ı�����ӵ��������ʾ���� ������Ĭ��������ʾΪ��
		display = new JTextField("");
		// �����ı������ʾ
		display.setEnabled(true);
		// ����ı��������  �����������ǰ���(��)��,(��)��,(��)��,(��)��,�м�
		add(display,BorderLayout.NORTH);


		// ����������ť
		ActionListener command = new CommandAction();


		// panel1���м�16����ť�Ĳ��֣��ŵ����ֹ�������center��
		panel1 = new JPanel();
		// ���ð�ť�Ĳ���Ϊ4*4
		panel1.setLayout(new GridLayout(4, 4));

		// �����ֹ���������Ӱ�ť
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
		// �򲼾ֹ�������������1�е����ݣ������þ�����ʾ
		add(panel1, BorderLayout.CENTER);

		// panel2������2����ť�Ĳ��֣��ŵ����ֹ�������center��
		panel2 = new JPanel();
		// ���ð�ť�Ĳ���Ϊ4*4
		panel2.setLayout(new GridLayout(1, 2));

		// �����ֹ���������Ӱ�ť
		addButton2("Back Space",command);
		addButton2("C",command);
		// �򲼾ֹ�������������2�е����ݣ������þ�����ʾ
		add(panel2, BorderLayout.SOUTH);

	}
	// ע���¼������� ��Ӱ�ť��panel1�ģ�
	private void addButton1(String label,
			ActionListener listener) {
		// ������ť
		JButton button = new JButton(label);
		// Ϊ��ť��Ӽ����¼��Ķ���
		button.addActionListener(listener);
		// Ϊ���1��Ӱ�ť
		panel1.add(button);
	}

	// ע���¼������� ��Ӱ�ť��panel2�ģ�
	private void addButton2(String label, 
			ActionListener listener) {
		// ������ť
		JButton button = new JButton(label);
		// Ϊ��ť��Ӽ����¼��Ķ���
		button.addActionListener(listener);
		// Ϊ���2��Ӱ�ť
		panel2.add(button);

	}


	// ������ťִ������ļ�����
	class CommandAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// ������ǰ���µİ�ť
			nowButton = e.getActionCommand();

			// ������µ��ǻ��˺�=�Ͳ���ӡ��ʾ��
			if(nowButton!="Back Space" && nowButton != "=") {
				// �����ı���Ͳ���ʾ��ǰ���µİ�ť
				display.setText(display.getText()+nowButton);
			}
			// ������µ��ǵȺţ��ͼ�����
			if(nowButton.equals("=")) {
				// �����ı�����ʾ����ʽ��� ����ʾ
				display.setText(jisuan1(display.getText()));
			}

			// ������µ���"Back Space" �ͻ���һ���ַ�
			if(nowButton.equals("Back Space")) {
				// ����ʾ���ڱ������ǿ�ʱ  �ٴν���ʾ��������Ϊ��
				if(display.getText().length()==0){
					// ���
					display.setText("");
				}else {
					//��ȡ��ʾ����ַ�
					StringBuffer sb = new StringBuffer(
							display.getText());
					//����һ���ַ��� �ٴ���ʾ
					display.setText(
							sb.substring(0,sb.length()-1));
				}
			}
			// ������µ���"C" �����
			if(nowButton.equals("C")) {
				// ���
				display.setText("");
			}

		}
	}

	// ��������ķ���
	private String jisuan1(String text) {
		// ��ȡ��ʾ�������
		StringBuffer sb = new StringBuffer(text);
		// ������ŵ�����
		int commandCount = 0;
		int j = 0; //������

		// �����ж��ٸ������������n+1������
		for (j= 0; j <sb.length(); j++) {
			// ������µ��� 0-9���� .
			if(sb.charAt(j)<= '9' && 
					sb.charAt(j)>='0' ||
					sb.charAt(j)=='.') {
				// �ͼ���ѭ��ͳ��
				continue;
			}else {
				// ����  ���ż�1
				commandCount++;
			}
		}

		// ��ʼ����������
		char[] command = new char[commandCount];
		// ��ʼ���������飨���ַ�����ʾ��
		String[] num = new String[commandCount+1];
		// ����String���͵�Ĭ��ֵ��null  ���ڴ�����֮���ȸ�ֵ
		for (int i = 0; i < num.length; i++) {
			num[i] = "";
		}

		// ���ı����ÿһ��������������  789 +  123 
		//��ÿ�����ִ�����������У�ÿ�����Ŵ������������
		int k =0;
		for (j = 0; j < sb.length(); j++) {
			if(sb.charAt(j)<= '9' && 
					sb.charAt(j)>='0' ||
					sb.charAt(j)=='.') {
				
				// ������������ƴ��
				num[k] += sb.charAt(j);
				// ����ѭ���ж�
				continue;
			}else {
				// ����ȡ���ķ��ŷŵ�����������
				command[k] = sb.charAt(j);
				// ��Ҫ���þ���ȥ�жϵڶ�����
				k++;
			}
			
		}

		// ������
		double result = 0; // ���ս��
		
		for(int i =0;i<commandCount;i++) {
			
			// ȡ���������е�ǰ���������͵�һ��������������
			double num1 = Double.parseDouble(num[i]);
			
			double num2 = Double.parseDouble(num[i+1]);
			
			char cc = command[i];
			
			
			// ����
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
			// ���� ��ʾ��Ҫ����String����  ����Ҫ���������תΪString����
			num[i+1] = String.valueOf(result);
			
		}
		// ���ؽ��
		return String.valueOf(result);
	}
}


