import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Dijsktra
{
	//static final int MAX = 499500;  //maximo numero de v?rtices

	///UNION-FIND
	static int padre[];  //Este arreglo contiene el padre del i-esimo nodo

	//M?todo de inicializaci?n
	static void MakeSet( int n )
	{
	    for( int i = 1 ; i <= n ; ++i ) 
	    	padre[ i ] = i;
	}
	//Variable que lee las coordenadas
	static double [][] coordenadas;
	static boolean [][] puentesAdyacentes;
	static int contador=1;

	//M?todo para encontrar la raiz del v?rtice actual X
	static int Find( int x )
	{
	    return ( x == padre[ x ] ) ? x : ( padre[ x ] = Find( padre[ x ] ) );
	}

	//M?todo para unir 2 componentes conexas
	static void Union( int x , int y )
	{
	    padre[ Find( x ) ] = Find( y );
	}

	//M?todo que me determina si 2 v?rtices estan o no en la misma componente conexa
	static boolean sameComponent( int x , int y )
	{
	    if( Find( x ) == Find( y ) ) return true;
	    return false;
	}
	///FIN UNION-FIND

	static int V , E;      //numero de vertices y aristas
	
	//Estructura arista( edge )
	
	static class Edge implements Comparator<Edge>
	{
	    int origen;     //V?rtice origen
	    int destino;    //V?rtice destino
	    double peso;       //Peso entre el v?rtice origen y destino
	    Edge(){}
	    //Comparador por peso, me servira al momento de ordenar lo realizara en orden ascendente
	    //Ordenar de forma descendente para obtener el arbol de expansion maxima
		@Override
		public int compare(Edge e1 , Edge e2 ) 
		{
			//return e2.peso - e1.peso; //Arbol de expansion maxima
			return (int) (e1.peso - e2.peso);   //Arbol de expansion minima
		}
	};
	
	static Edge arista[];      //Arreglo de aristas para el uso en kruskal
	static Edge MST[];     //Arreglo de aristas del MST encontrado

	static void KruskalMST()
	{
	    int origen , destino;
	    double peso;
	    int maximo = 0;
	    double total = 0;          //Peso total del MST
	    int numAristas = 0;     //Numero de Aristas del MST
	    
	    MakeSet( V );           //Inicializamos cada componente
	    Arrays.sort( arista , 0 , E , new Edge() );    //Ordenamos las aristas por su comparador

	    for( int i = 0 ; i < E ; ++i )
	    {     //Recorremos las aristas ya ordenadas por peso
	        origen = arista[ i ].origen;    //V?rtice origen de la arista actual
	        destino = arista[ i ].destino;  //V?rtice destino de la arista actual
	        peso = arista[ i ].peso;        //Peso de la arista actual

	        //Verificamos si estan o no en la misma componente conexa
	        if( !sameComponent( origen , destino ) )
	        {  //Evito ciclos
	            total += peso;              //Incremento el peso total del MST
	            MST[ numAristas++ ] = arista[ i ];  //Agrego al MST la arista actual
	            Union( origen , destino );  //Union de ambas componentes en una sola
	        }
	    }

	    //Si el MST encontrado no posee todos los v?rtices mostramos mensaje de error
	    //Para saber si contiene o no todos los v?rtices basta con que el numero
	    //de aristas sea igual al numero de vertices - 1
	    if( V - 1 != numAristas )
	    {
	        System.out.println("No existe MST valido para el grafo ingresado, el grafo debe ser conexo.");
	        //return;
	    }
	    for( int i = numAristas-1 ; i >= 0 ; --i )
	    {
	    	if(!puentesAdyacentes[MST[i].origen][MST[i].destino])
	    	{
	    		maximo =(int) MST[ i ].peso;
	    		break;
	    	}
	    }
        System.out.printf("Caso %d: %d\n",contador,maximo);
	}

	public static double calculaDistancia(int i, int j)
	{
		double valorX = Math.pow(coordenadas[i][0]-coordenadas[j][0],2);
		double valorY = Math.pow(coordenadas[i][1]-coordenadas[j][1],2);
		return(Math.sqrt(valorX+valorY));
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner( System.in );	   
		//para lectura de datos
		int NC = sc.nextInt();
		do
		{
			V = sc.nextInt();
			//DEDUCIMOS E COMO LA SUMA DE LOS N-1 NATURALES
			E = V*(V-1)/2;
			padre = new int[E+1];
			arista = new Edge[E+1];
			MST = new Edge[E+1];
			//SE CARGAN LAS POSICIONES X,Y DE LAS V CIUDADES
			coordenadas = new double[V][2];
			puentesAdyacentes = new boolean[V][V];
			 for( int i = 0 ; i < V ; ++i )
			 {
				 String a = sc.next();
				 String b = sc.next();
				 coordenadas[i][0]=Double.parseDouble(a);
				 coordenadas[i][1]=Double.parseDouble(b);
			 }
			//Se lee el valor de M para verificar las M conexiones aun existentes
			int M = sc.nextInt();
			for(int h=0 ; h<M ; ++h)
			{
			  	int origen = sc.nextInt();
			   	int destino = sc.nextInt();
			   	puentesAdyacentes[origen-1][destino-1]=true;
			   	puentesAdyacentes[destino-1][origen-1]=true;
			} 
			//SE CARGAN LAS ARISTAS O EJES DEL GRAFO CON LAS DISTANCIAS DE LAS COORDENADAS INGRESADAS
			int indice = 0;
		    for( int i = 0 ; i < V ; ++i )
		    	for( int j = i+1 ; j < V ; ++j )
			    {
			        arista[ indice ] = new Edge();
			    	arista[ indice ].origen = i;
			        arista[ indice ].destino = j;
			        if(puentesAdyacentes[i][j])
			        	arista[ indice ].peso = 0;
			        else
			        	arista[ indice ].peso = calculaDistancia(i, j);
			        //arista[ i ] = new Arista( sc.nextInt() , );
			        indice++;
			    }
		  
		    KruskalMST();
		    //se aumenta el contador
		    contador++;
		    //se decrementa los casos de prueba
		    NC--;
		}while (NC>0);    
	}
}