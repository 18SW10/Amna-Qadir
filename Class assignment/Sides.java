import java.lang.Math;
class Sides{
public double hyp,perp,base;
Sides(double hyp,double perp,double base){
this.hyp=hyp;
this.perp=perp;
this.base=base;
}
Sides(double hyp,double perp,double base){
	hyp=0;
	perp=0;
	base=0;
	}
public double getHyp(double perp,double base){
this.hyp=Math.sqrt(Math.pow(base,2)+Math.pow(perp,2));
return hyp;
}
public double getPerp(double hyp,double base){
this.perp=Math.sqrt(Math.pow(hyp,2)-Math.pow(base,2));
return perp;
}
public double getBase(double perp,double base){
this.base=Math.sqrt(Math.pow(hyp,2)-Math.pow(perp,2));
return base;
}
}