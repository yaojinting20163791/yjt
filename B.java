package 小学生数学题自动生成系统;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class B extends JFrame implements ActionListener{
 int max=20;
 int MAX=10;
 int TYPE=1;
 JLabel jlTitle=new JLabel();
 JLabel jl=new JLabel("");
 JLabel jlAnswer=new JLabel("");
 JLabel jlTotal=new JLabel("共"+max+"题");
 JLabel jlcorrect=new JLabel();
 JTextField jtf=new JTextField(3);
 JMenuBar jmb=new JMenuBar();
 JMenu jm=new JMenu("类型 ");
 JMenuItem jmi1=new JMenuItem("10以内加法");
 JMenuItem jmi2=new JMenuItem("10以内减法");
 JMenuItem jmi3=new JMenuItem("20以内加法");
 JMenuItem jmi4=new JMenuItem("20以内减法");
 JMenuItem jmi5=new JMenuItem("100以内加法");
 JMenuItem jmi6=new JMenuItem("100以内减法");
 JMenuItem jmi7=new JMenuItem("100以内乘法");
 JMenuItem jmi8=new JMenuItem("100以内除法");
 JButton jb1=new JButton("上一题");
 JButton jb2=new JButton("下一题");
 JButton jb3=new JButton("评卷");
 JButton jb4=new JButton("答案");
 JPanel jp1=new JPanel();
 JPanel jp2=new JPanel();
 JPanel jp3=new JPanel();
 String[] question=new String[max];
 int[] answer=new int[max];
 String[] studentAnswer=new String[max];
 boolean[]correct=new boolean[max];
 int count=1;
 boolean submitFlag=false;
 B(){
  super("小学数学测试");
  jlTitle.setFont(new Font(null,Font.PLAIN,20));
  jlTotal.setFont(new Font(null,Font.PLAIN,20));
  jlAnswer.setFont(new Font(null,Font.PLAIN,20));
  jl.setFont(new Font(null,Font.PLAIN,20));
  jlcorrect.setFont(new Font(null,Font.PLAIN,20));
  jlcorrect.setForeground(Color.RED);
  jtf.setFont(new Font(null,Font.PLAIN,20));
  fillQuestion();
  jb1.addActionListener(this);
  jb2.addActionListener(this);
  jb3.addActionListener(this);
  jb4.addActionListener(this);
  jmi1.addActionListener(this);
  jmi2.addActionListener(this);
  jmi3.addActionListener(this);
  jmi4.addActionListener(this);
  jmi5.addActionListener(this);
  jmi6.addActionListener(this);
  jmi7.addActionListener(this);
  jmi8.addActionListener(this);
  jm.add(jmi1);jm.add(jmi2);jm.add(jmi3);jm.add(jmi4);jm.add(jmi5);jm.add(jmi6);jm.add(jmi7);jm.add(jmi8);
  jmb.add(jm);
  setJMenuBar(jmb);
  jp1.add(jlTitle);jp1.add(jlTotal);jp1.add(jb3);jp1.add(jb4);
  jp2.add(jl);jp2.add(jtf);jp2.add(jlcorrect);jp2.add(jlAnswer);
  jp3.add(jb1);jp3.add(jb2);
  add(jp1,BorderLayout.NORTH);
  add(jp2,BorderLayout.CENTER);
  add(jp3,BorderLayout.SOUTH);
  setSize(300, 200);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLocationRelativeTo(null);
  setVisible(true);
 }
 //@Override
 public void actionPerformed(ActionEvent ae) {
  if(ae.getSource()==jb1){
   if(submitFlag==false){
    try{
     int tempanswer=Integer.parseInt(jtf.getText().trim());
     studentAnswer[count-1]=jtf.getText().trim();
     if(count==1)count=max;
     else count--;
     jlTitle.setText("第"+count+"题");
     jl.setText(question[count-1]);
     jtf.setText("");
     if(studentAnswer[count-1]==null||studentAnswer[count-1].equals("")){
     }else{
      jtf.setText(studentAnswer[count-1]);
     }
    }catch(NumberFormatException nfe){
     JOptionPane.showMessageDialog(this, "请输入正整数!");
     jtf.requestFocus();
    }
   }else{
    if(count==1)count=max;
    else count--;
    jlTitle.setText("第"+count+"题");
    jl.setText(question[count-1]);
    jlAnswer.setText("");
    jtf.setEnabled(false);
    jtf.setText(studentAnswer[count-1]);
    jb4.setEnabled(true);
    if(correct[count-1]==true){
     jlcorrect.setText("√");
    }else{
     jlcorrect.setText("×");
    }
   }
  }
  if(ae.getSource()==jb2){
   if(submitFlag==false){
    try{
     int tempanswer=Integer.parseInt(jtf.getText().trim());
     studentAnswer[count-1]=jtf.getText().trim();
     if(count==max)count=1;
     else count++;
     jlTitle.setText("第"+count+"题");
     jl.setText(question[count-1]);
     jtf.setText("");
     if(studentAnswer[count-1]==null||studentAnswer[count-1].equals("")){
     }else{
      jtf.setText(studentAnswer[count-1]);
     }
    }catch(NumberFormatException nfe){
     JOptionPane.showMessageDialog(this, "请输入正整数!");
     jtf.requestFocus();
    }
   }else{
    if(count==max)count=1;
    else count++;
    jlTitle.setText("第"+count+"题");
    jl.setText(question[count-1]);
    jlAnswer.setText("");
    jtf.setEnabled(false);
    jtf.setText(studentAnswer[count-1]);
    jb4.setEnabled(true);
    if(correct[count-1]==true){
     jlcorrect.setText("√");
    }else{
     jlcorrect.setText("×");
    }
   }
  }
  if(ae.getSource()==jb3){
   try{
    int tempanswer=Integer.parseInt(jtf.getText().trim());
    studentAnswer[count-1]=jtf.getText().trim();
    for(int i=0;i<max;i++){
     if(studentAnswer[i]==null||studentAnswer[i].equals("")){
      correct[i]=false;
     }else if(Integer.parseInt(studentAnswer[i])==answer[i]){
      correct[i]=true;
     }else{
      correct[i]=false;
     }
    }
    int correctAnswer=0;
    for(int i=0;i<max;i++){
     if(correct[i]==true){
      correctAnswer++;
     }
    }
    String s="共"+max+"道题\n";
    s=s+"答对"+correctAnswer+"道题\n";
    s=s+"答错"+(max-correctAnswer)+"道题\n";
    s=s+"成绩"+String.format("%.2f",(100*(float)correctAnswer/max))+"分\n";
    JOptionPane.showMessageDialog(this, s);
    submitFlag=true;
    jb4.setEnabled(true);
    jtf.setEnabled(false);
    jtf.setText(studentAnswer[count-1]);
    if(correct[count-1]==true){4
     jlcorrect.setText("√");
    }else{
     jlcorrect.setText("×");
    }
   }catch(NumberFormatException nfe){
    JOptionPane.showMessageDialog(this, "请输入正整数!");
    jtf.requestFocus();
   }
  }
  if(ae.getSource()==jb4){
   jlAnswer.setText(String.valueOf(answer[count-1]));
  }
  if(ae.getSource()==jmi1){
   MAX=10;TYPE=1;fillQuestion();
  }
  if(ae.getSource()==jmi2){
   MAX=10;TYPE=2;fillQuestion();
  }
  if(ae.getSource()==jmi3){
   MAX=20;TYPE=1;fillQuestion();
  }
  if(ae.getSource()==jmi4){
   MAX=20;TYPE=2;fillQuestion();
  }
  if(ae.getSource()==jmi5){
   MAX=100;TYPE=1;fillQuestion();
  }
  if(ae.getSource()==jmi6){
   MAX=100;TYPE=2;fillQuestion();
  }
  if(ae.getSource()==jmi7){
   MAX=100;TYPE=3;fillQuestion();
  }
  if(ae.getSource()==jmi8){
   MAX=100;TYPE=4;fillQuestion();
  }
 }
 public static void main(String[] args) {
  new B();
 }
 public void fillQuestion(){
  count=1;
  for(int i=0;i<max;i++){
   String s=randomQuestion(MAX,TYPE);
   question[i]=s.substring(0,s.indexOf("=")+1);
   answer[i]=Integer.parseInt(s.substring(s.indexOf("=")+1));
  }
  studentAnswer=new String[max];
  correct=new boolean[max];
  jl.setText(question[0]);
  jlTitle.setText("第"+count+"题");
  jlcorrect.setText("");
  jlAnswer.setText("");
  submitFlag=false;
  jtf.setEnabled(true);
  jtf.setText("");
  jb4.setEnabled(false);
 }
 public String randomQuestion(int MAX,int TYPE) {
  String s="";
  int answer=MAX+1;
  while(answer>MAX||answer<0){
   int a=(int)(Math.random()*MAX+1);
   int b=(int)(Math.random()*MAX+1);
   switch(TYPE){
    case 1:answer=a+b;break;
    case 2:answer=a-b;break;
    case 3:answer=a*b;break;
    case 4:
     if(a%b==0){
      answer=a/b;
     }
     break;
   }
   if(answer<=MAX&&answer>=0){
    s=s+a;
    switch(TYPE){
     case 1:s=s+"+";break;
     case 2:s=s+"-";break;
     case 3:s=s+"*";break;
     case 4:s=s+"/";break;
    }
    s=s+b+"="+answer;
   }
  }
  return s;
 }
}
