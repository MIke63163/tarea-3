

public class Matematico{
    public String ordenar( int x, int y, int z){
    String reporte;
    if(x > y ){
       if(x >= z){
          if(y > z){
             reporte = x + "Mayor" + "-" + y + "Medio" + "-" + z + "Menor";
            }else{
                  reporte = x + "Mayor" + "-" + z + "Medio" + "-" + y + "Menor";
                 }
          }else{
                reporte = z + "Mayor" + "-" + x + "Medio" + "-" + y + "Menor";
               }
       }else{
             if(y >= z){
                if(z > x){
                   reporte = y + "Mayor" + "-" + z + "Medio" + "-" + x + "Menor";
                }else{
                      reporte = y + "Mayor" + "-" + x + "Medio" + "-" + z + "Menor";
                     }
             }else{
                   reporte = z + "Mayor" + "-" + y + "Medio" + "-" + x + "Menor";
                }   
             }
    return reporte;    
    }
    public double calcArea(double base, double altura){
     return base * altura;
    } 
    public String cuadrante(double x, double y){
    String reporte;
    if(x == 0 && y == 0){
        reporte = "En el origen";
       }else{
             if(x > 0 && y > 0){
                reporte = "1er Cuadrante";
                }else{
                      if(x < 0 && y > 0){
                         reporte = "2do Cuadrante";
                        }else{
                              if(x < 0 && y < 0){
                                 reporte = "3er Cuadrante";
                                }else{
                                      reporte = "4to Cuadrante";
                                }
                        }
                }
        }
    return reporte;   
    }
    public String decirEc2doGr(int a, int b, int c){
     String reporte;
     Calculadora ca;
     ca      = new Calculadora();
     reporte = ca.ecua2dogr(a,b,c);
     return reporte;
    
    }
    public String decirEcRec(double x1, double x2, double y1, double y2){
     String reporte;
     Calculadora c;
     c       = new Calculadora();
     reporte = c.ecRecta(x1,y1,x2,y2);
     return reporte;
    }
    public double decirCatFaltante(double hipotenusa, double cateto){
     double res;
     Calculadora c;
     c   = new Calculadora();
     res = c.catFaltante(hipotenusa,cateto);
     return res;
    }
}
