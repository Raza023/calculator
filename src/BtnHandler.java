import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BtnHandler implements ActionListener
{
    CalGUI refg;
    String val[] = new String[2];
    int v=0;
    double result = 0.0;
    String op="";
    String one;
    String two;
    String ope;
    boolean f1=false;
    boolean f2=false;
    boolean vFlag=true;
    boolean oFlag=false;
    boolean eFlag=false;
    boolean bFlag=false;
    int pCounter=0;
    boolean pFlag=true;
    boolean modFlag=false;
    boolean pahla=true;
    boolean dosra=false;
    
    public BtnHandler(CalGUI gg)
    {
        this.refg = gg;
        val[0]="";
        val[1]="";
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String btnText = e.getActionCommand();
        //refg.tfMain.setText("0");
        if((btnText.equals("1")||btnText.equals("2")||btnText.equals("3")||btnText.equals("4")||btnText.equals("5")||btnText.equals("6")||btnText.equals("7")||btnText.equals("8")||btnText.equals("9")||btnText.equals("0"))&&vFlag==true)
        {
            if(pahla==true)
            {
                if(v==0)
                {
                    //refg.tfMain.setText("");
                    refg.tfMain.setText(refg.tfMain.getText() + btnText);
                    val[v]=val[v]+btnText;
                    one=val[v];
                    System.out.println(val[v]);
                    
                    vFlag=true;
                    oFlag=true;
                    eFlag=true;
                    bFlag=true;
                    modFlag=true;
                }
                else if(v==1)
                {
                    refg.tfMain.setText(refg.tfMain.getText() + btnText);
                    val[v]=val[v]+btnText;

                    System.out.println(val[v]);
                    vFlag=true;
                    oFlag=false;
                    eFlag=true;
                    bFlag=true;
                    modFlag=true;
                }
            }
            else if(dosra==true)
            {
                val[1]="";
                refg.tfMain.setText(refg.tfMain.getText() + btnText);
                String helpin=refg.tfMain.getText().substring(1);
                val[1]=helpin;
                System.out.println(val[1]);
                vFlag=true;
                oFlag=false;
                eFlag=true;
                bFlag=true;
                modFlag=true;
            }
        }
        else if(btnText.equals(".")&&pFlag==true)
        {

            if(pahla==true)
            {
                if(v==0)
                {
                    refg.tfMain.setText(refg.tfMain.getText() + btnText);
                    val[v]=val[v]+btnText;
                    System.out.println(val[v]);
                    vFlag=true;
                    oFlag=true;
                    eFlag=false;
                    pFlag=false;
                }
                else if(v==1)
                {
                    refg.tfMain.setText(refg.tfMain.getText() + btnText);
                    val[v]=val[v]+btnText;
                    if(val[1].charAt(0)=='.')
                    {
                        val[1]="0"+val[1];
                        refg.tfMain.setText(refg.tfMain.getText().substring(0, refg.tfMain.getText().length()-1)+val[1]);
                    }
                    System.out.println(val[v]);
                    vFlag=true;
                    oFlag=false;
                    eFlag=true;
                    pFlag=false;
                }
            }
            else if(dosra==true)
            {
                val[1]="";
                refg.tfMain.setText(refg.tfMain.getText() + btnText);
                String helpin=refg.tfMain.getText().substring(1);
                val[1]=helpin;
                if(val[1].charAt(0)=='.')
                    {
                        val[1]="0"+val[1];
                        refg.tfMain.setText(refg.tfMain.getText().substring(0, refg.tfMain.getText().length()-1)+val[1]);
                    }
                System.out.println(val[1]);
                vFlag=true;
                oFlag=false;
                eFlag=true;
                pFlag=false;
            }
            if(val[0].charAt(0)=='.')
            {
                val[0]="0"+refg.tfMain.getText();
                refg.tfMain.setText("0"+refg.tfMain.getText());
            }
            System.out.println(val[0]);
//            if(val[1].charAt(0)=='.')
//            {
//                val[1]="0"+val[1];
//                refg.tfMain.setText(refg.tfMain.getText().substring(0, refg.tfMain.getText().length()-1)+val[1]);
//            }
        }
        else if((btnText.equals("/")||btnText.equals("*")||btnText.equals("+")||btnText.equals("-"))&&oFlag==true)
        {
            pFlag=true;
            if(val[0].charAt(val[0].length()-1)=='.')
            {
                val[0]=val[0]+"0";
                refg.tfMain.setText(val[0]);
            }
            
            if(refg.tfMain.getText().charAt(refg.tfMain.getText().length()-1) == '/' || refg.tfMain.getText().charAt(refg.tfMain.getText().length()-1) == '*' || refg.tfMain.getText().charAt(refg.tfMain.getText().length()-1) == '-' || refg.tfMain.getText().charAt(refg.tfMain.getText().length()-1) == '+')
            {
                refg.tfMain.setText(refg.tfMain.getText().substring(0, (refg.tfMain.getText().length()-1)));
                refg.tfMain.setText(refg.tfMain.getText() + btnText);
                op=btnText;
                ope=op;
                vFlag=true;
                oFlag=true;
                eFlag=false;
                modFlag=false;
            }
            else
            {
                if(pahla==true)
                {
                    v++;
                    refg.tfMain.setText(refg.tfMain.getText() + btnText);
                    op=btnText;
                    ope=op;
                    vFlag=true;
                    oFlag=true;
                    eFlag=false;
                    modFlag=false;
                    //bFlag=false;
                }
                else if(dosra==true)
                {
                    v++;
                    refg.tfMain.setText(btnText);
                    op=btnText;
                    ope=op;
                    vFlag=true;
                    oFlag=true;
                    eFlag=false;
                    modFlag=false;
                    //bFlag=false;
                }
            }
                
        }
        else if(btnText.equals("+/-")&&modFlag==true)
        {
            op="+/-";
            if(pahla==true)
            {
                if(v==0&&Double.parseDouble(val[0])!=0.0)
                {
                    double vlu =Double.parseDouble(val[0])*(-1.0);
                    //System.out.println(vlu);
                    one=Double.toString(vlu);
                    refg.tfMain.setText(one);
                    val[0]=one;
                    op=ope;
                    //System.out.println(val[0]);
                    //eFlag=false;
                }
                else if(v==1&&Double.parseDouble(val[1])!=0.0)
                {
                    double vlu =Double.parseDouble(val[1])*(-1.0);
                    //System.out.println(vlu);
                    two=Double.toString(vlu);
                    refg.tfMain.setText(val[0]+ope+two);
                    val[1]=two;
                    op=ope;
                    //System.out.println(val[1]);
                    //eFlag=false;
                }
            }
            else if(dosra==true&&Double.parseDouble(val[1])!=0.0)
            {
                double vlu =Double.parseDouble(val[1])*(-1.0);
                System.out.println(vlu);
                two=Double.toString(vlu);
                refg.tfMain.setText(ope+two);
                op=ope;
                val[1]=two;
                //eFlag=false;
            }
        }
        else if(btnText.equals("<-")&&bFlag==true)
        {
            if(refg.tfMain.getText()=="/"||refg.tfMain.getText()=="*"||refg.tfMain.getText()=="+"||refg.tfMain.getText()=="-")
            {
                refg.tfMain.setText("");
                val[0]="";
            }
            //System.out.println(refg.tfMain.getText());
            if((refg.tfMain.getText().charAt(refg.tfMain.getText().length()-1)=='/' || refg.tfMain.getText().charAt(refg.tfMain.getText().length()-1)=='*' || refg.tfMain.getText().charAt(refg.tfMain.getText().length()-1)=='+' || refg.tfMain.getText().charAt(refg.tfMain.getText().length()-1)=='-') && pahla == true)
            {
                bFlag=false;
            }
            if(refg.tfMain.getText().length()==1&&(refg.tfMain.getText().charAt(0)=='/' || refg.tfMain.getText().charAt(0)=='*' || refg.tfMain.getText().charAt(0)=='+' || refg.tfMain.getText().charAt(0)=='-'))
            {
                bFlag=false;
            }
            if(refg.tfMain.getText().length()>=1&&bFlag==true)
            {
                if(v==0)
                {
                    val[0]=val[0].substring(0, val[0].length()-1);
                    refg.tfMain.setText(refg.tfMain.getText().substring(0, (refg.tfMain.getText().length()-1)));
                    vFlag=true;
                    oFlag=true;
                    eFlag=false;
                    pFlag=true;
                }
                else if(v==1)
                {
                    val[1]=val[1].substring(0, val[1].length()-1);
                    refg.tfMain.setText(refg.tfMain.getText().substring(0, (refg.tfMain.getText().length()-1)));
                    vFlag=true;
                    oFlag=true;
                    eFlag=false;
                    pFlag=true;
                }
                if(refg.tfMain.getText().length()==0)
                {
                    bFlag=false;
                }
                
            }
        }
        else if(btnText.equals("CE"))
        {
            val[0]="";
            val[1]="";
            refg.tfMain.setText("");
            v=0;
            result = 0.0;
            op="";
            vFlag=true;
            oFlag=false;
            eFlag=false;
            bFlag=false;
            pCounter=0;
            pFlag=true;
            pahla=true;
            dosra=false;
            modFlag=false;
            f1=false;
            f2=false;
        }
        else if(btnText.equals("C"))
        {
            val[0]="";
            val[1]="";
            refg.tfMain.setText("");
            refg.tfSub.setText("");
            v=0;
            result = 0.0;
            op="";
            vFlag=true;
            oFlag=false;
            eFlag=false;
            bFlag=false;
            pCounter=0;
            pFlag=true;
            pahla=true;
            dosra=false;
            modFlag=false;
            f1=false;
            f2=false;
        }
        else if(btnText.equals("=")&&eFlag==true)
        {
            if(refg.tfMain.getText().charAt(refg.tfMain.getText().length()-1)=='.')
            {
                //val[1]=val[1]+"0";
                refg.tfMain.setText(refg.tfMain.getText()+"0");
            }
            if("+".equals(op))
            {
                result= (Double.parseDouble(val[0])) + (Double.parseDouble(val[1]));
            }
            else if("-".equals(op))
            {
                result= (Double.parseDouble(val[0])) - (Double.parseDouble(val[1]));
            }
            else if("*".equals(op))
            {
                result= (Double.parseDouble(val[0])) * (Double.parseDouble(val[1]));
            }
            else if("/".equals(op))
            {
                if(Double.parseDouble(val[1])==0.0)
                {
                    refg.tfMain.setText("Divided by 0.");
                }
                else
                {
                    result= (Double.parseDouble(val[0])) / (Double.parseDouble(val[1]));
                }
            }
            else if("+/-".equals(op))
            {
                
            }
            
            val[0]=Double.toString(result);
            v=0;
            vFlag=false;
            oFlag=true;
            eFlag=true;
            bFlag=false;
            pFlag=false;
            pahla=false;
            dosra=true;
            modFlag=false;
            System.out.println(Double.toString(result));
            
            if(oFlag==true&&eFlag==true&&val[1]=="")
            {
                refg.tfSub.setText(one);
                System.out.println(one);
                val[0]=one;
            }
            else
            {
                if(result==-0.0)
                {
                    result=0.0;
                }
                refg.tfSub.setText(Double.toString(result));
            }
//            System.out.println(refg.tfSub.getText().substring(refg.tfSub.getText().length()-2, refg.tfSub.getText().length()));
//            if(refg.tfSub.getText().substring(refg.tfSub.getText().length()-2, refg.tfSub.getText().length()) == ".0")
//            {
//                System.out.println(Double.parseDouble(refg.tfSub.getText()));
//                int need=(int)(Double.parseDouble(refg.tfSub.getText()));
//                System.out.println(need);
//                refg.tfSub.setText(Integer.toString(need));
//            }
        }
    }   
}