package serviceImpl;

import service.Position;
import java.util.HashMap;


public class EmplService {
 private static HashMap<Enum<Position>,Double> salaryPosition = new HashMap<Enum<Position>,Double>(){{
  put(Position.DEVELOPER,3000.0);
  put(Position.MANAGER,60000.0);
  put(Position.ADMINISTRATION,70000.0);
 }};

 static public double salaryCalculation(Enum<Position> positionEnum){
 return salaryPosition.get(positionEnum) ;
}
}
