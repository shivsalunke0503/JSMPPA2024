#include<stdio.h>
int arr_length(int arr[])
{
	int i;
	int count = 0;
	for(i=0; arr[i]!='\0'; i++)
	{
		count++;
	}
	return count;
}

int main()
{
    int Arr[]={10,20,30,40,50};
    printf("Base Address of Arr : %d \n",Arr);
    printf("Base Address of Arr[0] : %d \n",&Arr[0]);
    printf("Base Address of Arr[1] : %d \n",&Arr[1]);
    printf("Base Address of Arr[2] : %d \n",&Arr[2]);
    printf("Base Address of Arr[3] : %d \n",&Arr[3]);
    printf("Element at index 4 : %d \n",Arr[4]);
    printf("Size of Whole arr is : %d \n",sizeof(Arr));
    printf("Size of  array element : %d \n",sizeof(Arr[2]));

    int lenghtOfArray = (sizeof(Arr) / sizeof(Arr[2]));
    printf("Length of Array is : %d \n", lenghtOfArray);


    int Brr[2] = {1,2};
    printf("element at index 2 : %d \n",Brr[5]); // No provision in c/c++ for Index out of bounds

    // int Crr[2] = {1,2,3,4,5}; // compiler will warn us 
    // printf("element at index 2 : %d \n",Brr[5]);

// length of Array using Loops
int lengthArr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

int lengthusingLoop = arr_length(lengthArr);
printf("lenght using loop : %d \n",lengthusingLoop);
    
    return 0;
}