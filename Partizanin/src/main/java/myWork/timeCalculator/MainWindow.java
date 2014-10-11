package myWork.timeCalculator;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 05.10.2014
 * Time:  14:17
 * To change this template use File|Setting|File Templates.
 */
public class MainWindow extends JFrame {

    private final JTextField textField1 = new JTextField();
    private final JTextField textField2 = new JTextField();

    private final JTextField textField1F = new JTextField();
    private final JTextField textField2F = new JTextField();


    private final JLabel lablePlus = new JLabel("");
    private final JLabel lableMinus = new JLabel("_");
    private final JLabel labelEquals = new JLabel("");

    private final JLabel lablePlusF = new JLabel("+");
    private final JLabel lableMinusF = new JLabel("");
    private final JLabel labelEqualsF = new JLabel("");
    private final JTextArea textArea = new JTextArea("");

    private final JButton buttonCount = new JButton("=");

    private final JButton buttonCountF = new JButton("=");
    private final JLabel labeTimeCount = new JLabel("Хвилини");
    private JMenuItem menuMinus;


    private MainWindow() {


        textArea.setRows(2);


        JPanel p1 = new JPanel();
        p1.setLayout(null);

        //x y width height


        textField1.setBounds(20, 25, 91, 40);
        textField1.setFont(new Font("", Font.PLAIN, 22));

        textField1F.setBounds(20, 90, 91, 40);
        textField1F.setFont(new Font("", Font.PLAIN, 22));

        lableMinus.setBounds(130, 7, 20, 42);

        lablePlus.setBounds(130, 22, 20, 42);

        lableMinusF.setBounds(130, 77, 20, 42);

        lablePlusF.setBounds(130, 92, 20, 42);

        labeTimeCount.setBounds(160, 92, 70, 42);
        labeTimeCount.setForeground(Color.RED);
        labeTimeCount.setFont(new Font("Serif", Font.BOLD, 15));

        textField2.setBounds(170, 25, 91, 40);

        textField2.setFont(new Font("", Font.PLAIN, 22));

        textField2F.setBounds(230, 95, 91, 40);
        textField2F.setFont(new Font("", Font.PLAIN, 22));

        labelEquals.setBounds(350, 25, 200, 40);
        labelEquals.setFont(new Font("", Font.BOLD, 22));
        labelEquals.setForeground(Color.DARK_GRAY);

        labelEqualsF.setBounds(410, 95, 200, 40);
        labelEqualsF.setFont(new Font("", Font.BOLD, 22));
        labelEqualsF.setForeground(Color.DARK_GRAY);

        buttonCount.setBounds(280, 25, 60, 40);
        buttonCount.setFont(new Font("Serif", Font.BOLD, 30));

        buttonCountF.setBounds(340, 95, 60, 40);
        buttonCountF.setFont(new Font("Serif", Font.BOLD, 30));


        lableMinus.setForeground(Color.RED);
        lableMinus.setFont(new Font("Serif", Font.BOLD, 30));

        lableMinusF.setForeground(Color.RED);
        lableMinusF.setFont(new Font("Serif", Font.BOLD, 30));


        lablePlus.setForeground(Color.RED);
        lablePlus.setFont(new Font("Serif", Font.BOLD, 30));


        lablePlusF.setForeground(Color.RED);
        lablePlusF.setFont(new Font("Serif", Font.BOLD, 30));

        textArea.setFont(new Font("Serif", Font.BOLD, 30));

        textArea.setForeground(Color.RED);


        textArea.setBackground(p1.getBackground());

        textArea.setBounds(20, 150, 450, 100);

        textArea.setEditable(false);
        textArea.setVisible(false);

        p1.add(textArea);
        p1.add(labeTimeCount);
        p1.add(textField1);
        p1.add(textField2);
        p1.add(buttonCount);
        p1.add(buttonCountF);
        p1.add(lablePlus);
        p1.add(lableMinus);
        p1.add(labelEquals);
        p1.add(labelEqualsF);
        p1.add(lableMinusF);
        p1.add(lablePlusF);
        p1.add(textField1F);
        p1.add(textField2F);


        add(p1);
        setSize(505, 265);
        setLocation(300, 250);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        textField1.setColumns(20);

        ButtonListener listener = new ButtonListener(this);
        ButtonListener2 listener2 = new ButtonListener2(this);
        buttonCount.addActionListener(listener);
        buttonCountF.addActionListener(listener2);
        setTitle("Frame2");


        PlainDocument plainDocument1 = new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                String chars = "1234567890";
                textArea.setVisible(false);
                if (getLength() > 7 || !chars.contains(str)) {
                    return;
                }

                if (getLength() > 1 && getLength() < 3
                        || getLength() > 4 && getLength() < 6) {

                    str = ":" + str;
                    super.insertString(offs, str, a);
                } else {
                    super.insertString(offs, str, a);
                }
            }


        };
        textField1.setDocument(plainDocument1);
        PlainDocument plainDocument2 = new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                String chars = "1234567890";
                if (getLength() > 7 || !chars.contains(str)) {
                    return;
                }
                textArea.setVisible(false);
                if (getLength() > 1 && getLength() < 3
                        || getLength() > 4 && getLength() < 6) {

                    str = ":" + str;
                    super.insertString(offs, str, a);
                } else {
                    super.insertString(offs, str, a);
                }
            }


        };
        textField2.setDocument(plainDocument2);
        PlainDocument plainDocument3 = new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                String chars = "1234567890";
                textArea.setVisible(false);
                if (getLength() > 7 || !chars.contains(str)) {
                    return;

                }

                if (getLength() > 1 && getLength() < 3
                        || getLength() > 4 && getLength() < 6) {

                    str = ":" + str;
                    super.insertString(offs, str, a);
                } else {
                    super.insertString(offs, str, a);
                }
            }


        };
        textField1F.setDocument(plainDocument3);
        PlainDocument plainDocument4 = new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                String chars = "1234567890+-";
                textArea.setVisible(false);


                if (!chars.contains(str)) {
                    //noinspection UnnecessaryReturnStatement
                    return;
                } else {

                    if (getLength() == 0 && str.equals("+") || getLength() == 0 && str.equals("-")) {
                        return;
                    }

                    if (!textField2F.getText().equals("")) {


                        String text = textField2F.getText();

                        if (text.charAt(text.length() - 1) == '-' && str.equals("-") ||
                                text.charAt(text.length() - 1) == '+' && str.equals("+") ||
                                text.charAt(text.length() - 1) == '-' && str.equals("+") ||
                                text.charAt(text.length() - 1) == '+' && str.equals("-")) {
                            return;
                        }
                    }

                    super.insertString(offs, str, a);
                }
            }


        };
        textField2F.setDocument(plainDocument4);

        MenuListener menuListener = new MenuListener(this);
        JPopupMenu p = new JPopupMenu();
        /*lableMinus.setComponentPopupMenu(p);*/
        lablePlus.setComponentPopupMenu(p);


        menuMinus = new JMenuItem("_");
        menuMinus.addActionListener(menuListener);
        p.add(menuMinus);
        p.addSeparator();
        JMenuItem menuPlus = new JMenuItem("+");
        menuPlus.addActionListener(menuListener);
        p.add(menuPlus);

        MenuListener2 menuListener2 = new MenuListener2(this);
        JPopupMenu p2 = new JPopupMenu();
        lableMinusF.setComponentPopupMenu(p2);
        lablePlusF.setComponentPopupMenu(p2);


        menuMinus = new JMenuItem("_");
        menuMinus.addActionListener(menuListener2);
        p2.add(menuMinus);
        p2.addSeparator();
        menuPlus = new JMenuItem("+");
        menuPlus.addActionListener(menuListener2);
        p2.add(menuPlus);


        MenuListener3 menuListener3 = new MenuListener3(this);
        JPopupMenu p3 = new JPopupMenu();
        labeTimeCount.setComponentPopupMenu(p3);

        JMenuItem timeMenu = new JMenuItem("Години");
        timeMenu.addActionListener(menuListener3);
        p3.add(timeMenu);
        p3.addSeparator();
        timeMenu = new JMenuItem("Хвилини");
        timeMenu.addActionListener(menuListener3);
        p3.add(timeMenu);
        p3.addSeparator();
        timeMenu = new JMenuItem("Секунди");
        timeMenu.addActionListener(menuListener3);
        p3.add(timeMenu);

    }

    private static String timePlus(String getTime1, String getTime2) {
        String hour = getTime1.substring(0, 2);
        String minutes = getTime1.substring(3, 5);
        String seconds = getTime1.substring(6, 8);

        LocalTime time = LocalTime.of(Integer.parseInt(hour), Integer.parseInt(minutes), Integer.parseInt(seconds));

        String hour2 = getTime2.substring(0, 2);
        String minutes2 = getTime2.substring(3, 5);
        String seconds2 = getTime2.substring(6, 8);

        time = time.plusHours(Integer.parseInt(hour2));
        time = time.plusMinutes(Integer.parseInt(minutes2));
        time = time.plusSeconds(Integer.parseInt(seconds2));

        return time.toString();
    }

    private static String timeMinus(String getTime1, String getTime2) {

        LocalTime time = LocalTime.of(Integer.parseInt(getTime1.substring(0, 2)),
                Integer.parseInt(getTime1.substring(3, 5)), Integer.parseInt(getTime1.substring(6, 8)));

        time = time.minusHours(Integer.parseInt(getTime2.substring(0, 2)));
        time = time.minusMinutes(Integer.parseInt(getTime2.substring(3, 5)));
        time = time.minusSeconds(Integer.parseInt(getTime2.substring(6, 8)));

        return time.toString();
    }

    private static Long getTextValue(String textValue) {

        String setText = "";

        if (textValue.charAt(textValue.length() - 1) == '+' ||
                textValue.charAt(textValue.length() - 1) == '-') {

            setText += textValue.substring(0, textValue.length() - 1);

            textValue = setText;
        }

        int summ = 0;
        String value = "";
        String operation = "";
        String operation2 = "";
        boolean firstVal = false;

        for (int i = 0; i < textValue.length(); i++) {


            if (!firstVal) {

                if (textValue.charAt(i) == '+' || textValue.charAt(i) == '-') {

                    operation += textValue.charAt(i);
                    firstVal = true;
                    summ += Integer.parseInt(value);
                    value = "";
                } else {
                    value += textValue.charAt(i);

                    if (!textValue.contains("+") && !textValue.contains("-") && i == textValue.length() - 1) {
                        summ += Integer.parseInt(value);
                    }
                }
            } else {

                if (i == textValue.length() - 1) {
                    if (operation.equals("+")) {
                        summ += Integer.parseInt(value += String.valueOf(textValue.charAt(i)));
                    } else {
                        summ -= Integer.parseInt(value += String.valueOf(textValue.charAt(i)));
                    }
                } else if (textValue.charAt(i) == '+' || textValue.charAt(i) == '-') {
                    operation2 += textValue.charAt(i);

                    if (operation.equals("+")) {
                        summ += Integer.parseInt(value);
                    } else {
                        summ -= Integer.parseInt(value);
                    }


                    operation = operation2;
                    operation2 = "";
                    value = "";
                } else if (textValue.charAt(i) != '+' && textValue.charAt(i) != '-') {
                    value += textValue.charAt(i);
                }

            }

        }

        return (long) summ;
    }

    private static String testTime(String textValue) {

        int hour = Integer.parseInt(textValue.substring(0, 2));
        int minutes = Integer.parseInt(textValue.substring(3, 5));
        int seconds = Integer.parseInt(textValue.substring(6, 8));

        if (hour > 23) {
            return "Значення годин не може бути\n більше 23!";
        } else if (minutes > 60) {
            return "Значення хвилини не може бути\n більше 60!";
        } else if (seconds > 60) {
            return "Значення секунди не може бути\n більше 60!";
        }

        return "";
    }

    public static void main(String[] args) {
        new MainWindow();
    }

    String timePlusMinutes(String getTime1, String getTime2) {
        String hour = getTime1.substring(0, 2);
        String minutes = getTime1.substring(3, 5);
        String seconds = getTime1.substring(6, 8);


        LocalTime time = LocalTime.of(Integer.parseInt(hour), Integer.parseInt(minutes), Integer.parseInt(seconds));


        time = time.plusMinutes(getTextValue(getTime2));


        return time.toString();
    }

    String timePlusHours(String getTime1, String getTime2) {
        String hour = getTime1.substring(0, 2);
        String minutes = getTime1.substring(3, 5);
        String seconds = getTime1.substring(6, 8);


        LocalTime time = LocalTime.of(Integer.parseInt(hour), Integer.parseInt(minutes), Integer.parseInt(seconds));


        time = time.plusHours(getTextValue(getTime2));


        return time.toString();
    }

    String timePlusSeconds(String getTime1, String getTime2) {
        String hour = getTime1.substring(0, 2);
        String minutes = getTime1.substring(3, 5);
        String seconds = getTime1.substring(6, 8);


        LocalTime time = LocalTime.of(Integer.parseInt(hour), Integer.parseInt(minutes), Integer.parseInt(seconds));


        time = time.plusSeconds(getTextValue(getTime2));


        return time.toString();
    }

    String timeMinusMinutes(String getTime1, String getTime2) {
        String hour = getTime1.substring(0, 2);
        String minutes = getTime1.substring(3, 5);
        String seconds = getTime1.substring(6, 8);


        LocalTime time = LocalTime.of(Integer.parseInt(hour), Integer.parseInt(minutes), Integer.parseInt(seconds));


        time = time.minusMinutes(getTextValue(getTime2));


        return time.toString();
    }

    String timeMinusHours(String getTime1, String getTime2) {
        String hour = getTime1.substring(0, 2);
        String minutes = getTime1.substring(3, 5);
        String seconds = getTime1.substring(6, 8);


        LocalTime time = LocalTime.of(Integer.parseInt(hour), Integer.parseInt(minutes), Integer.parseInt(seconds));


        time = time.minusHours(getTextValue(getTime2));


        return time.toString();
    }

    String timeMinusSeconds(String getTime1, String getTime2) {
        String hour = getTime1.substring(0, 2);
        String minutes = getTime1.substring(3, 5);
        String seconds = getTime1.substring(6, 8);


        LocalTime time = LocalTime.of(Integer.parseInt(hour), Integer.parseInt(minutes), Integer.parseInt(seconds));


        time = time.minusSeconds(getTextValue(getTime2));


        return time.toString();
    }

    public class MenuListener implements ActionListener {
        final MainWindow parent;

        MenuListener(MainWindow parent) {
            this.parent = parent;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (lableMinus.getText().equals("_")) {
                lableMinus.setText("");
                lablePlus.setText(((JMenuItem) e.getSource()).getText());
            } else {

                lablePlus.setText("");
                lableMinus.setText(((JMenuItem) e.getSource()).getText());
            }
        }
    }

    public class MenuListener2 implements ActionListener {
        final MainWindow parent;

        MenuListener2(MainWindow parent) {
            this.parent = parent;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem clickedMenu = (JMenuItem) e.getSource();

            if (clickedMenu.equals(parent.menuMinus)) {
                lablePlusF.setText("");
                lableMinusF.setText(((JMenuItem) e.getSource()).getText());
            } else {
                lableMinusF.setText("");
                lablePlusF.setText(((JMenuItem) e.getSource()).getText());
            }
        }
    }

    public class MenuListener3 implements ActionListener {
        final MainWindow parent;

        MenuListener3(MainWindow parent) {
            this.parent = parent;
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem clickedMenu = (JMenuItem) e.getSource();

            if (clickedMenu.getText().equals("Години")) {
                labeTimeCount.setText("Години");
            } else if (clickedMenu.getText().equals("Хвилини")) {
                labeTimeCount.setText("Хвилини");
            } else if (clickedMenu.getText().equals("Секунди")) {
                labeTimeCount.setText("Секунди");
            }
        }
    }

    public class ButtonListener implements ActionListener {

        final MainWindow parent;

        ButtonListener(MainWindow parent) {
            this.parent = parent;
        }


        @Override
        public void actionPerformed(ActionEvent e) {

            JButton clickedButton = (JButton) e.getSource();
            textArea.setText("");
            if (clickedButton.equals(parent.buttonCount)) {

                boolean error = false;
                try {
                    String s = "";
                    s = textField1.getText();
                    s = textField2.getText();
                    s = textField1.getText().substring(8);
                    s = textField2.getText().substring(8);

                    String test = testTime(textField1.getText());

                    if (!test.equals("")) {
                        textArea.setText(test);
                        textArea.setVisible(true);
                        error = true;
                    }
                    test = testTime(textField2.getText());
                    if (!test.equals("")) {
                        textArea.setText(test);
                        textArea.setVisible(true);
                        error = true;
                    }

                } catch (NullPointerException ex) {
                    textArea.setText("Будьласка заповніть всі поля!");
                    textArea.setVisible(true);
                    error = true;


                } catch (IndexOutOfBoundsException ee) {

                    textArea.setText("Будьласка заповніть всі поля!");
                    textArea.setVisible(true);


                    error = true;
                }


                if (!error) {


                    if (!lableMinus.getText().equals("")) {
                        labelEquals.setText(timeMinus(textField1.getText(), textField2.getText()));

                    } else {
                        labelEquals.setText(timePlus(textField1.getText(), textField2.getText()));
                    }
                }

            }
        }
    }

    public class ButtonListener2 implements ActionListener {

        final MainWindow parent;

        ButtonListener2(MainWindow parent) {
            this.parent = parent;
        }


        @Override
        public void actionPerformed(ActionEvent e) {

            JButton clickedButton = (JButton) e.getSource();
            textArea.setText("");
            if (clickedButton.equals(parent.buttonCountF)) {

                boolean error = false;
                try {
                    String s = "";
                    s = textField1F.getText();
                    s = textField2F.getText();
                    s = textField1F.getText().substring(8);
                    s = textField2F.getText().substring(1);

                    String test = testTime(textField1F.getText());
                    if (!test.equals("")) {
                        textArea.setText(test);
                        textArea.setVisible(true);
                        error = true;
                    }


                } catch (NullPointerException ex) {
                    textArea.setText("Будьласка заповніть всі поля!");
                    textArea.setVisible(true);
                    error = true;


                } catch (IndexOutOfBoundsException ee) {

                    textArea.setText("Будьласка заповніть всі поля!");
                    textArea.setVisible(true);


                    error = true;
                }


                if (!error) {


                    if (!lableMinusF.getText().equals("")) {

                        if (labeTimeCount.getText().equals("Години")) {
                            labelEqualsF.setText(timeMinusHours(textField1F.getText(), textField2F.getText()));
                        } else if (labeTimeCount.getText().equals("Хвилини")) {
                            labelEqualsF.setText(timeMinusMinutes(textField1F.getText(), textField2F.getText()));
                        } else if (labeTimeCount.getText().equals("Секунди")) {
                            labelEqualsF.setText(timeMinusSeconds(textField1F.getText(), textField2F.getText()));
                        }

                    } else {

                        if (labeTimeCount.getText().equals("Години")) {
                            labelEqualsF.setText(timePlusHours(textField1F.getText(), textField2F.getText()));
                        } else if (labeTimeCount.getText().equals("Хвилини")) {
                            labelEqualsF.setText(timePlusMinutes(textField1F.getText(), textField2F.getText()));
                        } else if (labeTimeCount.getText().equals("Секунди")) {
                            labelEqualsF.setText(timePlusSeconds(textField1F.getText(), textField2F.getText()));
                        }

                    }
                }

            }
        }
    }

}

