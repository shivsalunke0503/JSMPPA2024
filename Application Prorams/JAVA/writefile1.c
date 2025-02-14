#include<stdio.h>
#include<fcntl.h> //file control
#include<unistd.h> //universal standards
#include<string.h>
int main()
{
    int fd =0;
    char Arr[]="\nwelcomt to PPA activity progrram";

    int Ret =0;
    fd = open("jsm.txt",O_RDWR | O_APPEND);
    Ret = write(fd,Arr,strlen(Arr));//(kontya file madhe, kay lihayach, kiti lihayach)

    printf("%d bytes successfully written in the file\n",Ret);

    close(fd);
return 0;
}