package com.braco96.algoritmosestructuras.dp._01_robot_in_grid;
import org.javatuples.Pair;
import org.javatuples.Tuple;
import java.util.List;

/*
 * Un robot está en la esquina superior izquierda (0,0) de un tablero m x n. En el tablero hay celdas
 * transitables (true) y no transitables (false). Encuentra un camino válido para ir a la esquina
 * inferior izquierda con el robot, sabiendo que solo se puede mover hacia abajo y hacia la derecha.
 *
 * Ejemplo 1:
 *  Input:
 *    [
 *      [true,true,true,true]
 *      [false,false,false,true]
 *      [true,true,false,true]
 *      [true,true,false,true]
 *    ]
 *
 *  Output: [(0,0), (0,1), (0,2), (0,3), (1,3), (2,3), (3,3)]
 *
 * Ejemplo 2:
 *  Input:
 *    [
 *      [true,true,true,true]
 *      [false,true,true,true]
 *      [true,true,false,false]
 *      [true,true,true,true]
 *    ]
 *
 *  Output: [(0,0), (0,1), (1,1), (2,1), (3,1), (3,2), (3,3)]
 *
 */
public class RobotInGrid {
   int capa =0;
   int conjaristas;
   List<Pair<String, String>> tupla ;
  void getPath(boolean[][] grid,int n) {
      if (n==0){
          //producto  de un array de boobleanos tiene que ser true
          for (boolean valor : grid[0] ){
            if(!valor){
                throw new RuntimeException();
            }
          }
      }
      else{

      }

  }
}
