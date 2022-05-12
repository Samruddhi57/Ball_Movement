import java.awt.Graphics;

import javax.swing.JFrame;

public class MultiThreading extends JFrame{
	static int x=20;
	int y=50;
	static int rad=50;
	static int x1=20;
	int y1=120;
	static int x2=20;
	int y2=180;
    static int x3=20;
	int y3=240;
	
	public MultiThreading()
	{
		setSize(500,500);
                setLayout(null);
		setVisible(true);
	}
	public void paint(Graphics G)
    {
        super.paint(G);
	G.fillOval(x,y,rad,rad);
	G.fillOval(x1,y1,rad,rad);
	G.fillOval(x2,y2,rad,rad);
    G.fillOval(x3,y3,rad,rad);
    }

	public static void main(String[] args) throws InterruptedException
	{
		MultiThreading m1=new MultiThreading ();
        Thread t1=new Thread(new Runnable()
		{
	      public void run()
	      {
		  while(true)
		  {
			  try
			  {
				  x++;
				  Thread.sleep(7);
				  m1.repaint();
				
			  }
			  catch(InterruptedException e1)
			  {
				
			  }
			
			  if(x==m1.getWidth()-rad)
			  {
				
				
				 while(x!=0)
				 {
					 try
					 {
					 x--;
					 Thread.sleep(7);
					 m1.repaint();
					 }
					 catch(InterruptedException e1)
			    {
				
			    }
				 }
				
				
			  }
		  }
	      }
		});
        t1.start();


        Thread t2=new Thread(new Runnable()
		{
          public void run()
	      {
		  while(true)
		  {
			  try
			  {
				  x1++;
				  Thread.sleep(2);
				  m1.repaint();
				
			  }
			  catch(InterruptedException e1)
			  {
				
			  }
			  if(x1==m1.getWidth()-rad)
			  {

				
				 while(x1!=0)
				 {
					 try
					 {
					 x1--;
					 Thread.sleep(2);
					 m1.repaint();
					 }
					 catch(InterruptedException e1)
			  {
				
			  }
				 } 
			  }
		  }
	      }
		});

        t2.start();


        Thread t3=new Thread(new Runnable()
		{
          public void run()
          {
		  while(true)
		  {
			  try
			  {
				  x2++;
				  Thread.sleep(5);
				  m1.repaint();
				
			  }
			  catch(InterruptedException e1)
			  {
				
			  }
			  if(x2==m1.getWidth()-rad)
			  {
				
				 while(x2!=0)
				 {
					 try
					 {
					 x2--;
					 Thread.sleep(5);
					 m1.repaint();
					 }
					 catch(InterruptedException e1)
			     {
				
			     }
					
				 }
				
				
			  }
		  }
	      }
		});
        t3.start();

        Thread t4=new Thread(new Runnable()
		{
          public void run()
          {
		  while(true)
		  {
			  try
			  {
				  x3++;
				  Thread.sleep(8);
				  m1.repaint();
				
			  }
			  catch(InterruptedException e1)
			  {
				
			  }
			  if(x3==m1.getWidth()-rad)
			  {
				
				 while(x3!=0)
				 {
					 try
					 {
					 x3--;
					 Thread.sleep(5);
					 m1.repaint();
					 }
					 catch(InterruptedException e1)
			     {
				
			     }
					
				 }
				
				
			  }
		  }
	      }
		});
        t4.start();

	}

}