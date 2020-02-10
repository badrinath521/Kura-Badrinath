package calculator;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="ab"width=300 height=300>
 * <.applet>*/
public class samplecalculator extends Applet implements ActionListener
{
	String msg=" ";
int v1,v2,result;
TextField t1;
Button b[]=new Button[30];
Button add,sub,mul,div,eq;
char op;
public void init()
{
	t1=new TextField(30);
	GridLayout gl=new GridLayout(4,5);
	setLayout(gl);
	for(int i=0;i<30;i++)
	{
		b[i]=new Button(""+i);
		
	}
	add=new Button("add");
	sub=new Button("sub");
	mul=new Button("mul");
	div=new Button("div");
	eq=new Button("eq");
	t1.addActionListener(this);
	add(t1);
	for(int i=0;i<30;i++)
	{
		add(b[i]);
		
	}
	add(add);
	add(sub);
	add(mul);
	add(div);
	add(eq);
	for(int i=0;i<30;i++)
	{
		b[i].addActionListener(this);
	}
	add.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	eq.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
	String str=ae.getActionCommand();
	char ch=str.charAt(0);
	if(Character.isDigit(ch))
		t1.setText(t1.getText()+str);
	else
		if(str.equals("add"))
		{
			v1=Integer.parseInt(t1.getText());
			op='+';
			t1.setText("");
		}
		else if(str.equals("sub"))
		{
			v1=Integer.parseInt(t1.getText());
			op='-';
			t1.setText("");
		}
		else if(str.equals("mul"))
		{
			v1=Integer.parseInt(t1.getText());
			op='*';
			t1.setText("");
		}
		else if(str.equals("div"))
		{
			v1=Integer.parseInt(t1.getText());
			op='/';
			t1.setText("");
		}
	if(str.equals("eq"))
		{
		v2=Integer.parseInt(t1.getText());
		if(op=='+')
			result=v1+v2;
		else if(op=='-')
			result=v1-v2;
		else if(op=='*')
			result=v1*v2;
		else if(op=='/')
			result=v1/v2;
		t1.setText(""+result);
		}
	if(str.contentEquals("clear"))
	{
		t1.setText("");
	}
	}
}

