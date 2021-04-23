

public class Calculadora{
    public String ecua2dogr(int a, int b, int c){
    String reporte;    
    double i;
    double x1;
    double x2;
    double r;
    
    
    i = Math.pow(b,2) - 4 * a * c;
    if(i >= 0){
       x1 = (-b  + (Math.sqrt(i)) ) / (2 * a);
       x2 = (-b  - (Math.sqrt(i)) ) / (2 * a);
       reporte = "" + x1 + "," + "" + x2;
       }else{
             x1 =  + ((Math.sqrt(-i)) / (2 * a));
             x2 =  - ((Math.sqrt(-i)) / (2 * a));
             r  =  (double)(-b) / (2 * a);
             reporte =  r + "+" + x1 + "i" +  "," + r + "" + x2 + "i";
       }
    return reporte ;
    }
    public String ecRecta(double x1, double y1, double x2, double y2){
     double a;
     double b;
     double c;
     String reporte;
     a = y2 - y1;
     b = x1 - x2;
     c = -(a * x1) + ((x2 - x1) * y1);
     if(a >= 0){
        if(b >= 0){
           reporte = a + "x" + "+" + b + "y" + c +"" + "=" + "0";
           if(c >= 0){
              reporte = a + "x" + "+" + b + "y" + "+" + c +"" + "=" + "0";
             }else{
                   reporte = a + "x" + "+" + b + "y" + c +"" + "=" + "0";
           }
          }else{
                reporte = a + "x" + b + "y" + c +"" + "=" + "0";
                if(c >= 0){
                   reporte = a + "x" + b + "y" + "+" + c +"" + "=" + "0";
                  }else{
                        reporte = a + "x" + b + "y" + c +"" + "=" + "0";
                }
        }
       }else{
             a = -a;
             b = -b;
             c = -c;
             if(b >= 0){
                reporte = a + "x" + "+" + b + "y" + c +"" + "=" + "0";
                if(c >= 0){
                   reporte = a + "x" + "+" + b + "y" + "+" + c +"" + "=" + "0";
                   }else{
                         reporte = a + "x" + "+" + b + "y" + c +"" + "=" + "0";
                }
               }else{
                     reporte = a + "x" + b + "y" + c +"" + "=" + "0";
                     if(c >= 0){
                        reporte = a + "x" + b + "y" + "+" + c +"" + "=" + "0";
                       }else{
                             reporte = a + "x" + b + "y" + c +"" + "=" + "0";
                     }
             }
     }
    return reporte; 
    }
    public double catFaltante(double hip, double cat){
     return Math.sqrt(Math.pow(hip,2) - Math.pow(cat,2));
    }
}
