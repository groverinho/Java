var n = readline();
var array =[];
for(var i =0; i<n; i++){
array.push(readline());
}

for(var i =0; i<n; i++){
   var flag=false;
   for (var j =0; j<i; j++){	
   	if(array[j]===array[i]){
   		flag = true;
   	}
   }
   //print((flag):"YES"?"NO");
   if(flag === true)
   	print("YES");
   else
   	print("NO");
}
