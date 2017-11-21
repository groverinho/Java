var n = parseInt(readline());
var sum = 0, max1 = 0,  max2 = 0;
var array1 = readline().split(' ');
var array2 = readline().split(' ');
for (var i = 0; i < n; i++) {
	array2[i]= parseInt(array2[i]);
	array1[i]= parseInt(array1[i]);
}
for (var i = 0; i < n; i++) {
	sum += array1[i];
	if (array2[i] > max1) {
		max2 = max1;
		max1 = array2[i];
	} else if (array2[i] > max2) {
		max2 = array2[i];
	}
}
if (sum > max1 + max2) {
	print('NO');
} else {
	print('YES');
}
