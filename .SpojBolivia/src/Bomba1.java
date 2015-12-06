import java.util.*;
 class Bomba1 {
	static final int MAX = 100;	
	static char ady[][] = new char[ MAX ][ MAX ];
	static class Estado
	{
	    int x , y , d;
	    
	    public Estado( int x1, int y1 , int d1){
	        this.x = x1;
	        this.y = y1;
	        this.d = d1;
	    }
	};
	public static String BFS( int x , int y , int h , int w,char caracter )
	{ 
		boolean visitado[][] = new boolean[ MAX ][ MAX ];
		Queue<Estado> Q = new LinkedList<Estado>();	
		Q.add( new Estado( x , y , 0 ) );
		int dx[  ] = { 0 ,  0 , 1 , -1 };
		int dy[  ] = { 1 , -1 , 0 ,  0 };
		int nx , ny;
		while( !Q.isEmpty() )
		{	
			Estado actual = Q.remove();	
			if( ady[ actual.x ][ actual.y ] == caracter )
				return actual.d+" "+actual.x+" "+actual.y ;	
			visitado[ actual.x ][ actual.y ] = true;
			
			for( int i = 0 ; i < 4 ; ++i )
			{				
				nx = dx[ i ] + actual.x;	
				ny = dy[ i ] + actual.y;			
				if( nx >= 0 && nx < h && ny >= 0 && ny < w && !visitado[ nx ][ ny ] && ady[ nx ][ ny ] != 'x' )
					Q.add( new Estado( nx , ny , actual.d + 1 ) );
			}
		}
		return "-1";
	}	
public static void main(String[] args) 
{
		int h , w , x = 0 , y = 0;
		Scanner sc = new Scanner( System.in );
		h =10; 
		w =10;
		for (int i = 0; i < h ; ++i ) 
		{
			String line = sc.next();
			for( int j = 0 ; j < w ; ++j )
			{
				ady[ i ][ j ] = line.charAt( j );
			    if( ady[ i ][ j ] == 'm' )
			    {		
			    	x = i; y = j;
			    }
			}
		}
		String resultA = BFS( x , y , h , w ,'k');
		String []vector = resultA.split(" ");
		int d = Integer.parseInt(vector[0]);
		int nuevox = Integer.parseInt(vector[1]);
		int nuevoy = Integer.parseInt(vector[2]);
		String resultB = BFS(nuevox, nuevoy, h, w,'e');
		vector=resultB.split(" ");
		d += Integer.parseInt(vector[0]);
		nuevox = Integer.parseInt(vector[1]);
		nuevoy = Integer.parseInt(vector[2]);
		System.out.println(d);	
	}
}
