/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.SplashScreen;

/**
 * @author MDF
 */
public class HelloMIDlet extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command okCommand;
    private Command exitCommand1;
    private Command okCommand1;
    private Command exitCommand2;
    private Command okCommand2;
    private Command helpCommand;
    private Command okCommand3;
    private Command okCommand4;
    private Command okCommand5;
    private Command okCommand6;
    private Command okCommand8;
    private Command okCommand9;
    private Command okCommand7;
    private Command helpCommand1;
    private Form Modulo;
    private TextField textField;
    private Spacer spacer;
    private TextField textField1;
    private Form PrimeFactor;
    private TextField textField2;
    private Form Menu;
    private ChoiceGroup choiceGroup;
    private Form GCD;
    private TextField textField4;
    private TextField textField3;
    private Form LCM;
    private TextField textField6;
    private TextField textField5;
    private Alert ResultBox;
    private Form DeciToBinary;
    private TextField textField7;
    private SplashScreen splashScreen;
    private Form DeciToHexa;
    private TextField textField9;
    private Form DeciToOcta;
    private TextField textField8;
    private Form BinaryToDeci;
    private TextField textField10;
    private Form OctaToDeci;
    private TextField textField11;
    private Form HexaToDeci;
    private TextField textField12;
    private Image image1;
//</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the
     * <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
        textField1 = new TextField("B:", "", 32, TextField.ANY);//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getSplashScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The
     * <code>display</code> instance is taken from
     * <code>getDisplay</code> method. This method is used by all actions in the
     * design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then
     * <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == BinaryToDeci) {//GEN-BEGIN:|7-commandAction|1|159-preAction
            if (command == exitCommand) {//GEN-END:|7-commandAction|1|159-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|2|159-postAction
                // write post-action user code here
            } else if (command == helpCommand1) {//GEN-LINE:|7-commandAction|3|201-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|4|201-postAction
                // write post-action user code here
            } else if (command == okCommand7) {//GEN-LINE:|7-commandAction|5|162-preAction
                // write pre-action user code here
                String binary = this.textField10.getString(); 
                int i,j;
                
                String step = "(" + binary + ") = ";
                for (i = binary.length()-1 , j = 0; i >= 0; i--,j++){
                    if (j < binary.length()-1) step += binary.charAt(j) + "(2^" + i + ") + ";
                    else step += binary.charAt(j) + "(2^" + i + ")";
                }
                
                getResultBox().setString(step + "\n\nThe Decimal Equivalent is: \n" + Integer.parseInt(binary, 2));
                switchDisplayable(getResultBox(), getBinaryToDeci());//GEN-LINE:|7-commandAction|6|162-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|7|108-preAction
        } else if (displayable == DeciToBinary) {
            if (command == exitCommand) {//GEN-END:|7-commandAction|7|108-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|8|108-postAction
                // write post-action user code here
            } else if (command == helpCommand1) {//GEN-LINE:|7-commandAction|9|198-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|10|198-postAction
                // write post-action user code here
            } else if (command == okCommand5) {//GEN-LINE:|7-commandAction|11|111-preAction
                // write pre-action user code here
                int deci = Integer.parseInt(this.textField7.getString()); 
                getResultBox().setString("The Binary Equivalent is: \n" + Integer.toBinaryString(deci) );
                switchDisplayable(getResultBox(), getDeciToBinary());//GEN-LINE:|7-commandAction|12|111-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|143-preAction
        } else if (displayable == DeciToHexa) {
            if (command == exitCommand) {//GEN-END:|7-commandAction|13|143-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|14|143-postAction
                // write post-action user code here
            } else if (command == helpCommand1) {//GEN-LINE:|7-commandAction|15|199-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|16|199-postAction
                // write post-action user code here
            } else if (command == okCommand6) {//GEN-LINE:|7-commandAction|17|146-preAction
                // write pre-action user code here
                int deci = Integer.parseInt(this.textField9.getString());
                getResultBox().setString("The Hexadecimal Equivalent is: \n" + Integer.toHexString(deci) );
                switchDisplayable(getResultBox(), getDeciToHexa());//GEN-LINE:|7-commandAction|18|146-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|19|134-preAction
        } else if (displayable == DeciToOcta) {
            if (command == exitCommand) {//GEN-END:|7-commandAction|19|134-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|20|134-postAction
                // write post-action user code here
            } else if (command == helpCommand1) {//GEN-LINE:|7-commandAction|21|200-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|22|200-postAction
                // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|23|136-preAction
                // write pre-action user code here
                int deci = Integer.parseInt(this.textField8.getString());
                getResultBox().setString("The Octadecimal Equivalent is: \n" + Integer.toOctalString(deci) );
                switchDisplayable(getResultBox(), getDeciToOcta());//GEN-LINE:|7-commandAction|24|136-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|25|82-preAction
        } else if (displayable == GCD) {
            if (command == exitCommand) {//GEN-END:|7-commandAction|25|82-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|26|82-postAction
                // write post-action user code here
            } else if (command == helpCommand1) {//GEN-LINE:|7-commandAction|27|194-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|28|194-postAction
                // write post-action user code here
            } else if (command == okCommand3) {//GEN-LINE:|7-commandAction|29|88-preAction
                // write pre-action user code here
                int a1 = Integer.parseInt(this.textField3.getString());
                int b1 = Integer.parseInt(this.textField4.getString());
                int tempG,gcdResult;
                String gcdSteps = "GCD(" + a1 + "," + b1 + "):\n";
                
                while (a1 != 0 && b1 != 0){
                    //gcdSteps += "GCD(" + a1 + "," + b1 + ") = GCD (" + b1 + "," + a1 + " % " + b1 + ")\n";
                    gcdSteps += "\n" + a1 + " = " + b1 + "(" + (int)(a1/b1) + ") + " + (a1%b1);
                    tempG = a1;
                    a1 = b1;
                    b1 = tempG % b1;
                }
                
                if (a1 == 0) gcdResult = b1;
                else gcdResult = a1;
                
                gcdSteps += "\n\nGCD : " + gcdResult;
                
                getResultBox().setString("Steps:\n\n" + gcdSteps);
                switchDisplayable(getResultBox(), getGCD());//GEN-LINE:|7-commandAction|30|88-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|31|173-preAction
        } else if (displayable == HexaToDeci) {
            if (command == exitCommand) {//GEN-END:|7-commandAction|31|173-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|32|173-postAction
                // write post-action user code here
            } else if (command == helpCommand1) {//GEN-LINE:|7-commandAction|33|203-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|34|203-postAction
                // write post-action user code here
            } else if (command == okCommand9) {//GEN-LINE:|7-commandAction|35|176-preAction
                // write pre-action user code here
                String hexa = this.textField12.getString(); 
                int i,j;
                
                String step = "(" + hexa + ") = ";
                for (i = hexa.length()-1 , j = 0; i >= 0; i--,j++){
                    if (j < hexa.length()-1) step += Integer.parseInt(hexa.substring(j, j+1), 16) + "(16^" + i + ") + ";
                    else step += Integer.parseInt(hexa.substring(j, j+1), 16) + "(16^" + i + ")";
                }
                
                getResultBox().setString(step + "\n\nThe Decimal Equivalent is: \n" + Integer.parseInt(hexa, 16));
                switchDisplayable(getResultBox(), getHexaToDeci());//GEN-LINE:|7-commandAction|36|176-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|37|95-preAction
        } else if (displayable == LCM) {
            if (command == exitCommand) {//GEN-END:|7-commandAction|37|95-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|38|95-postAction
                // write post-action user code here
            } else if (command == helpCommand1) {//GEN-LINE:|7-commandAction|39|197-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|40|197-postAction
                // write post-action user code here
            } else if (command == okCommand4) {//GEN-LINE:|7-commandAction|41|99-preAction
                // write pre-action user code here
                int a1 = Integer.parseInt(this.textField5.getString());
                int b1 = Integer.parseInt(this.textField6.getString());
                int iA = a1, iB = b1;
                int tempG,gcdResult;
                
                while (a1 != 0 && b1 != 0){
                    tempG = a1;
                    a1 = b1;
                    b1 = tempG % b1;
                }
                
                if (a1 == 0) gcdResult = b1;
                else gcdResult = a1;
                
                int lcm = (iA * iB) / gcdResult;
                getResultBox().setString("lcm(a,b) = (a*b) / gcd(a,b)\n"
                                       + "lcm(" + iA + "," + iB + ") = (" + iA + "*" + iB + ") / " + "gcd(" + iA + "," + iB + ")\n"
                                       + "lcm(" + iA + "," + iB + ") = (" + (iA*iB) + ") / " + gcdResult + "\n"
                                       + "The LCM is : " + lcm);
                switchDisplayable(getResultBox(), getLCM());//GEN-LINE:|7-commandAction|42|99-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|43|52-preAction
        } else if (displayable == Menu) {
            if (command == exitCommand2) {//GEN-END:|7-commandAction|43|52-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|44|52-postAction
                // write post-action user code here
            } else if (command == okCommand2) {//GEN-LINE:|7-commandAction|45|57-preAction
                // write pre-action user code here
                if (choiceGroup.getSelectedIndex() == 0){
                    switchDisplayable(null,getModulo());
                } else if (choiceGroup.getSelectedIndex() == 1){
                    switchDisplayable(null,getPrimeFactor());
                } else if (choiceGroup.getSelectedIndex() == 2){
                    switchDisplayable(null,getGCD());
                } else if (choiceGroup.getSelectedIndex() == 3){
                    switchDisplayable(null,getLCM());
                } else if (choiceGroup.getSelectedIndex() == 4){
                    switchDisplayable(null,getDeciToBinary());
                } else if (choiceGroup.getSelectedIndex() == 5){
                    switchDisplayable(null,getDeciToOcta());
                } else if (choiceGroup.getSelectedIndex() == 6){
                    switchDisplayable(null,getDeciToHexa());
                } else if (choiceGroup.getSelectedIndex() == 7){
                    switchDisplayable(null,getBinaryToDeci());
                } else if (choiceGroup.getSelectedIndex() == 8){
                    switchDisplayable(null,getOctaToDeci());
                } else if (choiceGroup.getSelectedIndex() == 9){
                    switchDisplayable(null,getHexaToDeci());
                }
//GEN-LINE:|7-commandAction|46|57-postAction
                // write post-a ction user code here
            }//GEN-BEGIN:|7-commandAction|47|19-preAction
        } else if (displayable == Modulo) {
            if (command == exitCommand) {//GEN-END:|7-commandAction|47|19-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|48|19-postAction
                // write post-action user code here
            } else if (command == helpCommand1) {//GEN-LINE:|7-commandAction|49|196-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|50|196-postAction
                // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|51|31-preAction
                // write pre-action user code here
                int a = Integer.parseInt(this.textField.getString());
                int b = Integer.parseInt(this.textField1.getString());
                int modulo = a % b;
                getResultBox().setString("Modulo: " + modulo);
                switchDisplayable(getResultBox(), getModulo());//GEN-LINE:|7-commandAction|52|31-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|53|166-preAction
        } else if (displayable == OctaToDeci) {
            if (command == exitCommand) {//GEN-END:|7-commandAction|53|166-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|54|166-postAction
                // write post-action user code here
            } else if (command == helpCommand1) {//GEN-LINE:|7-commandAction|55|202-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|56|202-postAction
                // write post-action user code here
            } else if (command == okCommand8) {//GEN-LINE:|7-commandAction|57|169-preAction
                // write pre-action user code here
                String octa = this.textField11.getString(); 
                int i,j;
                
                String step = "(" + octa + ") = ";
                for (i = octa.length()-1 , j = 0; i >= 0; i--,j++){
                    if (j < octa.length()-1) step += octa.charAt(j) + "(8^" + i + ") + ";
                    else step += octa.charAt(j) + "(8^" + i + ")";
                }
                getResultBox().setString(step + "\n\nThe Decimal Equivalent is: \n" + Integer.parseInt(octa, 8));
                switchDisplayable(getResultBox(), getOctaToDeci());//GEN-LINE:|7-commandAction|58|169-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|59|39-preAction
        } else if (displayable == PrimeFactor) {
            if (command == exitCommand1) {//GEN-END:|7-commandAction|59|39-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|60|39-postAction
                // write post-action user code here
            } else if (command == helpCommand1) {//GEN-LINE:|7-commandAction|61|195-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|62|195-postAction
                // write post-action user code here
            } else if (command == okCommand1) {//GEN-LINE:|7-commandAction|63|43-preAction
                // write pre-action user code here
                int pNum = Integer.parseInt(this.textField2.getString());
                int initial = pNum;
                String pFactors = " ";
                int i = 2;
                while(pNum > 1){
                    if (pNum % i == 0){
                        if (pNum == initial){ // Do not print * if first number
                            pFactors = pFactors + i;
                        } else {
                            pFactors = pFactors + " * " + i;
                        }
                        pNum = pNum / i;
                        i = 2;
                    } else {
                        i++;
                    }
                }
                        
                getResultBox().setString(pFactors);
                switchDisplayable(getResultBox(), getPrimeFactor());//GEN-LINE:|7-commandAction|64|43-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|65|119-preAction
        } else if (displayable == splashScreen) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|65|119-preAction
                // write pre-action user code here
                switchDisplayable(null, getMenu());//GEN-LINE:|7-commandAction|66|119-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|67|7-postCommandAction
        }//GEN-END:|7-commandAction|67|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|68|
//</editor-fold>//GEN-END:|7-commandAction|68|







//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            exitCommand = new Command("Back", "", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Modulo ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of Modulo component.
     *
     * @return the initialized component instance
     */
    public Form getModulo() {
        if (Modulo == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            Modulo = new Form("Modulu", new Item[]{getTextField(), textField1, getSpacer()});//GEN-BEGIN:|14-getter|1|14-postInit
            Modulo.addCommand(getExitCommand());
            Modulo.addCommand(getOkCommand());
            Modulo.addCommand(getHelpCommand1());
            Modulo.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return Modulo;
    }
//</editor-fold>//GEN-END:|14-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|24-getter|0|24-preInit
    /**
     * Returns an initialized instance of textField component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField() {
        if (textField == null) {//GEN-END:|24-getter|0|24-preInit
            // write pre-init user code here
            textField = new TextField("A:", "", 32, TextField.ANY);//GEN-LINE:|24-getter|1|24-postInit
            // write post-init user code here
        }//GEN-BEGIN:|24-getter|2|
        return textField;
    }
//</editor-fold>//GEN-END:|24-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: spacer ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initialized instance of spacer component.
     *
     * @return the initialized component instance
     */
    public Spacer getSpacer() {
        if (spacer == null) {//GEN-END:|27-getter|0|27-preInit
            // write pre-init user code here
            spacer = new Spacer(16, 1);//GEN-LINE:|27-getter|1|27-postInit
            // write post-init user code here
        }//GEN-BEGIN:|27-getter|2|
        return spacer;
    }
//</editor-fold>//GEN-END:|27-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initialized instance of okCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|30-getter|0|30-preInit
            // write pre-init user code here
            okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|30-getter|1|30-postInit
            // write post-init user code here
        }//GEN-BEGIN:|30-getter|2|
        return okCommand;
    }
//</editor-fold>//GEN-END:|30-getter|2|







//<editor-fold defaultstate="collapsed" desc=" Generated Getter: PrimeFactor ">//GEN-BEGIN:|37-getter|0|37-preInit
    /**
     * Returns an initialized instance of PrimeFactor component.
     *
     * @return the initialized component instance
     */
    public Form getPrimeFactor() {
        if (PrimeFactor == null) {//GEN-END:|37-getter|0|37-preInit
            // write pre-init user code here
            PrimeFactor = new Form("Prime Factorization", new Item[]{getTextField2()});//GEN-BEGIN:|37-getter|1|37-postInit
            PrimeFactor.addCommand(getExitCommand1());
            PrimeFactor.addCommand(getOkCommand1());
            PrimeFactor.addCommand(getHelpCommand1());
            PrimeFactor.setCommandListener(this);//GEN-END:|37-getter|1|37-postInit
            // write post-init user code here
        }//GEN-BEGIN:|37-getter|2|
        return PrimeFactor;
    }
//</editor-fold>//GEN-END:|37-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|38-getter|0|38-preInit
    /**
     * Returns an initialized instance of exitCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|38-getter|0|38-preInit
            // write pre-init user code here
            exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|38-getter|1|38-postInit
            // write post-init user code here
        }//GEN-BEGIN:|38-getter|2|
        return exitCommand1;
    }
//</editor-fold>//GEN-END:|38-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField2 ">//GEN-BEGIN:|41-getter|0|41-preInit
    /**
     * Returns an initialized instance of textField2 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField2() {
        if (textField2 == null) {//GEN-END:|41-getter|0|41-preInit
            // write pre-init user code here
            textField2 = new TextField("Number", "", 32, TextField.ANY);//GEN-LINE:|41-getter|1|41-postInit
            // write post-init user code here
        }//GEN-BEGIN:|41-getter|2|
        return textField2;
    }
//</editor-fold>//GEN-END:|41-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand1 ">//GEN-BEGIN:|42-getter|0|42-preInit
    /**
     * Returns an initialized instance of okCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand1() {
        if (okCommand1 == null) {//GEN-END:|42-getter|0|42-preInit
            // write pre-init user code here
            okCommand1 = new Command("Ok", Command.OK, 0);//GEN-LINE:|42-getter|1|42-postInit
            // write post-init user code here
        }//GEN-BEGIN:|42-getter|2|
        return okCommand1;
    }
//</editor-fold>//GEN-END:|42-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Menu ">//GEN-BEGIN:|46-getter|0|46-preInit
    /**
     * Returns an initialized instance of Menu component.
     *
     * @return the initialized component instance
     */
    public Form getMenu() {
        if (Menu == null) {//GEN-END:|46-getter|0|46-preInit
            // write pre-init user code here
            Menu = new Form("Menu", new Item[]{getChoiceGroup()});//GEN-BEGIN:|46-getter|1|46-postInit
            Menu.addCommand(getExitCommand2());
            Menu.addCommand(getOkCommand2());
            Menu.setCommandListener(this);//GEN-END:|46-getter|1|46-postInit
            // write post-init user code here
        }//GEN-BEGIN:|46-getter|2|
        return Menu;
    }
//</editor-fold>//GEN-END:|46-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|48-getter|0|48-preInit
    /**
     * Returns an initialized instance of choiceGroup component.
     *
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {//GEN-END:|48-getter|0|48-preInit
            // write pre-init user code here
            choiceGroup = new ChoiceGroup("Choose Operation:", Choice.EXCLUSIVE);//GEN-BEGIN:|48-getter|1|48-postInit
            choiceGroup.append("Modulo", null);
            choiceGroup.append("Prime Factorization", null);
            choiceGroup.append("GCD", null);
            choiceGroup.append("LCM", null);
            choiceGroup.append("Decimal To Binary", null);
            choiceGroup.append("Decimal To Octadecimal", null);
            choiceGroup.append("Decimal To Hexadecimal", null);
            choiceGroup.append("Binary To Decimal", null);
            choiceGroup.append("Octadecimal To Decimal", null);
            choiceGroup.append("Hexadecimal To Decimal", null);
            choiceGroup.setLayout(ImageItem.LAYOUT_CENTER | Item.LAYOUT_TOP | Item.LAYOUT_BOTTOM | Item.LAYOUT_VCENTER | Item.LAYOUT_EXPAND | Item.LAYOUT_VEXPAND);
            choiceGroup.setFitPolicy(Choice.TEXT_WRAP_DEFAULT);
            choiceGroup.setSelectedFlags(new boolean[]{false, false, false, false, false, false, false, false, false, false});//GEN-END:|48-getter|1|48-postInit
            // write post-init user code here
        }//GEN-BEGIN:|48-getter|2|
        return choiceGroup;
    }
//</editor-fold>//GEN-END:|48-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|51-getter|0|51-preInit
    /**
     * Returns an initialized instance of exitCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand2() {
        if (exitCommand2 == null) {//GEN-END:|51-getter|0|51-preInit
            // write pre-init user code here
            exitCommand2 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|51-getter|1|51-postInit
            // write post-init user code here
        }//GEN-BEGIN:|51-getter|2|
        return exitCommand2;
    }
//</editor-fold>//GEN-END:|51-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand2 ">//GEN-BEGIN:|56-getter|0|56-preInit
    /**
     * Returns an initialized instance of okCommand2 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand2() {
        if (okCommand2 == null) {//GEN-END:|56-getter|0|56-preInit
            // write pre-init user code here
            okCommand2 = new Command("Ok", Command.OK, 0);//GEN-LINE:|56-getter|1|56-postInit
            // write post-init user code here
        }//GEN-BEGIN:|56-getter|2|
        return okCommand2;
    }
//</editor-fold>//GEN-END:|56-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: helpCommand ">//GEN-BEGIN:|70-getter|0|70-preInit
    /**
     * Returns an initialized instance of helpCommand component.
     *
     * @return the initialized component instance
     */
    public Command getHelpCommand() {
        if (helpCommand == null) {//GEN-END:|70-getter|0|70-preInit
            // write pre-init user code here
            helpCommand = new Command("Return to Menu", Command.HELP, 0);//GEN-LINE:|70-getter|1|70-postInit
            // write post-init user code here
        }//GEN-BEGIN:|70-getter|2|
        return helpCommand;
    }
//</editor-fold>//GEN-END:|70-getter|2|





//<editor-fold defaultstate="collapsed" desc=" Generated Getter: GCD ">//GEN-BEGIN:|79-getter|0|79-preInit
    /**
     * Returns an initialized instance of GCD component.
     *
     * @return the initialized component instance
     */
    public Form getGCD() {
        if (GCD == null) {//GEN-END:|79-getter|0|79-preInit
            // write pre-init user code here
            GCD = new Form("GCD", new Item[]{getTextField3(), getTextField4()});//GEN-BEGIN:|79-getter|1|79-postInit
            GCD.addCommand(getExitCommand());
            GCD.addCommand(getOkCommand3());
            GCD.addCommand(getHelpCommand1());
            GCD.setCommandListener(this);//GEN-END:|79-getter|1|79-postInit
            // write post-init user code here
        }//GEN-BEGIN:|79-getter|2|
        return GCD;
    }
//</editor-fold>//GEN-END:|79-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField3 ">//GEN-BEGIN:|84-getter|0|84-preInit
    /**
     * Returns an initialized instance of textField3 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField3() {
        if (textField3 == null) {//GEN-END:|84-getter|0|84-preInit
            // write pre-init user code here
            textField3 = new TextField("A:", "", 32, TextField.ANY);//GEN-LINE:|84-getter|1|84-postInit
            // write post-init user code here
        }//GEN-BEGIN:|84-getter|2|
        return textField3;
    }
//</editor-fold>//GEN-END:|84-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField4 ">//GEN-BEGIN:|85-getter|0|85-preInit
    /**
     * Returns an initialized instance of textField4 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField4() {
        if (textField4 == null) {//GEN-END:|85-getter|0|85-preInit
            // write pre-init user code here
            textField4 = new TextField("B:", "", 32, TextField.ANY);//GEN-LINE:|85-getter|1|85-postInit
            // write post-init user code here
        }//GEN-BEGIN:|85-getter|2|
        return textField4;
    }
//</editor-fold>//GEN-END:|85-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand3 ">//GEN-BEGIN:|87-getter|0|87-preInit
    /**
     * Returns an initialized instance of okCommand3 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand3() {
        if (okCommand3 == null) {//GEN-END:|87-getter|0|87-preInit
            // write pre-init user code here
            okCommand3 = new Command("Ok", Command.OK, 0);//GEN-LINE:|87-getter|1|87-postInit
            // write post-init user code here
        }//GEN-BEGIN:|87-getter|2|
        return okCommand3;
    }
//</editor-fold>//GEN-END:|87-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: ResultBox ">//GEN-BEGIN:|89-getter|0|89-preInit
    /**
     * Returns an initialized instance of ResultBox component.
     *
     * @return the initialized component instance
     */
    public Alert getResultBox() {
        if (ResultBox == null) {//GEN-END:|89-getter|0|89-preInit
            // write pre-init user code here
            ResultBox = new Alert("Result");//GEN-BEGIN:|89-getter|1|89-postInit
            ResultBox.setTimeout(Alert.FOREVER);//GEN-END:|89-getter|1|89-postInit
            // write post-init user code here
        }//GEN-BEGIN:|89-getter|2|
        return ResultBox;
    }
//</editor-fold>//GEN-END:|89-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: LCM ">//GEN-BEGIN:|92-getter|0|92-preInit
    /**
     * Returns an initialized instance of LCM component.
     *
     * @return the initialized component instance
     */
    public Form getLCM() {
        if (LCM == null) {//GEN-END:|92-getter|0|92-preInit
            // write pre-init user code here
            LCM = new Form("LCM", new Item[]{getTextField5(), getTextField6()});//GEN-BEGIN:|92-getter|1|92-postInit
            LCM.addCommand(getExitCommand());
            LCM.addCommand(getOkCommand4());
            LCM.addCommand(getHelpCommand1());
            LCM.setCommandListener(this);//GEN-END:|92-getter|1|92-postInit
            // write post-init user code here
        }//GEN-BEGIN:|92-getter|2|
        return LCM;
    }
//</editor-fold>//GEN-END:|92-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand4 ">//GEN-BEGIN:|98-getter|0|98-preInit
    /**
     * Returns an initialized instance of okCommand4 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand4() {
        if (okCommand4 == null) {//GEN-END:|98-getter|0|98-preInit
            // write pre-init user code here
            okCommand4 = new Command("Ok", Command.OK, 0);//GEN-LINE:|98-getter|1|98-postInit
            // write post-init user code here
        }//GEN-BEGIN:|98-getter|2|
        return okCommand4;
    }
//</editor-fold>//GEN-END:|98-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField5 ">//GEN-BEGIN:|101-getter|0|101-preInit
    /**
     * Returns an initialized instance of textField5 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField5() {
        if (textField5 == null) {//GEN-END:|101-getter|0|101-preInit
            // write pre-init user code here
            textField5 = new TextField("A:", "", 32, TextField.ANY);//GEN-LINE:|101-getter|1|101-postInit
            // write post-init user code here
        }//GEN-BEGIN:|101-getter|2|
        return textField5;
    }
//</editor-fold>//GEN-END:|101-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField6 ">//GEN-BEGIN:|102-getter|0|102-preInit
    /**
     * Returns an initialized instance of textField6 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField6() {
        if (textField6 == null) {//GEN-END:|102-getter|0|102-preInit
            // write pre-init user code here
            textField6 = new TextField("B:", "", 32, TextField.ANY);//GEN-LINE:|102-getter|1|102-postInit
            // write post-init user code here
        }//GEN-BEGIN:|102-getter|2|
        return textField6;
    }
//</editor-fold>//GEN-END:|102-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: DeciToBinary ">//GEN-BEGIN:|107-getter|0|107-preInit
    /**
     * Returns an initialized instance of DeciToBinary component.
     *
     * @return the initialized component instance
     */
    public Form getDeciToBinary() {
        if (DeciToBinary == null) {//GEN-END:|107-getter|0|107-preInit
            // write pre-init user code here
            DeciToBinary = new Form("Decimal To Binary", new Item[]{getTextField7()});//GEN-BEGIN:|107-getter|1|107-postInit
            DeciToBinary.addCommand(getExitCommand());
            DeciToBinary.addCommand(getOkCommand5());
            DeciToBinary.addCommand(getHelpCommand1());
            DeciToBinary.setCommandListener(this);//GEN-END:|107-getter|1|107-postInit
            // write post-init user code here
        }//GEN-BEGIN:|107-getter|2|
        return DeciToBinary;
    }
//</editor-fold>//GEN-END:|107-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand5 ">//GEN-BEGIN:|110-getter|0|110-preInit
    /**
     * Returns an initialized instance of okCommand5 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand5() {
        if (okCommand5 == null) {//GEN-END:|110-getter|0|110-preInit
            // write pre-init user code here
            okCommand5 = new Command("Ok", Command.OK, 0);//GEN-LINE:|110-getter|1|110-postInit
            // write post-init user code here
        }//GEN-BEGIN:|110-getter|2|
        return okCommand5;
    }
//</editor-fold>//GEN-END:|110-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField7 ">//GEN-BEGIN:|115-getter|0|115-preInit
    /**
     * Returns an initialized instance of textField7 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField7() {
        if (textField7 == null) {//GEN-END:|115-getter|0|115-preInit
            // write pre-init user code here
            textField7 = new TextField("Decimal:", "", 32, TextField.ANY);//GEN-LINE:|115-getter|1|115-postInit
            // write post-init user code here
        }//GEN-BEGIN:|115-getter|2|
        return textField7;
    }
//</editor-fold>//GEN-END:|115-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|117-getter|0|117-preInit
    /**
     * Returns an initialized instance of splashScreen component.
     *
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {//GEN-END:|117-getter|0|117-preInit
            // write pre-init user code here
        
            splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|117-getter|1|117-postInit
            splashScreen.setTitle("Discrete Math Operations");
            splashScreen.setCommandListener(this);
            splashScreen.setFullScreenMode(true);
            splashScreen.setImage(getImage1());
            splashScreen.setText("");
            splashScreen.setTimeout(3500);//GEN-END:|117-getter|1|117-postInit
            // write post-init user code here
            
        }//GEN-BEGIN:|117-getter|2|
        return splashScreen;
    }
//</editor-fold>//GEN-END:|117-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: image1 ">//GEN-BEGIN:|124-getter|0|124-preInit
    /**
     * Returns an initialized instance of image1 component.
     *
     * @return the initialized component instance
     */
    public Image getImage1() {
        if (image1 == null) {//GEN-END:|124-getter|0|124-preInit
            // write pre-init user code here
            try {//GEN-BEGIN:|124-getter|1|124-@java.io.IOException
                image1 = Image.createImage("/dMathOperations.jpg");
            } catch (java.io.IOException e) {//GEN-END:|124-getter|1|124-@java.io.IOException
                e.printStackTrace();
            }//GEN-LINE:|124-getter|2|124-postInit
            // write post-init user code here
        }//GEN-BEGIN:|124-getter|3|
        return image1;
    }
//</editor-fold>//GEN-END:|124-getter|3|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: DeciToOcta ">//GEN-BEGIN:|133-getter|0|133-preInit
    /**
     * Returns an initialized instance of DeciToOcta component.
     *
     * @return the initialized component instance
     */
    public Form getDeciToOcta() {
        if (DeciToOcta == null) {//GEN-END:|133-getter|0|133-preInit
            // write pre-init user code here
            DeciToOcta = new Form("Decimal To Octadecimal", new Item[]{getTextField8()});//GEN-BEGIN:|133-getter|1|133-postInit
            DeciToOcta.addCommand(getExitCommand());
            DeciToOcta.addCommand(getOkCommand());
            DeciToOcta.addCommand(getHelpCommand1());
            DeciToOcta.setCommandListener(this);//GEN-END:|133-getter|1|133-postInit
            // write post-init user code here
        }//GEN-BEGIN:|133-getter|2|
        return DeciToOcta;
    }
//</editor-fold>//GEN-END:|133-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField8 ">//GEN-BEGIN:|140-getter|0|140-preInit
    /**
     * Returns an initialized instance of textField8 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField8() {
        if (textField8 == null) {//GEN-END:|140-getter|0|140-preInit
            // write pre-init user code here
            textField8 = new TextField("Decimal:", "", 32, TextField.ANY);//GEN-LINE:|140-getter|1|140-postInit
            // write post-init user code here
        }//GEN-BEGIN:|140-getter|2|
        return textField8;
    }
//</editor-fold>//GEN-END:|140-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: DeciToHexa ">//GEN-BEGIN:|142-getter|0|142-preInit
    /**
     * Returns an initialized instance of DeciToHexa component.
     *
     * @return the initialized component instance
     */
    public Form getDeciToHexa() {
        if (DeciToHexa == null) {//GEN-END:|142-getter|0|142-preInit
            // write pre-init user code here
            DeciToHexa = new Form("Decimal To Hexadecimal", new Item[]{getTextField9()});//GEN-BEGIN:|142-getter|1|142-postInit
            DeciToHexa.addCommand(getExitCommand());
            DeciToHexa.addCommand(getOkCommand6());
            DeciToHexa.addCommand(getHelpCommand1());
            DeciToHexa.setCommandListener(this);//GEN-END:|142-getter|1|142-postInit
            // write post-init user code here
        }//GEN-BEGIN:|142-getter|2|
        return DeciToHexa;
    }
//</editor-fold>//GEN-END:|142-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand6 ">//GEN-BEGIN:|145-getter|0|145-preInit
    /**
     * Returns an initialized instance of okCommand6 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand6() {
        if (okCommand6 == null) {//GEN-END:|145-getter|0|145-preInit
            // write pre-init user code here
            okCommand6 = new Command("Ok", Command.OK, 0);//GEN-LINE:|145-getter|1|145-postInit
            // write post-init user code here
        }//GEN-BEGIN:|145-getter|2|
        return okCommand6;
    }
//</editor-fold>//GEN-END:|145-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField9 ">//GEN-BEGIN:|151-getter|0|151-preInit
    /**
     * Returns an initialized instance of textField9 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField9() {
        if (textField9 == null) {//GEN-END:|151-getter|0|151-preInit
            // write pre-init user code here
            textField9 = new TextField("Decimal:", "", 32, TextField.ANY);//GEN-LINE:|151-getter|1|151-postInit
            // write post-init user code here
        }//GEN-BEGIN:|151-getter|2|
        return textField9;
    }
//</editor-fold>//GEN-END:|151-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: BinaryToDeci ">//GEN-BEGIN:|156-getter|0|156-preInit
    /**
     * Returns an initialized instance of BinaryToDeci component.
     *
     * @return the initialized component instance
     */
    public Form getBinaryToDeci() {
        if (BinaryToDeci == null) {//GEN-END:|156-getter|0|156-preInit
            // write pre-init user code here
            BinaryToDeci = new Form("Binary To Decimal", new Item[]{getTextField10()});//GEN-BEGIN:|156-getter|1|156-postInit
            BinaryToDeci.addCommand(getExitCommand());
            BinaryToDeci.addCommand(getOkCommand7());
            BinaryToDeci.addCommand(getHelpCommand1());
            BinaryToDeci.setCommandListener(this);//GEN-END:|156-getter|1|156-postInit
            // write post-init user code here
        }//GEN-BEGIN:|156-getter|2|
        return BinaryToDeci;
    }
//</editor-fold>//GEN-END:|156-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: OctaToDeci ">//GEN-BEGIN:|157-getter|0|157-preInit
    /**
     * Returns an initialized instance of OctaToDeci component.
     *
     * @return the initialized component instance
     */
    public Form getOctaToDeci() {
        if (OctaToDeci == null) {//GEN-END:|157-getter|0|157-preInit
            // write pre-init user code here
            OctaToDeci = new Form("Octadecimal To Decimal", new Item[]{getTextField11()});//GEN-BEGIN:|157-getter|1|157-postInit
            OctaToDeci.addCommand(getExitCommand());
            OctaToDeci.addCommand(getOkCommand8());
            OctaToDeci.addCommand(getHelpCommand1());
            OctaToDeci.setCommandListener(this);//GEN-END:|157-getter|1|157-postInit
            // write post-init user code here
        }//GEN-BEGIN:|157-getter|2|
        return OctaToDeci;
    }
//</editor-fold>//GEN-END:|157-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: HexaToDeci ">//GEN-BEGIN:|158-getter|0|158-preInit
    /**
     * Returns an initialized instance of HexaToDeci component.
     *
     * @return the initialized component instance
     */
    public Form getHexaToDeci() {
        if (HexaToDeci == null) {//GEN-END:|158-getter|0|158-preInit
            // write pre-init user code here
            HexaToDeci = new Form("Hexadecimal To Decimal", new Item[]{getTextField12()});//GEN-BEGIN:|158-getter|1|158-postInit
            HexaToDeci.addCommand(getExitCommand());
            HexaToDeci.addCommand(getOkCommand9());
            HexaToDeci.addCommand(getHelpCommand1());
            HexaToDeci.setCommandListener(this);//GEN-END:|158-getter|1|158-postInit
            // write post-init user code here
        }//GEN-BEGIN:|158-getter|2|
        return HexaToDeci;
    }
//</editor-fold>//GEN-END:|158-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand7 ">//GEN-BEGIN:|161-getter|0|161-preInit
    /**
     * Returns an initialized instance of okCommand7 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand7() {
        if (okCommand7 == null) {//GEN-END:|161-getter|0|161-preInit
            // write pre-init user code here
            okCommand7 = new Command("Ok", Command.OK, 0);//GEN-LINE:|161-getter|1|161-postInit
            // write post-init user code here
        }//GEN-BEGIN:|161-getter|2|
        return okCommand7;
    }
//</editor-fold>//GEN-END:|161-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand8 ">//GEN-BEGIN:|168-getter|0|168-preInit
    /**
     * Returns an initialized instance of okCommand8 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand8() {
        if (okCommand8 == null) {//GEN-END:|168-getter|0|168-preInit
            // write pre-init user code here
            okCommand8 = new Command("Ok", Command.OK, 0);//GEN-LINE:|168-getter|1|168-postInit
            // write post-init user code here
        }//GEN-BEGIN:|168-getter|2|
        return okCommand8;
    }
//</editor-fold>//GEN-END:|168-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand9 ">//GEN-BEGIN:|175-getter|0|175-preInit
    /**
     * Returns an initialized instance of okCommand9 component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand9() {
        if (okCommand9 == null) {//GEN-END:|175-getter|0|175-preInit
            // write pre-init user code here
            okCommand9 = new Command("Ok", Command.OK, 0);//GEN-LINE:|175-getter|1|175-postInit
            // write post-init user code here
        }//GEN-BEGIN:|175-getter|2|
        return okCommand9;
    }
//</editor-fold>//GEN-END:|175-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField10 ">//GEN-BEGIN:|180-getter|0|180-preInit
    /**
     * Returns an initialized instance of textField10 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField10() {
        if (textField10 == null) {//GEN-END:|180-getter|0|180-preInit
            // write pre-init user code here
            textField10 = new TextField("Binary:", "", 32, TextField.ANY);//GEN-LINE:|180-getter|1|180-postInit
            // write post-init user code here
        }//GEN-BEGIN:|180-getter|2|
        return textField10;
    }
//</editor-fold>//GEN-END:|180-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField11 ">//GEN-BEGIN:|181-getter|0|181-preInit
    /**
     * Returns an initialized instance of textField11 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField11() {
        if (textField11 == null) {//GEN-END:|181-getter|0|181-preInit
            // write pre-init user code here
            textField11 = new TextField("Octadecimal", "", 32, TextField.ANY);//GEN-LINE:|181-getter|1|181-postInit
            // write post-init user code here
        }//GEN-BEGIN:|181-getter|2|
        return textField11;
    }
//</editor-fold>//GEN-END:|181-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField12 ">//GEN-BEGIN:|182-getter|0|182-preInit
    /**
     * Returns an initialized instance of textField12 component.
     *
     * @return the initialized component instance
     */
    public TextField getTextField12() {
        if (textField12 == null) {//GEN-END:|182-getter|0|182-preInit
            // write pre-init user code here
            textField12 = new TextField("Hexadecimal", "", 32, TextField.ANY);//GEN-LINE:|182-getter|1|182-postInit
            // write post-init user code here
        }//GEN-BEGIN:|182-getter|2|
        return textField12;
    }
//</editor-fold>//GEN-END:|182-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: helpCommand1 ">//GEN-BEGIN:|193-getter|0|193-preInit
    /**
     * Returns an initialized instance of helpCommand1 component.
     *
     * @return the initialized component instance
     */
    public Command getHelpCommand1() {
        if (helpCommand1 == null) {//GEN-END:|193-getter|0|193-preInit
            // write pre-init user code here
            helpCommand1 = new Command("Return to menu", Command.HELP, 0);//GEN-LINE:|193-getter|1|193-postInit
            // write post-init user code here
        }//GEN-BEGIN:|193-getter|2|
        return helpCommand1;
    }
//</editor-fold>//GEN-END:|193-getter|2|











    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
}
