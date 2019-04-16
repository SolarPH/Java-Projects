// Program made by SolarPH
// Contact Links:
//Discord: SolarPH_GFX_MC@4914
//Twitter: https://twitter.com/solarph_
//Facebook Page: https://www.facebook.com/pg/solarphmedia/posts/
//Instagram: https://www.instagram.com/solarph_media/
//Minecraft Amino: http://aminoapps.com/p/5ingl 

import java.awt.*;
import javax.swing.*;

public class GoombaSimplifiedDraw extends JFrame
{
	
	Container con = getContentPane();
	final int GOS_X = 25, GOS_Y = 50;
	int delay = 1;
	
	public GoombaSimplifiedDraw()
	{
		con.setBackground(Color.BLUE);
		con.setLayout(new FlowLayout());
	}
	
	public void paint(Graphics gfx)
	{
		super.paint(gfx);
		//gfx.setColor(Color.WHITE); // Art Border Color
		//gfx.drawRect(0+GOS_X,0+GOS_Y,256,256); // Art Border
		
		gfx.setColor(Color.BLACK);
		
		// Layer 1
		for (int i_Head1 = 0; i_Head1 <= 160; i_Head1++)
		{
			gfx.drawArc(64+GOS_X,12+GOS_Y,128,128,10,i_Head1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_Head2 = 0; i_Head2 <= 171; i_Head2++)
		{
			gfx.drawArc(18+GOS_X,64+GOS_Y,110,110,99,i_Head2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_Head3 = 0; i_Head3 <= 117; i_Head3++)
		{
			gfx.drawLine(69+GOS_X,173+GOS_Y,(69+i_Head3)+GOS_X,173+GOS_Y);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_Head4 = 0; i_Head4 <= 171; i_Head4++)
		{
			gfx.drawArc(128+GOS_X,64+GOS_Y,110,110,270,i_Head4);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_Body = 0; i_Body <= 210; i_Body++)
		{
			gfx.drawArc(88+GOS_X,144+GOS_Y,80,80,165,i_Body);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_LeftFoot1 = 0; i_LeftFoot1 <= 87; i_LeftFoot1++)
		{
			gfx.drawArc(32+GOS_X,204+GOS_Y,128,40,93,i_LeftFoot1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_LeftFoot2 = 5; i_LeftFoot2 <= 90; i_LeftFoot2++)
		{
			gfx.drawArc(32+GOS_X,204+GOS_Y,64,40,180,i_LeftFoot2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_LeftFoot3 = 0; i_LeftFoot3 <= 90; i_LeftFoot3++)
		{
			gfx.drawArc(0+GOS_X,204+GOS_Y,128,40,270,i_LeftFoot3);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_RightFoot1 = 5; i_RightFoot1 <= 90; i_RightFoot1++)
		{
			gfx.drawArc(128+GOS_X,204+GOS_Y,128,40,180,i_RightFoot1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_RightFoot2 = 5; i_RightFoot2 <= 90; i_RightFoot2++)
		{
			gfx.drawArc(160+GOS_X,204+GOS_Y,64,40,270,i_RightFoot2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_RightFoot3 = 0; i_RightFoot3 <= 87; i_RightFoot3++)
		{
			gfx.drawArc(96+GOS_X,204+GOS_Y,128,40,0,i_RightFoot3);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		
		// Fill Layer 1
		gfx.setColor(Color.decode("#7A565A"));
		for (int i_FillHead1 = 0; i_FillHead1 <= 160; i_FillHead1++)
		{
			gfx.fillArc(64+GOS_X,12+GOS_Y,128,128,10,i_FillHead1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillHead2 = 0; i_FillHead2 <= 171; i_FillHead2++)
		{
			gfx.fillArc(18+GOS_X,64+GOS_Y,110,110,99,i_FillHead2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillHead3 = 0; i_FillHead3 <= 109; i_FillHead3++)
		{
			gfx.fillRect(65+GOS_X,65+GOS_Y,126,i_FillHead3);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillHead4 = 0; i_FillHead4 <= 171; i_FillHead4++)
		{
			gfx.fillArc(128+GOS_X,64+GOS_Y,110,110,270,i_FillHead4);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillBody1 = 0; i_FillBody1 <= 210; i_FillBody1++)
		{
			gfx.fillArc(88+GOS_X,144+GOS_Y,80,80,165,i_FillBody1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillBody2 = 0; i_FillBody2 <= 20; i_FillBody2++)
		{
			gfx.fillRect(89+GOS_X,171+GOS_Y,78,i_FillBody2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillLeftFoot1 = 0; i_FillLeftFoot1 <= 87; i_FillLeftFoot1++)
		{
			gfx.fillArc(32+GOS_X,204+GOS_Y,128,40,93,i_FillLeftFoot1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillLeftFoot2 = 5; i_FillLeftFoot2 <= 90; i_FillLeftFoot2++)
		{
			gfx.fillArc(32+GOS_X,204+GOS_Y,64,40,180,i_FillLeftFoot2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillLeftFoot3 = 0; i_FillLeftFoot3 <= 90; i_FillLeftFoot3++)
		{
			gfx.fillArc(0+GOS_X,204+GOS_Y,128,40,270,i_FillLeftFoot3);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillLeftFoot4 = 0; i_FillLeftFoot4 <= 20; i_FillLeftFoot4++)
		{
			gfx.fillRect(93+GOS_X,204+GOS_Y,35,i_FillLeftFoot4);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillRightFoot1 = 5; i_FillRightFoot1 <= 90; i_FillRightFoot1++)
		{
			gfx.fillArc(128+GOS_X,204+GOS_Y,128,40,180,i_FillRightFoot1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillRightFoot2 = 5; i_FillRightFoot2 <= 90; i_FillRightFoot2++)
		{
			gfx.fillArc(160+GOS_X,204+GOS_Y,64,40,270,i_FillRightFoot2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillRightFoot3 = 0; i_FillRightFoot3 <= 87; i_FillRightFoot3++)
		{
			gfx.fillArc(96+GOS_X,204+GOS_Y,128,40,0,i_FillRightFoot3);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i_FillRightFoot4 = 0; i_FillRightFoot4 <= 20; i_FillRightFoot4++)
		{
			gfx.fillRect(129+GOS_X,204+GOS_Y,35,i_FillRightFoot4);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		
		
		//Layer2
		gfx.setColor(Color.WHITE);
		for (int i2_Head1 = 0; i2_Head1 <= 164; i2_Head1++)
		{
			gfx.drawArc(67+GOS_X,15+GOS_Y,122,122,8,i2_Head1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_Head2 = 0; i2_Head2 <= 173; i2_Head2++)
		{
			gfx.drawArc(21+GOS_X,67+GOS_Y,104,104,96,i2_Head2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_Head3 = 0; i2_Head3 <= 115; i2_Head3++)
		{
			gfx.drawLine(70+GOS_X,170+GOS_Y,(70+i2_Head3)+GOS_X,170+GOS_Y);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_Head4 = 0; i2_Head4 <= 173; i2_Head4++)
		{
			gfx.drawArc(131+GOS_X,67+GOS_Y,104,104,270,i2_Head4);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_Body = 0; i2_Body <= 225; i2_Body++)
		{
			gfx.drawArc(91+GOS_X,147+GOS_Y,74,74,157,i2_Body);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_LeftFoot1 = 0; i2_LeftFoot1 <= 93; i2_LeftFoot1++)
		{
			gfx.drawArc(35+GOS_X,207+GOS_Y,122,34,87,i2_LeftFoot1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_LeftFoot2 = 5; i2_LeftFoot2 <= 90; i2_LeftFoot2++)
		{
			gfx.drawArc(35+GOS_X,207+GOS_Y,58,34,180,i2_LeftFoot2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_LeftFoot3 = 0; i2_LeftFoot3 <= 100; i2_LeftFoot3++)
		{
			gfx.drawArc(3+GOS_X,207+GOS_Y,122,34,270,i2_LeftFoot3);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_RightFoot1 = 0; i2_RightFoot1 <= 97; i2_RightFoot1++)
		{
			gfx.drawArc(131+GOS_X,207+GOS_Y,122,34,173,i2_RightFoot1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_RightFoot2 = 0; i2_RightFoot2 <= 90; i2_RightFoot2++)
		{
			gfx.drawArc(163+GOS_X,207+GOS_Y,58,34,270,i2_RightFoot2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_RightFoot3 = 0; i2_RightFoot3 <= 93; i2_RightFoot3++)
		{
			gfx.drawArc(99+GOS_X,207+GOS_Y,122,34,0,i2_RightFoot3);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		
		// Fill Layer 2
		gfx.setColor(Color.decode("#986260"));
		for (int i2_FillLeftFoot1 = 0; i2_FillLeftFoot1 <= 93; i2_FillLeftFoot1++)
		{
			gfx.fillArc(35+GOS_X,207+GOS_Y,122,34,87,i2_FillLeftFoot1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_FillLeftFoot2 = 5; i2_FillLeftFoot2 <= 90; i2_FillLeftFoot2++)
		{
			gfx.fillArc(35+GOS_X,207+GOS_Y,58,34,180,i2_FillLeftFoot2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_FillLeftFoot3 = 0; i2_FillLeftFoot3 <= 100; i2_FillLeftFoot3++)
		{
			gfx.fillArc(3+GOS_X,207+GOS_Y,122,34,270,i2_FillLeftFoot3);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_FillLeftFoot4 = 0; i2_FillLeftFoot4 <= 18; i2_FillLeftFoot4++)
		{
			gfx.fillRect(95+GOS_X,207+GOS_Y,29,i2_FillLeftFoot4);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_FillRightFoot1 = 0; i2_FillRightFoot1 <= 97; i2_FillRightFoot1++)
		{
			gfx.fillArc(131+GOS_X,207+GOS_Y,122,34,173,i2_FillRightFoot1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_FillRightFoot2 = 0; i2_FillRightFoot2 <= 90; i2_FillRightFoot2++)
		{
			gfx.fillArc(163+GOS_X,207+GOS_Y,58,34,270,i2_FillRightFoot2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_FillRightFoot3 = 0; i2_FillRightFoot3 <= 93; i2_FillRightFoot3++)
		{
			gfx.fillArc(99+GOS_X,207+GOS_Y,122,34,0,i2_FillRightFoot3);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_FillRightFoot4 = 0; i2_FillRightFoot4 <= 18; i2_FillRightFoot4++)
		{
			gfx.fillRect(131+GOS_X,207+GOS_Y,29,i2_FillRightFoot4);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		gfx.setColor(Color.decode("#FADFB2"));
		for (int i2_FillBody1 = 0; i2_FillBody1 <= 225; i2_FillBody1++)
		{
			gfx.fillArc(91+GOS_X,147+GOS_Y,74,74,157,i2_FillBody1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_FillBody2 = 0; i2_FillBody2 <= 25; i2_FillBody2++)
		{
			gfx.fillRect(92+GOS_X,160+GOS_Y,72,i2_FillBody2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		gfx.setColor(Color.decode("#BE7A65"));
		for (int i2_FillHead1 = 0; i2_FillHead1 <= 164; i2_FillHead1++)
		{
			gfx.fillArc(67+GOS_X,15+GOS_Y,122,122,8,i2_FillHead1);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_FillHead2 = 0; i2_FillHead2 <= 173; i2_FillHead2++)
		{
			gfx.fillArc(21+GOS_X,67+GOS_Y,104,104,96,i2_FillHead2);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_FillHead3 = 0; i2_FillHead3 <= 104; i2_FillHead3++)
		{
			gfx.fillRect(68+GOS_X,67+GOS_Y,120,i2_FillHead3);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i2_FillHead4 = 0; i2_FillHead4 <= 173; i2_FillHead4++)
		{
			gfx.fillArc(131+GOS_X,67+GOS_Y,104,104,270,i2_FillHead4);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		
		// Layer 3
		gfx.setColor(Color.WHITE);
		for (int i3_LeftEye = 0; i3_LeftEye <= 360; i3_LeftEye++)
		{
			gfx.drawArc(85+GOS_X,71+GOS_Y,30,46,0,i3_LeftEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i3_RightEye = 0; i3_RightEye <= 360; i3_RightEye++)
		{
			gfx.drawArc(141+GOS_X,71+GOS_Y,30,46,0,i3_RightEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		int c3_Mouth1X = 0, c3_Mouth1Y = 0; double m3_Mouth1 = 0.0;
		for (int i3_Mouth1 = 0; i3_Mouth1 <= 24; i3_Mouth1++)
		{
			// x_length = 14 , y_length = 24
			m3_Mouth1 = (14.0/24.0) * c3_Mouth1Y;
			c3_Mouth1X = (int)m3_Mouth1;
			gfx.drawLine(64+GOS_X,147+GOS_Y,(64+c3_Mouth1X)+GOS_X,(147-c3_Mouth1Y)+GOS_Y);
			c3_Mouth1Y++;
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		int c3_Mouth2X = 0, c3_Mouth2Y = 0; double m3_Mouth2 = 0.0;
		for (int i3_Mouth2 = 0; i3_Mouth2 <= 19; i3_Mouth2++)
		{
			// x_length = 11 , y_length = 19
			m3_Mouth2 = (11.0/19.0) * c3_Mouth2Y;
			c3_Mouth2X = (int)m3_Mouth2;
			gfx.drawLine(79+GOS_X,123+GOS_Y,(79+c3_Mouth2X)+GOS_X,(123+c3_Mouth2Y)+GOS_Y);
			c3_Mouth2Y++;
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i3_Mouth3 = 0; i3_Mouth3 <= 75; i3_Mouth3++)
		{
			gfx.drawLine(90+GOS_X,142+GOS_Y,(90+i3_Mouth3)+GOS_X,142+GOS_Y);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		int c3_Mouth4X = 0, c3_Mouth4Y = 0; double m3_Mouth4 = 0.0;
		for (int i3_Mouth4 = 0; i3_Mouth4 <= 19; i3_Mouth4++)
		{
			// x_length = 13 , y_length = 19
			m3_Mouth4 = (13.0/19.0) * c3_Mouth4Y;
			c3_Mouth4X = (int)m3_Mouth4;
			gfx.drawLine(165+GOS_X,142+GOS_Y,(165+c3_Mouth4X)+GOS_X,(142-c3_Mouth4Y)+GOS_Y);
			c3_Mouth4Y++;
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		int c3_Mouth5X = 0, c3_Mouth5Y = 0; double m3_Mouth5 = 0.0;
		for (int i3_Mouth5 = 0; i3_Mouth5 <= 24; i3_Mouth5++)
		{
			// x_length = 14 , y_length = 24
			m3_Mouth5 = (14.0/24.0) * c3_Mouth5Y;
			c3_Mouth5X = (int)m3_Mouth5;
			gfx.drawLine(178+GOS_X,123+GOS_Y,(178+c3_Mouth5X)+GOS_X,(123+c3_Mouth5Y)+GOS_Y);
			c3_Mouth5Y++;
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i3_Mouth6 = 0; i3_Mouth6 <= 128; i3_Mouth6++)
		{
			gfx.drawLine(192+GOS_X,147+GOS_Y,(192-i3_Mouth6)+GOS_X,147+GOS_Y);
			
			try{Thread.sleep(delay);}catch(Exception e){}
		}
		
		// Fill Layer 3
		gfx.setColor(Color.decode("#7A565A"));
		for (int i3_FillLeftEye = 0; i3_FillLeftEye <= 360; i3_FillLeftEye++)
		{
			gfx.fillArc(85+GOS_X,71+GOS_Y,30,46,0,i3_FillLeftEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i3_FillRightEye = 0; i3_FillRightEye <= 360; i3_FillRightEye++)
		{
			gfx.fillArc(141+GOS_X,71+GOS_Y,30,46,0,i3_FillRightEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i3_FillMouth1 = 0; i3_FillMouth1 <= 14; i3_FillMouth1++)
		{
			gfx.drawLine((64+i3_FillMouth1)+GOS_X,147+GOS_Y,78+GOS_X,123+GOS_Y);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i3_FillMouth2 = 0; i3_FillMouth2 <= 11; i3_FillMouth2++)
		{
			gfx.drawLine(79+GOS_X,123+GOS_Y,(79+i3_FillMouth2)+GOS_X,142+GOS_Y);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i3_FillMouth3 = 0; i3_FillMouth3 <= 123; i3_FillMouth3++)
		{
			gfx.fillRect(67+GOS_X,143+GOS_Y,i3_FillMouth3,6);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i3_FillMouth4 = 0; i3_FillMouth4 <= 13; i3_FillMouth4++)
		{
			gfx.drawLine((165+i3_FillMouth4)+GOS_X,142+GOS_Y,178+GOS_X,123+GOS_Y);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i3_FillMouth5 = 0; i3_FillMouth5 <= 14; i3_FillMouth5++)
		{
			gfx.drawLine(178+GOS_X,123+GOS_Y,(178+i3_FillMouth5)+GOS_X,147+GOS_Y);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		
		// Layer 4
		gfx.setColor(Color.WHITE);
		for (int i4_LeftEye = 0; i4_LeftEye <= 360; i4_LeftEye++)
		{
			gfx.drawArc(88+GOS_X,74+GOS_Y,24,40,0,i4_LeftEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i4_RightEye = 0; i4_RightEye <= 360; i4_RightEye++)
		{
			gfx.drawArc(144+GOS_X,74+GOS_Y,24,40,0,i4_RightEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		int c4_LeftTooth1X = 0, c4_LeftTooth1Y = 0; double m4_LeftTooth1 = 0.0;
		for (int i4_LeftTooth1 = 0; i4_LeftTooth1 <=17; i4_LeftTooth1++)
		{
			// x_length = 9, y_length = 17
			gfx.drawLine(69+GOS_X,144+GOS_Y,(69+c4_LeftTooth1X)+GOS_X,(144-c4_LeftTooth1Y)+GOS_Y);
			m4_LeftTooth1 = (9.0/17.0) * c4_LeftTooth1Y;
			c4_LeftTooth1X = (int)m4_LeftTooth1;
			c4_LeftTooth1Y++;
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		int c4_LeftTooth2X = 0, c4_LeftTooth2Y = 0; double m4_LeftTooth2 = 0.0;
		for (int i4_LeftTooth2 = 0; i4_LeftTooth2 <=17; i4_LeftTooth2++)
		{
			// x_length = 9, y_length = 17
			gfx.drawLine(79+GOS_X,127+GOS_Y,(79+c4_LeftTooth2X)+GOS_X,(127+c4_LeftTooth2Y)+GOS_Y);
			m4_LeftTooth2 = (9.0/17.0) * c4_LeftTooth2Y;
			c4_LeftTooth2X = (int)m4_LeftTooth2;
			c4_LeftTooth2Y++;
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i4_LeftTooth3 = 0; i4_LeftTooth3 <= 19; i4_LeftTooth3++)
		{
			gfx.drawLine(88+GOS_X,144+GOS_Y,(88-i4_LeftTooth3)+GOS_X,144+GOS_Y);
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		int c4_RightTooth1X = 0, c4_RightTooth1Y = 0; double m4_RightTooth1 = 0.0;
		for (int i4_RightTooth1 = 0; i4_RightTooth1 <=17; i4_RightTooth1++)
		{
			// x_length = 9, y_length = 17
			gfx.drawLine(168+GOS_X,144+GOS_Y,(168+c4_RightTooth1X)+GOS_X,(144-c4_RightTooth1Y)+GOS_Y);
			m4_RightTooth1 = (9.0/17.0) * c4_RightTooth1Y;
			c4_RightTooth1X = (int)m4_RightTooth1;
			c4_RightTooth1Y++;
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		int c4_RightTooth2X = 0, c4_RightTooth2Y = 0; double m4_RightTooth2 = 0.0;
		for (int i4_RightTooth2 = 0; i4_RightTooth2 <=17; i4_RightTooth2++)
		{
			// x_length = 9, y_length = 17
			gfx.drawLine(178+GOS_X,127+GOS_Y,187+GOS_X,144+GOS_Y);
			m4_RightTooth2 = (9.0/17.0) * c4_RightTooth2Y;
			c4_RightTooth2X = (int)m4_RightTooth2;
			c4_RightTooth1Y++;
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i4_RightTooth3 = 0; i4_RightTooth3 <= 19; i4_RightTooth3++)
		{
			gfx.drawLine(187+GOS_X,144+GOS_Y,(187-i4_RightTooth3)+GOS_X,144+GOS_Y);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		
		// Fill Layer 4
		for (int i4_FillLeftEye = 0; i4_FillLeftEye <= 360; i4_FillLeftEye++)
		{
			gfx.fillArc(88+GOS_X,74+GOS_Y,24,40,0,i4_FillLeftEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i4_FillRightEye = 0; i4_FillRightEye <= 360; i4_FillRightEye++)
		{
			gfx.fillArc(144+GOS_X,74+GOS_Y,24,40,0,i4_FillRightEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i4_FillLeftTooth1 = 0; i4_FillLeftTooth1 <=9; i4_FillLeftTooth1++)
		{
			gfx.drawLine((69+i4_FillLeftTooth1)+GOS_X,144+GOS_Y,78+GOS_X,127+GOS_Y);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i4_FillLeftTooth2 = 0; i4_FillLeftTooth2 <=9; i4_FillLeftTooth2++)
		{
			gfx.drawLine(79+GOS_X,127+GOS_Y,(79+i4_FillLeftTooth2)+GOS_X,144+GOS_Y);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i4_FillRightTooth1 = 0; i4_FillRightTooth1 <=9; i4_FillRightTooth1++)
		{
			gfx.drawLine((168+i4_FillRightTooth1)+GOS_X,144+GOS_Y,177+GOS_X,127+GOS_Y);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i4_FillRightTooth2 = 0; i4_FillRightTooth2 <=9; i4_FillRightTooth2++)
		{
			gfx.drawLine(178+GOS_X,127+GOS_Y,(178+i4_FillRightTooth2)+GOS_X,144+GOS_Y);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		
		// Layer 5
		gfx.setColor(Color.BLACK);
		for (int i5_LeftEye = 0; i5_LeftEye <= 360; i5_LeftEye++)
		{
			gfx.drawArc(99+GOS_X,86+GOS_Y,10,20,0,i5_LeftEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i5_RightEye = 0; i5_RightEye <= 360; i5_RightEye++)
		{
			gfx.drawArc(147+GOS_X,86+GOS_Y,10,20,0,i5_RightEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		
		// Fill Layer 5
		for (int i5_FillLeftEye = 0; i5_FillLeftEye <= 360; i5_FillLeftEye++)
		{
			gfx.fillArc(99+GOS_X,86+GOS_Y,10,20,0,i5_FillLeftEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i5_FillRightEye = 0; i5_FillRightEye <= 360; i5_FillRightEye++)
		{
			gfx.fillArc(147+GOS_X,86+GOS_Y,10,20,0,i5_FillRightEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		
		// Layer 6
		gfx.setColor(Color.WHITE);
		for (int i6_LeftEye = 0; i6_LeftEye <= 360; i6_LeftEye++)
		{
			gfx.drawArc(105+GOS_X,90+GOS_Y,2,4,0,i6_LeftEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i6_RightEye = 0; i6_RightEye <= 360; i6_RightEye++)
		{
			gfx.drawArc(149+GOS_X,90+GOS_Y,2,4,0,i6_RightEye);
		}
		
		// Fill Layer 6
		for (int i6_FillLeftEye = 0; i6_FillLeftEye <= 360; i6_FillLeftEye++)
		{
			gfx.fillArc(105+GOS_X,90+GOS_Y,2,4,0,i6_FillLeftEye);
			
			try{Thread.sleep(delay);} catch (Exception e){}
		}
		for (int i6_FillRightEye = 0; i6_FillRightEye <= 360; i6_FillRightEye++)
		{
			gfx.fillArc(149+GOS_X,90+GOS_Y,2,4,0,i6_FillRightEye);
		}
		
		//gfx.setColor(Color.RED); // Arc Stop Color
		//gfx.drawLine(58+GOS_X,67+GOS_Y,195+GOS_X,67+GOS_Y); // Arc Stop Checker
	}
	
	public static void main (String[]args)
	{
		GoombaSimplifiedDraw frm = new GoombaSimplifiedDraw();
		//frm.setUndecorated(true);
		frm.setVisible(true);
		frm.setSize(300,350);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setTitle("Java Goomba Simplified Draw Live");
		frm.setResizable(false);
	}
}