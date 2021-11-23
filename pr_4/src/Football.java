import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football extends JFrame{
    private int scoreRM = 0;
    private int scoreAC = 0;
    private String lastScorer = "N/A";
    private String win = "Draw";
    private JButton addScoreRM, addScoreAM;
    private JLabel result, lastScore;
    private Label winner;

    public Football(){
        super("Football");
        this.result = new JLabel("Result: " + this.scoreRM + "X" + this.scoreAC);
        this.lastScore = new JLabel("Last scorer: " + this.lastScorer);
        this.winner = new Label("Winner: " + this.win);
        this.addScoreRM = new JButton("Real Madrid");
        this.addScoreAM = new JButton("AC Milan");

        JPanel buttons = new JPanel();
        buttons.setLayout((LayoutManager)null);
        buttons.setBackground(Color.green);
        buttons.add(this.addScoreRM);
        buttons.add(this.addScoreAM);
        this.addScoreRM.setBounds(10, 5, 100, 30);
        this.addScoreRM.setBackground(Color.white);
        this.addScoreAM.setBounds(280, 5, 100, 30);
        this.addScoreAM.setBackground(Color.red);
        buttons.add(this.result);
        this.result.setBounds(140, 1, 85, 30);
        buttons.add(this.lastScore);
        this.lastScore.setBounds(140, 20, 300, 30);
        buttons.add(this.winner);
        this.winner.setBounds(140, 50, 300, 30);
        this.add(buttons);
        this.setBounds(100, 100, 400, 120);
        this.setDefaultCloseOperation(3);
        this.initListeners();
    }

    private void updateScore(){
        this.result.setText("Result: " +this.scoreRM+"X"+this.scoreAC);
        this.lastScore.setText("Last scorer: " + this.lastScorer);
        if (this.scoreRM == 5 || this.scoreAC == 5)
        {
            this.winner.setText("Winner: " + this.win);
            this.addScoreRM.setEnabled(false);
            this.addScoreAM.setEnabled(false);
        }
    }

    private void initListeners(){
        this.addScoreRM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++Football.this.scoreRM;
                Football.this.lastScorer = "Real Madrid";
                Football.this.win = "Real Madrid";
                Football.this.updateScore();
            }
        });
        this.addScoreAM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++Football.this.scoreAC;
                Football.this.lastScorer = "AC Milan";
                Football.this.win = "AC Milan";
                Football.this.updateScore();
            }
        });
    }

}
