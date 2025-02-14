#include<stdio.h>
#include<fcntl.h> //file control
#include<unistd.h> //universal standards
int main()
{
    int fd =0;
    fd = open("jsm.txt",O_RDWR); //or fd = open("jsm.txt",2);


    if(fd!=-1)
    {
        printf("file successfully opened with fd : %d \n",fd);
    }
    
    close(fd);
    return 0;
}