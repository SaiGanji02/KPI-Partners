#!/bi/bash

arr= ()
while read -r line;
do
	arr+=("$(echo "$line")")
done<sample.txt
for i in "${arr[@]}"
do 
	echo "$i"
done
