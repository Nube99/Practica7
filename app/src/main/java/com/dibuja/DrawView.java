package com.dibuja;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;

public class DrawView extends View {
	Paint paint = new Paint();

	public DrawView(Context context) {
		super(context);
	}

	@Override
	public void onDraw(Canvas canvas) {
	   //.drawRect(left, top, right, bottom, paint)
        paint.setColor(Color.BLACK);
		canvas.drawRect(30, 30, 80, 80, paint);
	    paint.setColor(Color.MAGENTA);
		canvas.drawRect(33, 60, 77, 77, paint);
		paint.setColor(Color.YELLOW);
		canvas.drawRect(33, 33, 77, 60, paint);
		
		//.drawCircle(cx, cy, radius, paint);
		paint.setColor(Color.RED);
		canvas.drawCircle(100, 100, 20, paint);
		
		//.drawText(text, x, y, paint)
		canvas.drawText("Texto con CANVAS", 200, 30, paint);
		
		//.drawLine(startX, startY, stopX, stopY, paint)
        paint.setColor(Color.BLUE);
        canvas.drawLine(0, 0, 350, 100, paint);

		paint.setColor(Color.MAGENTA);
		paint.setStrokeWidth(4);
		canvas.drawLine(180, 160, 200, 160, paint);
		canvas.drawLine(200,160,220,180,paint);
		canvas.drawLine(220, 180, 220, 200, paint);
		canvas.drawLine(220, 200, 200, 220, paint);
		canvas.drawLine(200, 220, 180, 220, paint);
		canvas.drawLine(180, 220, 160, 200, paint);
		canvas.drawLine(160, 200, 160, 180, paint);
		canvas.drawLine(160, 180, 180, 160, paint);


		paint.setColor(Color.YELLOW);
	    paint.setStrokeWidth(4);
		/*canvas.drawLine(350, 160, 375, 210 , paint);
		canvas.drawLine(350, 160, 325, 210 , paint);
		canvas.drawLine(325, 210, 375, 210 , paint);//25*50
		canvas.drawLine(375,210,425,210,paint);
		canvas.drawLine(425,210,400,260,paint);
		canvas.drawLine(400,260,4,310,paint);
		canvas.drawLine(425,310,365,290,paint);//350
		 canvas.drawLine(365,290,325,320,paint);*/
		canvas.drawLine(350, 160, 375, 210 , paint);
		canvas.drawLine(350, 160, 325, 210 , paint);
		canvas.drawLine(325, 210, 275, 210 , paint);//25*50
		canvas.drawLine(275, 210, 300, 250 , paint);
		canvas.drawLine(300, 250, 290, 310 , paint);
		canvas.drawLine(290, 310, 350, 275 , paint);
		canvas.drawLine(375,210,425,210,paint);
		canvas.drawLine(425,210,400,250,paint);
		canvas.drawLine(400,250,410,310,paint);
		canvas.drawLine(410,310,350,275,paint);//350

		paint.setColor(Color.BLACK);
		Path trazo1 = new Path();
		paint.setStrokeWidth(1);
		trazo1.addCircle(150, 450, 100, Path.Direction.CCW);
		Path c = new Path();
		c.addCircle(600, 350, 50, Path.Direction.CCW);
		c.addCircle(800, 350, 50, Path.Direction.CCW);
		paint.setStrokeWidth(5);
		paint.setStyle(Paint.Style.STROKE);
		canvas.drawPath(c, paint);
		Paint dibujar = new Paint();
		RectF rectF = new RectF(600, 295, 790, 420);
		dibujar.setColor(Color.BLUE);
		dibujar.setStrokeWidth(2);
		dibujar.setStyle(Paint.Style.STROKE);
		canvas.drawArc (rectF, 30, 110, false, dibujar);
		paint.setStrokeWidth(1);
		paint.setStyle(Paint.Style.FILL);
		paint.setTextSize(10);
		paint.setTypeface(Typeface.SANS_SERIF);
		canvas.drawTextOnPath("Aguilar Cervantes Nubia 6IM7 ",c,100, 40, paint);
		Paint p2 = new Paint();
		RectF rectF2 = new RectF(600, 270, 790, 390);
		p2.setColor(Color.BLUE);
		p2.setStrokeWidth(2);
		p2.setStyle(Paint.Style.STROKE);
		canvas.drawArc (rectF2, 210, 120, false, p2);






		Path trazo = new Path();
        trazo.addCircle(150, 450, 100, Path.Direction.CCW);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Cecyt 9 \"Juan de Dios Bátiz\" graficos en Android ", trazo, 150, 40, paint);




	}

}
