// array1 = readline().split(" ").map(function(x) { return parseInt(x); });
var array1 = [];  
var matriz = [];  
for(var i =0; i<5; i++){
    array1 = readline().split(" ");
     matriz[ i ] = [];
     var k=0;
    for(var j =0; j<5; j++){
	matriz[i][j] = array1[k];
	 //print(matriz[i][j]);
	 k++;
    }
}
var indexI, indexJ;
for(var i =0; i<5; i++){
    for(var j =0; j<5; j++){
    	if(matriz[i][j]==="1"){
		indexI=i+1;
		indexJ=j+1;
	//	print("entro");
    	}
    }
}
for(var i =0; i<5; i++){
    for(var j =0; j<5; j++){
   // print(matriz[i][j]);
    }}
//print(indexI+ " "+ indexJ);
    	print((Math.abs(3-indexI))+(Math.abs(3-indexJ)));

/*
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
1 1 1 1 1
*/
