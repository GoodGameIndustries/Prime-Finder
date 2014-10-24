import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Emmett Deen
 * @version 1.0
 * @date Oct 23, 2014
 */
public class DTPGUI extends JFrame implements ActionListener{

	
	private ArrayList<Integer> primes = new ArrayList<Integer>();
	private int total = 0;
	private JTextField numbPrimes = new JTextField("Enter # of primes here");
	private JButton go;
	//private JTextField upperBound = new JTextField();
	private JTable table;
	private ScrollPane scroll = new ScrollPane();
	
	public DTPGUI(){
		super();
		go = new JButton("GO");
		go.addActionListener(this);
		
		this.setBounds(0,0,500,500);
		this.add(numbPrimes,BorderLayout.NORTH);
		this.add(scroll,BorderLayout.CENTER);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new DTPGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		genPrimes();
		
	}

	private void genPrimes() {
		primes.add(2);
		for(int i = 0; i<100; i++){
			int last = primes.size();
			boolean temp = true;
			for(int j=0; j<primes.size(); j++){
				if(primes.get(j)>(i/2)){break;}
				if(i%primes.get(j)==0){
					 temp= false;
				}
				
			}
			if(temp){primes.add(i);total++;}
			if(primes.size()>last){
				System.out.println(primes.get(primes.size()-1));
			}
		}
		System.out.println(total+" primes have been generated");
	}
		
	}

